package DSA;

import java.util.Scanner;

public class tableOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int table = 0;
		for(int i=1; i<=10; i++) {
			table = n * i;
			System.out.println(table);
		}
		

	}

}
