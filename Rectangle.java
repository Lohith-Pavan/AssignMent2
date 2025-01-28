package JavaAssignment2;
abstract class Shape2D{
	abstract void draw();
	abstract void resize(double factor);
}
class Circle1 extends Shape2D{
	double r;
	Circle1(double r){
		this.r=r;
	}
	@Override
    void draw() {
    	System.out.println("Drawing a circle with radius "+r);
    }
	@Override
    void resize(double factor) {
    	r*=factor;
    	System.out.println("Circle resized to new radius "+r);
    }

}
class Rectangle extends Shape2D{
	double width;
	double height;
	Rectangle(double width,double height){
		this.height=height;
		this.width=width;
	}
	@Override
    void draw() {
    	System.out.println("Drawing a rectangle with width "+width+" and height "+height);
    }
	@Override
    void resize(double factor) {
    	width*=factor;
    	height*=factor;
    	System.out.println("Rectangle resized to new width "+width+" and height "+height);
    }
    public static void main(String args[]) {
    	Shape2D c = new Circle1(5);
    	c.draw();
    	c.resize(2);
    	c.draw();
    	Shape2D r = new Rectangle(10,5);
    	r.draw();
    	r.resize(2);
    	r.draw();
    }
}