package recursionpractice;

public class printsum {
	
	public static int calcsum(int n) {
		if(n==0) {
			return 0;
		}
		int no =n+ (calcsum(n-1));
		return no;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		System.out.print(calcsum(n));

	}

}
