package recursionpractice;

public class callguest {
	
	public static int calguests(int n) {
		if(n<=1) {
			return 1;
		}
		
		int ways1 = calguests(n-1);
		int ways2 = (n-1) * calguests(n-2);
		return ways1+ways2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 2;
		System.out.println(calguests(n));

	}

}
