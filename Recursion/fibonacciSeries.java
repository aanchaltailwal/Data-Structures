package Recursion;

public class fibonacciSeries {
	public static void printFib(int a, int b, int n) {
		if(n == 0) {          // base condition
			return;
		}
		int c = a + b;
		System.out.println(c);    //print
		printFib(b, c, n-1); //recursion
		
		
	}

	public static void main(String[] args) {
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		int n =7;
		printFib(a, b, n-2);   //n-2 cauze a=0 & b=1 are already known

	}

}
