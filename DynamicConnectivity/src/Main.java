public class Main {
	public static void main(String [] args) {
		QuickUnion qu= new QuickUnion(5);
		
		qu.union(0, 3);
		qu.union(3, 1);
		qu.union(1, 4);
		System.out.println("Quick Find, Slow: ");
		System.out.println(qu.connected(0, 2));
		System.out.println(qu.connected(1, 4));
		System.out.println(qu.connected(0, 4));
		
		System.out.println();
		System.out.println("Quick Union, Faster than Quick Find: ");
		QuickFind qf= new QuickFind(5);
		
		qf.union(1, 3);
		qf.union(4, 1);
		qf.union(1, 2);
		
		System.out.println(qf.connected(0, 2));
		System.out.println(qf.connected(1, 4));
		System.out.println(qf.connected(0, 4));
		
		System.out.println();
		System.out.println("Weighted Quick Union, Faster than both: ");
		WeightedQuickUnion wqu= new WeightedQuickUnion(5);
		
		wqu.union(1, 3);
		wqu.union(4, 1);
		wqu.union(1, 2);
		
		System.out.println(wqu.connected(0, 2));
		System.out.println(wqu.connected(1, 4));
		System.out.println(wqu.connected(0, 4));
		
		System.out.println("Weighted Quick Union with Path Compression, Fastest: ");
		WQUPC wqupc= new WQUPC(5);
		
		wqupc.union(1, 3);
		wqupc.union(4, 1);
		wqupc.union(1, 2);
		
		System.out.println(wqupc.connected(0, 2));
		System.out.println(wqupc.connected(1, 4));
		System.out.println(wqupc.connected(0, 4));
		
	}
}

