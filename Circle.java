package JavaAssignment2;
abstract class shape{
	abstract double calculateArea();
	abstract double calculatePerimeter();
}
class Triangle extends shape{
	double s1;
	double s2;
	double s3;
	Triangle(double s1,double s2,double s3){
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
    @Override
    double calculateArea() {
    	double s = (s1+s2+s3)/2;
    	return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    double calculatePerimeter() {
    	return s1+s2+s3;
    }
}
class Circle extends shape{
    double r;
    Circle(double r){
    	this.r=r;
    }
    @Override
    double calculateArea() {
    	return Math.PI*r*r;
    }
    @Override
    double calculatePerimeter() {
    	return 2*Math.PI*r;
    }
    public static void main(String args[]) {
    	shape c = new Circle(5);
    	System.out.println("Circle:");
    	System.out.println("Area = "+c.calculateArea());
    	System.out.println("Perimeter = "+c.calculatePerimeter());
    	shape t = new Triangle(3,4,5);
    	System.out.println("Triangle:");
    	System.out.println("Area = "+t.calculateArea());
    	System.out.println("Perimeter = "+t.calculatePerimeter());
    }
}
