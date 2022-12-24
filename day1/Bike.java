package week1.day1;

public class Bike {
public void startBike() {
	System.out.println("Bike started");
}
private void speedUp() {
	System.out.println("Speed is increased");
}
	public static void main(String[] args) {
		Bike bk =new Bike();
		Car cr =new Car();
		bk.startBike();
		bk.speedUp();
		cr.applyBreak();
        cr.soundHorn();
	}

}
