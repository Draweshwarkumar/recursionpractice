package recursionpractice;

public class checksorted {
	
	public static boolean checksort(int input[]) {
		if(input.length<=1) {
			return true;
		}
		
		int smallinput[] = new int[input.length-1] ;
		for(int i=1;i<input.length;i++) {
			smallinput[i-1]=input[i];
		}
		boolean smallans = checksort(smallinput);
		if(!smallans) {
			return false;
		}
		if(input[0]<=input[1]) {
			return true;
		}
		else {
			return false;
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2,2,3,4,5,6};
		System.out.println(checksort(input));

	}

}
