package recursionpractice;

public class fibonaccino {
	
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int ans = fib(n-1) + fib(n-2);
		return ans ;
	}
	
	public static void main (String [] args) {
		int n=5;
		fib(n);
		System.out.print(fib(n));
		
	}
}
