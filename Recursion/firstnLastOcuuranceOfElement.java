package Recursion;

public class firstnLastOcuuranceOfElement {
	public static int first = -1;   //idx
	public static int last = -1;    //idx
	
	public static void findOccurance(String str, int idx, char element) {
		if(idx == str.length()) {        //base case
			System.out.println(first);
			System.out.println(last);
			return;
		}
		
		char currChar = str.charAt(idx);         //recursion
		if(currChar == element) {
			if(first == -1) {
				first = idx;
			}else {
				last = idx;
			}
		}
		findOccurance(str, idx + 1, element);
	}
	

	public static void main(String[] args) {
		String str = "abaacdaefaah";
		findOccurance(str, 0 , 'a');

	}

}
