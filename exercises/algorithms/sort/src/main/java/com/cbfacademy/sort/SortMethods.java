package com.cbfacademy.sort;

public class SortMethods {
    public static int partition(int arr[], int startIndex, int endIndex){
        int pivot = arr[endIndex];
        int boundaryIndex = startIndex - 1;
        for (int i = startIndex; i < endIndex; i ++){
            if (arr[i] <= pivot){
                 boundaryIndex = boundaryIndex + 1;
                swap(arr, boundaryIndex, i);
            }
        }
        swap(arr, boundaryIndex + 1, endIndex);
        return boundaryIndex + 1;
    }

    public static void swap(int[] arr, int leftIndex, int rightIndex){
        int temp = arr[leftIndex];
         arr[leftIndex] = arr[rightIndex];
         arr[rightIndex] = temp;
  }


  public static void merge(int[] arr, int startIndex, int midIndex, int endIndex) {
    // Calculate the sizes of the two subarrays
    int n1 = midIndex - startIndex + 1;
    int n2 = endIndex - midIndex;

    // Create temporary arrays
    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    // Copy data to temporary arrays
    for (int i = 0; i < n1; ++i) {
        leftArray[i] = arr[startIndex + i];
    }
    for (int j = 0; j < n2; ++j) {
        rightArray[j] = arr[midIndex + 1 + j];
    }

    // Merge the temporary arrays back into arr[startIndex..endIndex]
    int i = 0, j = 0; // Initial indices of left and right subarrays
    int k = startIndex; // Initial index of merged subarray

    while (i < n1 && j < n2) {
        if (leftArray[i] <= rightArray[j]) {
            arr[k] = leftArray[i];
            i++;
        } else {
            arr[k] = rightArray[j];
            j++;
        }
        k++;
    }

    // Copy remaining elements of leftArray[] if any
    while (i < n1) {
        arr[k] = leftArray[i];
        i++;
        k++;
    }

    // Copy remaining elements of rightArray[] if any
    while (j < n2) {
        arr[k] = rightArray[j];
        j++;
        k++;
    }
}


}
