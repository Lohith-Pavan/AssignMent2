package JavaAssignment2;
class Reservation {
    int resId;
    String cusName;
    String date;
    Reservation(int resId,String cusName,String date){
    	this.resId=resId;
    	this.cusName=cusName;
    	this.date=date;
    }
    void checkStatus() {
    	System.out.println("Reservation ID: "+resId+" is confirmed");
    }
    void modifyReservation(String cusName,String date) {
    	this.cusName=cusName;
    	this.date=date;
    	System.out.println("Reservation details updated");
    }
    void display() {
    	System.out.println("Reservation ID: "+resId);
    	System.out.println("Customer Name: "+cusName);
    	System.out.println("Date: "+date);
    }
}  
class ResortReservation extends Reservation{
	int roomNumber;
	ResortReservation(int resId,String cusName,String date,int roomNumber){
		super(resId,cusName,date);
		this.roomNumber=roomNumber;
	}
	void display() {
		super.display();
		System.out.println("Room Number: "+roomNumber);	
	}
	void modifyRoom(int roomNumber) {
		this.roomNumber = roomNumber;
		System.out.println("Room number updated to "+roomNumber);
	}
}
class RailwayReservation extends Reservation{
	String seatNumber;
	RailwayReservation(int resId,String cusName,String date,String seatNumber){
		super(resId,cusName,date);
		this.seatNumber=seatNumber;
	}
	
	void display() {
		super.display();
		System.out.println("Seat Number: "+seatNumber);
	}
	void modifySeat(String seatNumber) {
		this.seatNumber=seatNumber;
		System.out.println("Seat Number updated to "+seatNumber);
	}
	public static void main(String args[]) {
		ResortReservation resres = new ResortReservation(101,"Lohith","27-01-2025",305);
		System.out.println("Resort Reservation Details:");
		resres.display();
		resres.checkStatus();
		resres.modifyReservation("Pavan","29-01-2025");
		resres.modifyRoom(307);
		resres.display();
		System.out.println();
		System.out.println("Railway Reservation Details:");
		RailwayReservation raires = new RailwayReservation(202,"Bharath","01-02-2025","A1-12");
		raires.display();
		raires.checkStatus();
		raires.modifyReservation("kumar","04-02-2025");
		raires.modifySeat("A1-17");
		raires.display();
	}
}
