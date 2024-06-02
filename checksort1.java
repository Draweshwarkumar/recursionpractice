package recursionpractice;

public class checksort1 {
	
	public static boolean issorted(int input[],int idx) {
		if(idx==input.length-1) {
			return true;
		}
		if(input[idx]>=input[idx+1]) {
			return false;
		}
		return issorted(input,idx+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {12,18,24,46,75,76};
		System.out.print(issorted(input,0));

	}

}
