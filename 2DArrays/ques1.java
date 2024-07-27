package _2DArrays;

import java.util.*;
public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int[][] array = new int[rows][columns];
		
		//inputs rows
		for(int i =0; i <rows; i++) {
		//columns
			for(int j =0; j<columns; j++) {
				array[i][j] = sc.nextInt();
				}
			}
		System.out.println("Enter x");
		int x = sc.nextInt();
		for(int i =0; i <rows; i++) {
			for(int j =0; j<columns; j++) {
				//compare with x
				if(array[i][j] == x) {
					System.out.println("x is found at location (" + i + ", " + j + ")");
				}
				}
			}
		
		

	}

}
