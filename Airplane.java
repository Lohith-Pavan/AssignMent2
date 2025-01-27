package JavaAssignment2;

public class Airplane {
     String flightNumber;
     String destination;
     String depatureTime;
     boolean delayed;
     Airplane(String flightNumber,String destination,String depatureTime){
    	 this.flightNumber = flightNumber;
    	 this.destination = destination;
    	 this.depatureTime = depatureTime;
    	 this.delayed = false;
     }
     void flightStatus() {
    	 if(delayed) {
    		 System.out.println("Flight "+flightNumber+ " to "+destination+" is delayed");
    	 }
    	 else {   		 
    		 System.out.println("Flight "+flightNumber+ " to "+destination+" is On Time");
    	 }
     }
     void delayFlight(String newdepaturetime) {
    	 this.delayed = true;
    	 this.depatureTime = newdepaturetime;
    	 System.out.println("Flight "+flightNumber+ " to "+destination+" has been delayed. New depature time "+depatureTime);
     }
     public String toString() {
    	 return "Flight Number = " + flightNumber + "\nDestination = " + destination+ "\ndepatureTime = "+
         depatureTime + " \nStatus = "+(delayed? "delayed": "On Time") ;
     }
     public static void main(String args[]) {
    	 Airplane flight1 = new Airplane("A1A2","canada","10:00 AM");
    	 System.out.println(flight1.toString());
    	 flight1.flightStatus();
    	 flight1.delayFlight("12:30 PM");
    	 flight1.flightStatus();
    	 System.out.println(flight1.toString());
    	 
     }
}
