package week1.day1;

public class Mobile {
public  void makeCall(String mobileName,float mobileWeight) {
	System.out.println("Call is connecting");
	System.out.println(mobileName);
	System.out.println(mobileWeight);
	}
public  void sendMsg(boolean isFullCharged,int mobileCost) {
	System.out.println("Message is sent");
	System.out.println(isFullCharged);
	System.out.println(mobileCost);
}
public  static void  main(String[] args) {
	Mobile mb=new Mobile();
	mb.makeCall("Oneplus", 0.174f);
	mb.sendMsg(true,25000);
	System.out.println("This is my Mobile");
}
}
