package Functions;

import java.util.*;
public class functions {
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		printMyName(name); //call to function

	}

}
