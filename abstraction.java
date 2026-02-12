//1st

abstract class Plane{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}
class CargoPlane extends Plane{
	void takeOff() {
		System.out.println("CargoPlane is takeoff");
	}
	@Override
	void fly() {
		System.out.println("CargoPlane is flying in low height");
	}
	void land() {
		System.out.println("CargoPlane is landing");
	}
}
class PassengerPlane extends Plane{
	void takeOff() {
		System.out.println("PassengerPlane is takeoff");}
	void fly() {
		System.out.println("PassengerPlane is flying in average height");}
	void land() {
		System.out.println("PassengerPlane is landing");}
}

class FighterPlane extends Plane{
	void takeOff() {
		System.out.println("FighterPlane is takeoff");}
	void fly() {
		System.out.println("FighterPlane is flying in higher height");}
	void land() {
		System.out.println("FighterPlane is landing");}
}
class Airport{
	void travel(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class Alphaa {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport a = new Airport();
		a.travel(cp);
		a.travel(pp);
		a.travel(fp);	
	}
}
