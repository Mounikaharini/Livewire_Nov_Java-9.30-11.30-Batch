package CollectionsTopic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTypes {

	public static void main(String[] args) {
		
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(11);
		s.add(15);
		s.add(12);
		s.add(14);
		s.add(13);
		s.add(12);
		
		for(int i : s) {
			System.out.println(i);
		}
		
		
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		s.add(11);
		s.add(15);
		s.add(12);
		s.add(14);
		s.add(13);
		s.add(12);
		
		for(int i : s) {
			System.out.println(i);
		}
		
		TreeSet<Integer> s = new TreeSet<Integer>();
		s.add(11);
		s.add(15);
		s.add(12);
		s.add(14);
		s.add(13);
		s.add(12);
		
		/*if you are using object type data - treeset return 
		some error because it don't have any order to sort*/
		
		HashSet<Object> l = new HashSet<Object>();
		l.add(10);
		l.add("hi");
		l.add(10.9);
		l.add('m');
		l.add(true);
		System.out.println(l);
		
		for(int i : s) {
			System.out.println(i);
		}

	}

}
