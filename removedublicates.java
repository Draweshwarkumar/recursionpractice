package recursionpractice;

public class removedublicates {

   public static boolean[] map = new boolean[26];
   public static void removeduplicate(String str,int indx,String newString) {
	   if(indx == str.length()) {
		   System.out.print(newString);
		   return;
	   }
	   
	   char currchar = str.charAt(indx);
	   if(map[currchar-'a']) {
		   removeduplicate(str,indx+1,newString);
	   }
	   else {
		   newString += currchar;
		   map[currchar - 'a'] = true;
		   removeduplicate(str,indx+1,newString);
	   }
    }

    public static void main(String[] args) {
        String str = "draweshwar";
        removeduplicate(str,0,"");
    }
}
