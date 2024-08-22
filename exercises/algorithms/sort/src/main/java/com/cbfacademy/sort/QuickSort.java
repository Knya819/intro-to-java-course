package com.cbfacademy.sort;

public class QuickSort implements ArraySorter {
    //@Override
    public  void sort(int[] arr, int startIndex, int endIndex){
        if (startIndex < endIndex){
           int pivotIndex = SortMethods.partition(arr, startIndex, endIndex);
            sort(arr, startIndex, pivotIndex - 1);
            sort(arr, pivotIndex + 1, endIndex);
        }
    }
}
