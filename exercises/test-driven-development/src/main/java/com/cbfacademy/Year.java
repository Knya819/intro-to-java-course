package com.cbfacademy;

public class Year { 
    private static Integer year;

    public Year(Integer year){
        Year.year = year;
    }
    public static boolean isLeapYear() {
    if (year % 4 == 0 && year % 100 != 0) return true;
    else if (year % 100 == 0 && year % 400 != 0) return false;
    else if (year % 400 == 0) return true;
    else return false;
    
    }

}
