package com.cbfacademy;

public class Year { 
    public static boolean isLeap(long i) {
    if (i % 4 == 0 && i % 100 != 0) return true;
    if (i % 100 == 0 && i % 5 != 0) return false;
    else if (i % 400 == 0) return true;
    else return false;
    
    }

}
