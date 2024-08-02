package Recursion;

public class towerOfHanoi {
	public static void towerHanoi(int n, String src, String helper, String dest) {
		if(n == 1) {                           //base case
			System.out.println("Transfer disk" +" " + n + " " + "from" + " " + src +" " + "to" + " " + dest);
			return;
		}
		towerHanoi(n-1, src, dest, helper);            //recursion
		System.out.println("Transfer disk" +" " + n + " " + "from" + " " + src +" " + "to" + " " + dest);
		towerHanoi(n-1, helper, src, dest);
	}

	public static void main(String[] args) {
		int n = 3;
		towerHanoi(n, "S", "H", "D");

	}

}
