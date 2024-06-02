package recursionpractice;

public class xtopowern {
	
	public static int calcxn(int x,int n){
		if(x==0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		int res=x*(calcxn(x,n-1));
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = calcxn(2,5);
		System.out.print(result);

	}

}
