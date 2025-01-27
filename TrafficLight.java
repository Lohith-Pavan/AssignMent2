package JavaAssignment2;

public class TrafficLight {
    String color;
    int duration;
    TrafficLight(String color,int duration){
    	this.color = color;
    	this.duration = duration;
    }
    void changeColor(String newColor,int newDuration) {
    	this.color = newColor;
    	this.duration = newDuration;
    	System.out.println("Changing the traffic light...");
    	System.out.println("Traffic light changed to "+color+" for "+duration+" seconds.");
    }
    boolean isRed() {
    	return color.equals("red");
    }
    boolean isGreen() {
    	return color.equals("green");
    }
    void display() {
    	System.out.println("Current Traffic Light Color: "+ color);
    	System.out.println("Duration: "+duration+ " seconds"); 	
    }
    public static void main(String args[]) {
    	TrafficLight status = new TrafficLight("red",30);
    	System.out.println("Initial Traffic Light Status:");
    	status.display();
    	System.out.println("Is the light red? "+status.isRed());
    	status.changeColor("green", 45);
    	System.out.println("Updated Traffic Light Status:");
    	status.display();
    	System.out.println("Is the light green? "+status.isGreen());
    } 
}
