package JavaAssignment2;

public class EmployeeStatus1 {
   String empName;
   int salary;
   int hireYear;
   EmployeeStatus1( String empName,int salary,int hireYear){
	   this.empName = empName;
	   this.salary = salary;
	   this.hireYear = hireYear;
   }
   int calculateYearsOfService(int currentYear) {
	   return currentYear - hireYear;
   }
   void display(int currentYear) {
	   System.out.println("Name = " + empName);
	   System.out.println("Salary = $" + salary);
	   System.out.println("Hire Year = " + hireYear);
	   System.out.println("Years of Service = " + calculateYearsOfService(currentYear));
   }
   public static void main(String args[]) {
	   TemporaryEmployee tempemp = new TemporaryEmployee("Lohith Pavan",5000,2022,12);
	   PermanentEmployee peremp = new PermanentEmployee("RGV",6000,2012,10);
	   System.out.println("Temporary Employee Details:");
	   tempemp.display(2024);
	   System.out.println("Permanent Employee Details:");
	   peremp.display(2024);
   }
}
class TemporaryEmployee extends EmployeeStatus1 {
	int contractDuration;
	TemporaryEmployee(String empName,int salary,int hireYear,int contractDuration){
		super(empName, salary, hireYear);
		this.contractDuration = contractDuration;
	}
	@Override
	void display(int currentYear) {
		super.display(currentYear);
		System.out.println("Contract Duration = " + contractDuration + " Months");
	}
}
class PermanentEmployee extends EmployeeStatus1 {
	int bonusPercentage;
	PermanentEmployee(String empName,int salary,int hireYear,int bonusPercentage){
		super(empName, salary, hireYear);
		this.bonusPercentage = bonusPercentage;
	}
	@Override
	void display(int currentYear) {
		super.display(currentYear);
		System.out.println("Bonus Percentage = " + bonusPercentage + "%");
	}
}
