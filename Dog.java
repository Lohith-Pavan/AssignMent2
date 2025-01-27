package JavaAssignment2;

public class Dog {
	String name;
    String breed;
    Dog (String name,String breed){
    	this.name = name;
    	this.breed = breed;
    }
    void setName(String name,String breed) {
    	this.name = name;
    	this.breed = breed;
    }
    void display() {
    	System.out.println("Name = "+name);    	
    	System.out.println("Breed = "+breed);    	
    }
    public static void main(String args[]) {
    	Dog ob1 = new Dog("Remo","Labrador");
    	ob1.display();
    	ob1.setName("Snoopy","Dobermann");
    	ob1.display();
    	
    	
    	
    	
    	
    }
}
