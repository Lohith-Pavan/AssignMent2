package JavaAssignment2;
class BankAccount{
	int accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(int accountNumber,String accountHolderName,double balance){
  	  this.accountHolderName = accountHolderName;
  	  this.accountNumber = accountNumber;
  	  this.balance = balance;
    }
    void deposit(double deposit) {
    	if(deposit > 0) {
    		balance+=deposit;
    	  	  System.out.println("Deposited: ₹"+deposit+" New Balance = ₹"+balance);
    	}
    	else {
    		System.out.println("Deposit amount must be positive");
    	}
    }
    void withdraw(double withdraw) {
    	if(withdraw > 0) {
    		 balance-=withdraw;
    	  	  System.out.println("Withdrawn: ₹"+withdraw+" Remaining Balance = ₹"+balance);
    	}
    	else if (withdraw > balance) {
    		System.out.println("Insufficient Balance");
    	}
    	else {
    		System.out.println("Withdrawl amount must be positive");
    	}
    }
    double checkBalance() {
  	    return balance;
    }
    void display() {
  	  System.out.println("Account Number = " + accountNumber);
  	  System.out.println("Account Holder Name = " + accountHolderName);
  	  System.out.println("Balance = ₹" + balance);
    }
}
class SavingsAccount extends BankAccount{
	double interestRate;
	SavingsAccount(int accountNumber,String accountHolderName,int balance,double interestRate){
		super(accountNumber,accountHolderName,balance);
		this.interestRate = interestRate;
	}
	void applyInterest() {
		double interest = (checkBalance()*interestRate)/100;
		deposit(interest);
		System.out.println("Interest of ₹"+interest+" applied at a rate of "+interestRate+"%");
	}
}
public class CustomerAccount {
      public static void main(String args[]) {
    	  BankAccount cus1 = new BankAccount(123456789,"Lohith Pavan",25000);
    	  System.out.println("Customer Bank Account Details:");
    	  cus1.display();
    	  System.out.println("Performing Transactions:");
    	  cus1.deposit(1000);
    	  cus1.withdraw(500);
    	  System.out.println("Current Balance : ₹"+cus1.checkBalance());
    	  System.out.println("Customer Savings Account Details:"); 	  
    	  SavingsAccount cussav1 = new SavingsAccount(987654321,"Lohith Pavan",50000,5);
    	  cussav1.display();
    	  cussav1.applyInterest();
    	  System.out.println("Performing Transactions:");
    	  cussav1.deposit(1000);
    	  cussav1.withdraw(500);
    	  System.out.println("Current Balance : ₹"+cussav1.checkBalance());
    	  
      }
}
