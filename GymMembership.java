package JavaAssignment2;
class BasicMembership{
	String memName;
	String memType;
	int duration;
	BasicMembership(String memName,String memType,int duration){
		this.memName=memName;
		this.memType=memType;
		this.duration=duration;
	}
	double calculateFees() {
		double baseFee = 800.0;
		switch(memType.toLowerCase()) {
		case "standard":
			baseFee = 1000.0;
			break;
		case "premium":
			baseFee = 1500.0;
			break;
		}
		return baseFee*duration;
	}
	void checkSpecialOffers() {
		if(duration >= 12) {
			System.out.println("Special offer: you get 1 month free for 12-months duration");
		}
		else {
			System.out.println("NO special offers available for this duration");
		}
	}
	void display() {
		System.out.println("Member Name: "+memName);
		System.out.println("Membership Type: "+memType);
		System.out.println("Duration: "+duration+" months");
	}
}
class PremiumMembership extends BasicMembership {
     boolean personalTrainer;
     boolean spaAccess;
     PremiumMembership(String memName,String memType,int duration,boolean personalTrainer,boolean spaAccess){
    	 super(memName, memType, duration);
    	 this.personalTrainer = personalTrainer;
    	 this.spaAccess = spaAccess;
     }
     double calculateFees() {
    	 double premBaseFee = super.calculateFees();
    	 if(personalTrainer) {
    		 premBaseFee+=(500.0*duration);
    	 }
    	 if(spaAccess) {
    		 premBaseFee+=(500.0*duration);
    	 }
         return premBaseFee;
     }
     void display() {
    	 super.display();
    	 System.out.println("Personal Trainer: "+(personalTrainer?"Available":"Not Available"));
    	 System.out.println("Spa Access: "+(spaAccess?"Available":"Not Available"));
     }
}
class GymMembership{
	public static void main(String args[]) {
		System.out.println("Gym Membership Details:");
		System.out.println();
		System.out.println("Basic Membership Details:");
		BasicMembership bm = new BasicMembership("Lohith","basic",4);
		bm.display();
		System.out.println("Total Fee: "+bm.calculateFees());
		bm.checkSpecialOffers();
		System.out.println();
		System.out.println("Premium Membership Details:");
		PremiumMembership pm = new PremiumMembership("Pavan","premium",12,true,true);
		pm.display();
		System.out.println("Total Fee: "+pm.calculateFees());
		pm.checkSpecialOffers();
	}
}
