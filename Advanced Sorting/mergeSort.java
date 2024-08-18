package AdvancedSorting;

public class mergeSort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // New array to store merged elements
        
        int idx1 = si;  // Index for the first subarray
        int idx2 = mid + 1; // Index for the second subarray
        int x = 0;    // Index for the merged array
        
        // Merge elements from both subarrays
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from the first subarray, if any
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from the second subarray, if any
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy the merged array back into the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) { 
        // Base case: if the array cannot be divided further
        if (si >= ei) {
            return;
        }
        
        int mid = si + (ei - si) / 2;   // Avoids overflow issues
        divide(arr, si, mid);   // Recursively divide the first half
        divide(arr, mid + 1, ei);  // Recursively divide the second half
        
        conquer(arr, si, mid, ei); // Merge the divided arrays
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n - 1);
        
        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
