package recursionpractice;

public class printno {
	
	public static void  printno(int n) {
		if(n==0) {
			return ;
		}
		System.out.print(n+" ");
		  printno(n-1);
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		printno(n);

	}

}
