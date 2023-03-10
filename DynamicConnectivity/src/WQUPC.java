//lg* n, lg* n (union and find) initialize n
public class WQUPC {
	int [] id;
	int [] sz;
	WQUPC(int n){
		id= new int [n];
		sz= new int [n];
		for(int i=0; i<n; i++) {
			id[i]=i;
			sz[i]=i;
		}
	}
	private int root(int i) {
		while(i!=id[i]) {
			id[i]=id[id[i]];
			i=id[i];
		}
		return i;
	}
	public boolean connected(int p,int q) {
		return root(p)==root(q);
	}
	public void union(int p, int q) {
		int i=root(p);
		int j=root(q);
		if(i==j) return;
		if(sz[i]<sz[j]) {
			id[i]=j;
			sz[j]+=sz[i];
		}
		else {
			id[j]=i;
			sz[i]+=sz[j];
		}
	}
}
