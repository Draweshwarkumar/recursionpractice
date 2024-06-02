package recursionpractice;

public class reversestring {
	
	public static void reverse(String s,int indx) {
//		 indx =s.length()-1;
		if(indx==0) {
			System.out.print(s.charAt(indx));
			return;
		}
		System.out.print(s.charAt(indx));
		reverse(s,indx-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		int indx = s.length()-1;
		reverse(s,indx);

	}

}
