package Recursion;

public class factorialOfN {
	public static int printFactorial(int n) {
		if(n == 1 || n ==0) {
			return 1;
		}
		int fact = printFactorial(n-1);
		int factorial = n * fact;
		return factorial;
		
		
	}

	public static void main(String[] args) {
		int n =5;
		int ans = printFactorial(n);
		System.out.println(ans);
	}

}
