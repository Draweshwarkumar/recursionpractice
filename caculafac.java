package recursionpractice;

public class caculafac {
	public static int fact(int n) {
		if(n==0||n==1) {
			return n;
		}
		 int no= n*(fact(n-1));
		 return no;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = fact(5);
		System.out.print(factorial);

	}

}
