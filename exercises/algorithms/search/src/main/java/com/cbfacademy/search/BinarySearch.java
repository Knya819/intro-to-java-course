package com.cbfacademy.search;


public class BinarySearch implements Search {
    //@Override
    public int search(int[] sortedArray, int target){
        
        int left = 0;
        int right = sortedArray.length -1;
        
        while (left <= right){
            int mid = left + (right-left)/2;

            if (sortedArray[mid] == target){
                return mid;
            }
            if (sortedArray[mid] < target){
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return -1 ;
    }
}
