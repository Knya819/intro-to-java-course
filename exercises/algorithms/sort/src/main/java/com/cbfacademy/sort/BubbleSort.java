package com.cbfacademy.sort;

public class BubbleSort implements ArraySorter {
    //@Override
    public void sort(int[] arr, int startIndex, int endIndex) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortMethods.swap(arr, j, j + 1); // here I'm calling the swap method from Swap class
                    swapped = true;
                }
            }
            
            // If no elements were swapped during the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
