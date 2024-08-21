package com.cbfacademy;

public class FizzBuzz {

    public static Object get(Integer i) {
     // return (i%3 == 0) ? "Fizz" : Integer.toString(i);
     if (i%3 == 0) {
        return "Fizz";
     } else if (i%5 == 0) {
     return "Buzz";
     }
     else {
        return Integer.toString(i);
     }
  }

}
