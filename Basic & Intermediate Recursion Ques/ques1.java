package Recursion;

public class ques1 {
	public static void printNum(int n) {
		if(n == 0) {      //Base Condistion
			return;
		}
		System.out.println(n); //print
		printNum(n-1); //Recursion
	}

	public static void main(String[] args) {
		int n = 5;
		printNum(n);
		

	}

}

