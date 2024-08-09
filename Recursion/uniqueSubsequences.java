package Recursion;
import java.util.HashSet;

public class uniqueSubsequences {
	public static void uniqueSub(String str, int idx, String newString, HashSet<String> set) {
		if(idx == str.length()) {
			if(set.contains(newString)) {
				return;
			}else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
			
		}
		char currChar = str.charAt(idx);   //recursion 
		//now this currChar has two choices
		//to be
		uniqueSub(str, idx+1, newString + currChar, set);
		//not to be
		uniqueSub(str, idx+1, newString, set);
	}
	public static void main(String [] args) {
		String str = "aaa";
		HashSet<String> set = new HashSet<>(); //hashset od string type
		uniqueSub(str, 0, "", set);
	}

}
