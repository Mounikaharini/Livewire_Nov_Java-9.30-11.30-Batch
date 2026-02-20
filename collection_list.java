package CollectionsTopic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class ListTypes {
	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		System.out.println(a);
		
		for(int i : a) {
			System.out.println(i);
		}
		
		int sum =0;
		for(int i : a) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		for(int i : a) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		for(int i : a) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		a.removeFirst();
		System.out.println(a);
		a.removeLast();
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a size : ");
		int size1 = s.nextInt();
		
		System.out.println("Enter a number : ");
		
		for(int i =0;i<size1;i++) {
			a.add(s.nextInt());
		}
		System.out.println(a);
		
		System.out.println("Enter a size : ");
		int size2 = s.nextInt();
		
		System.out.println("Enter a number : ");
		
		for(int i =0;i<size2;i++) {
			a.add(s.nextInt());
		}
		System.out.println(a);
		ArrayList <Object> a = new ArrayList<Object>();
		a.add('a');
		a.add(10);
		a.add("Hi");
		a.add(10.369);
		a.add(true);
		System.out.println(a);
		
		for(Object i : a) {
			System.out.println(i);
		}
		
		LinkedList <Object> l = new LinkedList <Object>();
		l.addAll(a);
		System.out.println(l);

	}

}
