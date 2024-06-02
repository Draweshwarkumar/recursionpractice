package recursionpractice;

public class towerofhanoi {
	
	public static void Towerofhanoi(int n,String src,String help,String des) {
		if(n==1) {
			System.out.println("Transfer disk" + n + "from" + src + "to" + des);
			return;
		}
		Towerofhanoi(n-1,src,des,help);
		System.out.println("Transfer disk" + n + "from" + src + "to" + des);
		Towerofhanoi(n-1,help,src,des);
		
	}

	public static void main(String []args) {
		int n=5;
		Towerofhanoi(n,"S","H","D");
	}
}
