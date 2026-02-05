package Oops;
class Plane{
	void takeOff() {
		System.out.println("Plane is takeoff");
	}
	void fly() {
		System.out.println("Plane is Flying");
	}
	void land() {
		System.out.println("plane is landing");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("CargoPlane is flying in low height");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("PassengerPlane is flying in average height");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("FighterPlane is flying in higher height");
	}
}


public class OverridingPolymorphism {

	public static void main(String[] args) {
		Plane p = new Plane();
		p.takeOff();
		p.fly();
		p.land();
		
		CargoPlane cp = new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		
		PassengerPlane pp = new PassengerPlane();
		pp.takeOff();
		pp.fly();
		pp.land();
		
		FighterPlane fp = new FighterPlane();
		fp.takeOff();
		fp.fly();
		fp.land();

	}

}


/*

homework
Vehicle class
-> move method
-> wheels method
-> travelling mode method (land,water,air)

*/














