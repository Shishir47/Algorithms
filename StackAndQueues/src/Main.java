public class Main {

	public static void main(String[] args) {
		ArrayStack<Integer> st= new ArrayStack<>(5);
		st.push(5);
		st.push(3);
		st.clear();
		st.push(5);
		st.push(7);
		st.push(9);
		st.push(2);
		st.push(1);
		st.push(8);
		System.out.println(st.peek());
		
	}

}
