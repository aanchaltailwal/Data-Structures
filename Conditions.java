package DSA;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age < 18) {
			System.out.println("Child");
		}
		else {
			System.out.println("Adult");
			
		}
		

	}

}
