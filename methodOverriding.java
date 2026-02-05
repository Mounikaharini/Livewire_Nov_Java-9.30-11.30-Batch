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
class Travel{
	void typesOfPlane(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class OverridingPolymorphism {

	public static void main(String[] args) {
		//tight coupling
//		Plane p = new Plane();
//		p.takeOff();
//		p.fly();
//		p.land();
//		
//		CargoPlane cp = new CargoPlane();
//		cp.takeOff();
//		cp.fly();
//		cp.land();
//		
//		PassengerPlane pp = new PassengerPlane();
//		pp.takeOff();
//		pp.fly();
//		pp.land();
//		
//		FighterPlane fp = new FighterPlane();
//		fp.takeOff();
//		fp.fly();
//		fp.land();
		
		
		//loose coupling
//		CargoPlane cp = new CargoPlane();
//		PassengerPlane pp = new PassengerPlane();
//		FighterPlane fp = new FighterPlane();
//		Plane ref;
//		ref=cp;
//		ref.takeOff();
//		ref.fly();
//		ref.land();
//		
//		ref=pp;
//		ref.takeOff();
//		ref.fly();
//		ref.land();
//		
//		ref=fp;
//		ref.takeOff();
//		ref.fly();
//		ref.land();
		
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		Travel t = new Travel();
		t.typesOfPlane(cp);
		t.typesOfPlane(pp);
		t.typesOfPlane(fp);

	}

}


/*


Vehicle class
-> move method
-> wheels method
-> travelling mode method (land,water,air)

*/

