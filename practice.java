package recursionpractice;

public class practice {
	
	public static void towerofhanoi(int n ,String src,String help,String des) {
		if(n==1) {
			System.out.println("Transfer disk" + n + "from" + src +"to"+ des);
			return;
		}
		towerofhanoi(n-1,src,des,help);
		System.out.println("Transfer disk" + n + "from" +src + "to" + des);
		towerofhanoi(n-1,help,src,des);
		
	}
	public static void main(String[] args) {
		int n=5;
		towerofhanoi(n,"S","H","D");
	}

}
