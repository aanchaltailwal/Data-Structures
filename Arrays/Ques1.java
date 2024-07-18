package Arrays;

import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int size = sc.nextInt();
        
        // Create an array of the given size
        int[] numbers = new int[size];
        
        // Read the value of x
        int x = sc.nextInt();
        
        // Input the elements of the array
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Check if x is found in the array and print its index
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("We found x at index " + i);

            }
        }
  
        
     
    }
}
