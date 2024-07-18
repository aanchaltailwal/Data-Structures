package Functions;

import java.util.Scanner;

public class ques2 {
	public static int productOftwoNum(int a, int b) {
		int product = a * b;
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int product = productOftwoNum(a, b);
		System.out.println(product);
		
		

	}

}
