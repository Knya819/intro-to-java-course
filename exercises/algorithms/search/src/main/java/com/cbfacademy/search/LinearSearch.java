package com.cbfacademy.search;

public class LinearSearch implements Search  {
    //@Override
    public int search(int[] arr, int target){
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    // If the target is not found return -1
    return -1;
}

}
