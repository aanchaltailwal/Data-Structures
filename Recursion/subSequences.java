package Recursion;

public class subSequences {
	public static void subSequence(String str, int idx, String newString) {
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		
		
		char currChar = str.charAt(idx);   //recursion 
		//now this currChar has two choices
		//to be
		subSequence(str, idx+1, newString + currChar);
		//not to be
		subSequence(str, idx+1, newString);

	}

	public static void main(String[] args) {
		String str = "abc";
		subSequence(str, 0, " ");
		

	}

}
