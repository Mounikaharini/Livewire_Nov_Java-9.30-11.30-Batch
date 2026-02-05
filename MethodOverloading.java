package Oops;

public class polymorphism {
	void add(int a , int b) {
		System.out.println("method 1");
		System.out.println(a+b);
	}
	void add(int a , int b , int c) {
		System.out.println("method 2");
		System.out.println(a+b+c);
	}
	void add(int a , float b) {
		System.out.println("method 3");
		System.out.println(a+b);
	}
	void add(float a , float b) {
		System.out.println("method 4");
		System.out.println(a+b);
	}
	void add(double a , double b) {
		System.out.println("method 5");
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		polymorphism p = new polymorphism();
		p.add(78246.3485f,93498.435f);
		p.add(10,20.9);
	}

}
