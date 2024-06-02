package recursionpractice;

public class subsequences {
	
	public static void subsequences(String str,int indx,String newstring) {
		
		if(indx == str.length()) {
			System.out.println(newstring);
			return;
		}
		char currchar = str.charAt(indx);
		
		subsequences(str, indx+1 ,newstring+currchar);
		
		subsequences(str , indx+1 , newstring);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		subsequences(str,0,"");

	}

}
