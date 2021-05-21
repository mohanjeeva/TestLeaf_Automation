package week1.day1;

public class Mobile {
	
	static String mobileModel="MI Note 7 Pro";
	int mobileWeight=500;
	boolean isFullCharge=true;
	double mobileCost=13000;
	
	public void makeCall() {
		System.out.println("Make a call");
	}
	
	public void sendMsg() {
		System.out.println("Make a call");
	}

	public static void main(String[] args) {
		
		Mobile operation=new Mobile();
		operation.makeCall();
		operation.sendMsg();
		System.out.println(mobileModel);
		System.out.println(operation.mobileWeight);
		System.out.println(operation.isFullCharge);
		System.out.println(operation.mobileCost);
	}

}
