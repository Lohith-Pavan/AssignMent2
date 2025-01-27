package JavaAssignment2;

public class Person {
    String name;
    int age;
    Person(String name,int age){
    	this.name = name;
    	this.age = age;
    }
    void display() {
    	System.out.println("Name = "+name+"\nAge = "+age);
    }
    public static void main(String args[]) {
    	Person person1 = new Person("Lohith",21);
    	person1.display();
    }
}
