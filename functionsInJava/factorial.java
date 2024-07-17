package Functions;

import java.util.Scanner;

public class factorial {
	public static void printFactorial(int n) {
		if(n <=0) {
			System.out.println("Invalid no.");
			return;
		}
		int factorial = 1;
		for(int i = n; i >=1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printFactorial(n);

	}

}
