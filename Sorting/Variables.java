package Sorting;

public class bubbleSort {
	public static void printArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {7,8,3,1,2};
		
		//bubble Sort
		//it will go till n-1 as last element will be be sorted automatically
		for(int i=0; i < arr.length - 1; i++) {
			for(int j =0; j<arr.length-i-1; j++) {        //in 2nd loop n-i-1->-> 1st time no element is sorted
				if(arr[j] > arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		printArray(arr);

	}

}
