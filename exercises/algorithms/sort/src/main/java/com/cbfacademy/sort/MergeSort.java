package com.cbfacademy.sort;

public class MergeSort implements ArraySorter {
   // @Override //why do i need this?
    public void sort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;

            sort(arr, startIndex, midIndex);
            sort(arr, midIndex + 1, endIndex);

            Merge.merge(arr, startIndex, midIndex, endIndex);
        }
    }
}
