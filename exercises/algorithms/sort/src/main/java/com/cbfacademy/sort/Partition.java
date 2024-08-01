package com.cbfacademy.sort;

public class Partition {
    public static int partition(int arr[], int startIndex, int endIndex){
        int pivot = arr[endIndex];
        int boundaryIndex = startIndex - 1;
        for (int i = startIndex; i < endIndex; i ++){
            if (arr[i] <= pivot){
                 boundaryIndex = boundaryIndex + 1;
                Swap.swap(arr, boundaryIndex, i);
            }
        }
        Swap.swap(arr, boundaryIndex + 1, endIndex);
        return boundaryIndex + 1;
    }
}
