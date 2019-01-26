package programs_java;

import java.util.LinkedList;

public class MiddleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		
		ll.add(2);
		ll.add(12);
		ll.add(13);
		ll.add(45);
		ll.add(54);
		ll.add(67);
		ll.add(42);
		ll.add(87);
		ll.add(21);
		
		System.out.println(ll.get(ll.size()/2));
	}

}
