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
		
		for(int i : s) {
			System.out.println(i);
		}

	}

}
