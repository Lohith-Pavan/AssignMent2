package JavaAssignment2;
class Vehicle{
	int id = 25;
	void drive() {
		System.out.println("Learning a car");
	}
}
class Car extends Vehicle{
    int id = 30;
    void drive() {
	System.out.println("Repairing a car");
	}
    public static void main(String args[]) {
    	Car ex = new Car();
        System.out.println(ex.id);
        ex.drive();
    }
}
