package JavaAssignment2;
class Employee4{
	void work() {
		System.out.println("Employee is working ");
	}
	int getSalary() {
		return 45000;
	}
}
class HRManager extends Employee4{
    void work() {
    	System.out.println("HRManger is working");
    }
    void addEmployee() {
    	System.out.println("A new employee is added");
    }
}
public class Main2 {
    public static void main(String args[]) {
    	Employee4 emp = new HRManager();
    	emp.work();
    	System.out.println(emp.getSalary());
    	HRManager hr = new HRManager();
    	hr.addEmployee();
    }
}
