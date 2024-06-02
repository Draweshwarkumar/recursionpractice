package recursionpractice;

public class findoccurrence {
	public static int first =-1;
	public static int last = -1;
	
	public static void findoccurrence(String str,int indx,char c) {
		if(indx == str.length()) {
			System.out.print(first+" ");
			System.out.print(last);
			return;
		}
		char currchar = str.charAt(indx);
		if(currchar == c) {
			if(first== -1) {
				first = indx;
				last = indx;
			}
			else {
				last = indx;
			}
		}
		findoccurrence(str,indx+1,c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "draweshwar";
		int indx = 0;
		char c ='a';
		findoccurrence(str,indx,c);
	}

}
