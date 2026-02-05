package Oops;
class Customer{
	private String name;
	private int pin;
	Customer(){
		System.out.println("This is the constructor");
	}
	Customer(String name, int pin) {
		this();
		System.out.println("This is the constructor 1 ");
		this.name=name;
		this.pin=pin;
	}
	Customer(int a){
		this();
		System.out.println("This is the constructor 2 ");
		System.out.println("hi");
	}
	String getName() {
		return name;
	}
	int getPin() {
		return pin;
	}
}
//static
// class Test{
// 	static int a,b;
// 	int c,d;
// 	static {System.out.println("static block");}
// 	{System.out.println("instance block");}
// 	static void fun1() {
// 		System.out.println("static method");
// 		System.out.println(a);
// 		System.out.println(b);}
// 	void fun2() {
// 		System.out.println("instance method");
// 	}
// }

public class ATM {
	public static void main(String[] args) {

		Customer c = new Customer("Mounika",1234);
		System.out.println(c.getName());
		System.out.println(c.getPin());
		Customer c1 = new Customer(1234);
	}

}
