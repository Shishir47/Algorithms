public class ArrayStack<Item> {
	private Item [] data;
	private int N=0;
	private int initialCapacity=0;
	
	public ArrayStack(int capacity) {
		initialCapacity=capacity;
		data= (Item[])new Object [capacity];
	}
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public int capacity() {
		return data.length;
	}
	public void clear() {
		data=(Item[]) new Object [initialCapacity];
		N=0;
	}
	public void push(Item item) {
		if(N==data.length) resize(2*data.length);
		data[N++]=item;
	}
	public Item pop() {
		Item item=data[--N];
		data[N]=null;
		if(N>0 && N==data.length/4) resize(data.length/2);
		return item;
	}
	public Item peek() {
		return data[N-1];
	}
	private void resize(int capacity) {
		Item [] copy= (Item[]) new Object [capacity];
		for(int i=0; i<N; i++) {
			copy[i]=data[i];
		}
		data=copy;
	}
}
