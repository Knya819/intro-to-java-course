package com.cbfacademy.sort;

public class QuickSort implements ArraySorter {
    public  void sort(int[] arr, int startIndex, int endIndex){
        if (startIndex < endIndex){
           int pivotIndex = partition(arr, startIndex, endIndex);
            sort(arr, startIndex, pivotIndex - 1);
            sort(arr, pivotIndex + 1, endIndex);
        }
    }

    private static int partition(int arr[], int startIndex, int endIndex){
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

    // We are given the input array, the position of the left-hand element and the position of the right-hand element
    public static void swap(int[] arr, int leftIndex, int rightIndex){
    // Store the value of the left-hand element
       int temp = arr[leftIndex];
    // Assign the value of the right-hand element to the left-hand element
        arr[leftIndex] = arr[rightIndex];
    // Assign the original value of the left-hand element to the right-hand element
        arr[rightIndex] = temp;
    }
}
