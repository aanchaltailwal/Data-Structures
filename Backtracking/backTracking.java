package Backtracking;

public class backTracking {
	public static void printPermutation(String str, String perm, int idx) {
		if(str.length() == 0) { //base case  -> when are string str has no element
			System.out.println(perm);
			return;
		}
		
		for(int i = 0; i<str.length();i++) {   //loop for whole string
			char currChar = str.charAt(i);          //after traversing whole string through loop will see which char should be in currChar
			String newStr = str.substring(0, i) + str.substring(i+1);//for next char remove currChar so that rest could sit there
			printPermutation(newStr, perm + currChar, idx+1); //call function
		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		printPermutation(str, "", 0);
		

	}

}
