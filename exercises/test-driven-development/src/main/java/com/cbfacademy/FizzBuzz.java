package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
   // For a single number
   public static String get(Integer i) {
      if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
      else if (i % 3 == 0) return "Fizz";
      else if (i % 5 == 0) return "Buzz";
      else return i.toString();
  }

   // For a list of numbers
   public List<String> fizzBuzz(List<Integer> numbers) {
       List<String> result = new ArrayList<>();
       for (Integer i : numbers) {
           result.add(get(i));
       }
       return result;
   }

   
}
