	An interface is a collection of pure abstract methods; inside an interface , 
you have only method with a signature without body.

Rules of interfaces
An interface is like a contract which when implemented helps to achieve standardization.
Interfaces promotes polymorphism.
Methods within an interface are automatically public and abstract.
Specialized methods cannot be accessed directly using interface type reference.
If a class partially implements an interface, it must declare itself as abstract.
A class can implements multiple interfaces because  the diamond shape problems does not exist as interfaces will not have parents.
An interface cannot implements another interface, because the interface cannot provide methods with bodies inside it.
An interface can extend another interface. Not only this it can inherit from multiple interfaces because the diamond shape problem does not exist.
A class can both extend another class as well as implements an interface. However, the order should be extend first and implemented later.
An interface can contain constant variables and method signatures. A variable within an interface is automatically public static final.
An empty interface in java is referred to as a Marker interface or Tagged interface. It is used to provide special properties to the object of the class.


//1st program
interface calc1{
	void add();
	void sub();}
class Mycalc implements calc1{
	@Override
	public void add() {
		int a = 30;
		int b = 20;
		System.out.println(a+b);}
	@Override
	public void sub() {
		int a = 30;
		int b = 20;
		System.out.println(a-b);
}}
public class Beta {
	public static void main(String[] args) {
		Mycalc m = new Mycalc();
		m.add();
		m.sub();
}}

//2nd program - multiple inheritance

interface calc1{
	void add();
	void sub();
}
interface calc2{
	void mul();
	void div();
}
class Mycalc implements calc1,calc2{
	@Override
	public void add() {
		int a = 30;
		int b = 20;
		System.out.println(a+b);
	}
	@Override
	public void sub() {
		int a = 30;
		int b = 20;
		System.out.println(a-b);	
	}
  	@Override
	public void mul() {
		int a = 30;
		int b = 20;
		System.out.println(a*b);
	}
	@Override
	public void div() {
		int a = 30;
		int b = 20;
		System.out.println(a/b);
	}	
}
public class Beta {
	public static void main(String[] args) {
		Mycalc m = new Mycalc();
		m.add();
		m.sub();
		m.mul();
		m.div();
	}
}
//3rd program - hybrid inheritance

interface calc1{
	void add();
	void sub();
}
interface calc2{
	void mul();
	void div();
}
interface calc3 extends calc2{
	void mod();
}
class Mycalc implements calc1,calc3{
	@Override
	public void add() {
		int a = 30;
		int b = 20;
		System.out.println(a+b);
	}
	@Override
	public void sub() {
		int a = 30;
		int b = 20;
		System.out.println(a-b);	
	}

  	@Override
	public void mul() {
		int a = 30;
		int b = 20;
		System.out.println(a*b);}
	@Override
	public void div() {
		int a = 30;
		int b = 20;
		System.out.println(a/b);}
	@Override
	public void mod() {
		int a = 30;
		int b = 20;
		System.out.println(a%b);
	}}
public class Beta {
	public static void main(String[] args) {
		Mycalc m = new Mycalc();
		m.add();
		m.sub();
		m.mul();
		m.div();
		m.mod();}}



