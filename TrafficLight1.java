package JavaAssignment2;

public class TrafficLight1 {
     String color = "red";
     int duration = 30;
     boolean isRed() {
    	 return color.equals("red");
     }
     boolean isGreen() {
    	 return color.equals("green");
     }
     void changeColor(String color) {
    	 this.color = color;
    	 System.out.println("Traffic light changed to "+color+".");
     }
     int getDuration() {
    	 return duration;
     }
     void setDuration(int duration) {
    	 this.duration = duration;
     }
     public static void main(String args[]) {
    	 TrafficLight1 light = new TrafficLight1();
    	 System.out.println("Is the light red? "+light.isRed());
    	 System.out.println("Is the light green? "+light.isGreen());
    	 light.changeColor("green");
    	 System.out.println("Is the light green? "+light.isGreen());
         System.out.println("Current duration: "+light.duration+" seconds.");
         light.setDuration(60);
         System.out.println("Duration updated to "+light.getDuration()+" seconds.");
         System.out.println("Updated duration: "+light.duration+" seconds.");  	 
     }
}
