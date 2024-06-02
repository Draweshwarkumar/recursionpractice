package recursionpractice;

public class placetiles {
	
	public static int placetile(int n,int m) {
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		
		int vertplacements = placetile(n-m,m);
		int horizontal = placetile(n-1,m);
		return vertplacements+horizontal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int m=2;
		System.out.println(placetile(n,m));

	}

}
