package recursionpractice;

public class permutation {
	
		public static void permutations(String str,String ans) {
			if(str.length()==0) {
				System.out.println(ans);
				return ;
			}
			
			for(int i=0;i<str.length();i++) {
				char curr  = str.charAt(i);
				String newstr = str.substring(0,i)+str.substring(i+1);
				permutations(newstr,ans+curr);
				
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		String ans = "";
		permutations(str,ans);
		
	}

}
