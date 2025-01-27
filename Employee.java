package JavaAssignment2;

public class Employee {
      String empName;
      String jobTitle;
      double salary;
      Employee(String empName,String jobTitle,double salary){
    	  this.empName = empName;
    	  this.jobTitle = jobTitle;
    	  this.salary = salary;
      }
      double annualSalary() {
    	  return salary*12;
      }
      void updateSalary(double percentage) {
    	  if(percentage>0) {
    		  double increment = salary*(percentage/100);
    		  salary+=increment;
    		  System.out.println("Salary Updated successfully. New Salary: "+ salary);
    	  }
      }
      public String toString() {
    	  return "Name: "+empName+"\nJob Title: "+jobTitle+"\nSalary: $"+salary;
      }
      public static void main(String args[]) {
    	  Employee emp1 = new Employee("Lohith Pavan","Software Engineer",5000);
    	  System.out.println("Employee Details:");
    	  System.out.println(emp1);
    	  System.out.println("Annual Salary: "+ emp1.annualSalary());
    	  emp1.updateSalary(10);
    	  System.out.println("Employee Details:");
    	  System.out.println(emp1);
    	  System.out.println("Annual Salary: "+ emp1.annualSalary());
      }
}
