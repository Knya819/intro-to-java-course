package com.cbfacademy.search;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Sorted Array is: ");
        int[] arr1 = new int[] {1,3,5,8,9,15,23};
        System.out.println(Arrays.toString(arr1));
        BinarySearch search1 = new BinarySearch();
        System.out.println("Target to search for is : 8");
        System.out.println("Target position is : " + search1.search(arr1, 8));
        System.out.println("");
        System.out.println("Target to search for is : 7");
        System.out.println("Target position is : " + search1.search(arr1, 7));
    }
}
