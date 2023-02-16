
public class LinkedListStack<Item> {
	private Node first=null;
	private int count=0;
	
	private class Node{
		Item item;
		Node next;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public void clear() {
		first=null;
		count=0;
	}
	public void push(Item item) {
		Node oldFirst=first;
		first= new Node();
		first.item=item;
		first.next=oldFirst;
		count++;
	}
	public Item pop() {
		Item item=first.item;
		first=first.next;
		count--;
		return item;
	}
	public Item peek() {
		return first.item;
	}
	
}
