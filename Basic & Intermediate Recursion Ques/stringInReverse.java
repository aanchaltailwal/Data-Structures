package Recursion;

public class stringInReverse {
	public static void printRev(String str, int idx) {
		if(idx == 0){                          //base case
			System.out.print(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx));    //print
		printRev(str, idx-1);                   //recursion
		
	}

	public static void main(String[] args) {
		String str = "abcd";
		printRev("abcd", str.length()-1);
	}
		      


}
