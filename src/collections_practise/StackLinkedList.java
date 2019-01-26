package collections_practise;

import java.util.LinkedList;

public class StackLinkedList<T> {
	private LinkedList<T> l;

	

	public StackLinkedList() {
		super();
		this.l = new LinkedList<T>();
	}

	public LinkedList<T> getL() {
		return (LinkedList<T>) l;
	}

	public void setL(LinkedList<T> l) {
		this.l = (LinkedList<T>) l;
	}
	
	public void pop()
	{
		l.removeLast();
	}
	
	public void push(T ele)
	{
		l.addLast(ele);
	}
	
	public T peek()
	{
		return (T) l.getLast();
	}
	
	public boolean isEmpty()
	{
		return l.isEmpty();
	}
	
	public int size()
	{
		return l.size();
	}
	
}
