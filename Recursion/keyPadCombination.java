package Recursion;

public class keyPadCombination {
	public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	
	public static void printComb(String str, int idx, String newComb) {
		if(idx == str.length()) {
			System.out.println(newComb);
			return;
		}
		char currChar = str.charAt(idx);   //for ex 2 from 23
		String mapping = keypad[currChar - '0'];
		
		for( int i = 0; i <mapping.length(); i++) {     //now loop for def 
			printComb(str, idx+1, newComb+mapping.charAt(i));   //1-> d, 2->e, 3->f
		}
	}

	public static void main(String[] args) {
		String str = "23";
		printComb(str, 0, "");
		

	}

}
