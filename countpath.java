package recursionpractice;

public class countpath {
		
		public static int counttotal(int i, int j, int m, int n) {
			if(i==m || j==n) {
				return 0;
			}
			if(i==m-1 && j==n-1){
				return 1;
			}
		int downpaths = counttotal(i+1,j,m,n);
		int rightpaths = counttotal(i,j+1,m,n);
		
		return downpaths+rightpaths;

	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=3;
			int m=3;
			int ans = counttotal(0,0,m,n);
			System.out.print(ans);
}
}