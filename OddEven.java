package DSA;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
