package CollectionsTopic;

import java.util.Stack;

public class StackStructure {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		for(int i : s) {
			System.out.println(i);
		}
		s.pop();
		for(int i : s) {
			System.out.println(i);
		}
		System.out.println(s.peek());
	}
}


package CollectionsTopic;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStructure {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q.peek());
		
		
	}

}

