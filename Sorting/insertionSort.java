package Sorting;

public class insertionSort {
	public static void printArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {7,8,3,1,2};
		
		//insertion sort
		for(int i = 1; i <arr.length; i++) {
			int current = arr[i]; //current of unsorted
			//to track sorted part we are using j
			int j = i - 1;  //sorted part last index
			while(j >= 0 && current < arr[j]) {  //making plac in sorted arr for new and smaaler no.
				arr[j+1] = arr[j];
				j--;
				
			}
			
			//placemnet
			arr[j+1] = current; //placing no. when condition met
		}
		printArray(arr);

	}

}
