package recursionpractice;

public class movextoend {
	
	public static void movetoend(String str,int indx,int count,char elem,String newstring) {
		if(indx == str.length()) {
			for(int i=0;i<count;i++) {
				newstring += elem;
			}
			System.out.print(newstring);
			return ;
		}
		char currchar = str.charAt(indx);
		if(currchar==elem) {
			count++;
			movetoend(str,indx+1,count,elem,newstring);
		}
		else {
			newstring += currchar;
			movetoend(str,indx+1,count,elem,newstring);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "0101010101";
		int indx = 0;
		int count =0;
		char elem = '1';
		String newstring = "";
		movetoend(str,indx,count,elem,newstring);

	}

}
