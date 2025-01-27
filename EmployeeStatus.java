package JavaAssignment2;

public class EmployeeStatus {
   String empName;
   double salary;
   int hireYear;
   int presentYear = 2025;
   int experience;
   EmployeeStatus(String empName,double salary,int hireYear){
	   this.empName = empName;
	   this.salary = salary;
	   this.hireYear = hireYear; 
   }
   void yearsOfService() {
	   this.experience = presentYear - hireYear;
   }
   void status() {
	   if (experience < 10) {
		   System.out.println("Status = Temporary Employee");
	   }
	   else {
		   System.out.println("Status = Permanent Employee");
	   }
   }
   void display() {
	   System.out.println("Employee name = "+ empName + "\nSalary = $" + salary + "\nHire Year = "+ hireYear + "\nExperience = "+ experience);
       yearsOfService();
	   status();
   }
   public static void main(String args[]) {
	   EmployeeStatus emp1 = new EmployeeStatus("Lohith Pavan",5000,2022);
	   emp1.yearsOfService();
	   emp1.display();
	   EmployeeStatus emp2 = new EmployeeStatus("sundhar",6000,2012);
	   emp2.yearsOfService();
	   emp2.display();
	   
   }
}
