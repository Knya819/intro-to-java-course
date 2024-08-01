package com.cbfacademy.sort;

public class Swap {
 public static void swap(int[] arr, int leftIndex, int rightIndex){
       int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
 }
}
