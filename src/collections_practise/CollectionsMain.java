package collections_practise;

public class CollectionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stack Implementation: ");
		StackLinkedList<Integer> stack=new StackLinkedList<Integer>();
		
		stack.push(2);
		stack.push(45);
		stack.push(5);
		stack.push(75);
		stack.push(3);
		stack.push(9);
		
		System.out.print(stack.getL());
		System.out.println();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.getL());
		System.out.println(stack.isEmpty());
		
	}

}
