package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        List<String> fizzBuzz = new ArrayList<>();
        for (Integer i : numbers) {
            //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
            if (i % 5 == 0 && i % 3 ==0)
            fizzBuzz.add("FizzBuzz");
            //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
            else if (i % 5 == 0)
                fizzBuzz.add("Buzz");
            //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
            else if (i % 3 == 0)
            fizzBuzz.add("Fizz");
            //  - it adds the element to the list in any other case
            else fizzBuzz.add(String.valueOf(i));   
        }
        //  - it returns the constructed list
        return fizzBuzz;
            //throw new RuntimeException("Not implemented");
    }
    

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        if (number >= 1 && number <= 12) {
        //  - it returns the month corresponding to the input ${number}
        String[] months = {
            "January", "February", "March", "April", 
            "May", "June", "July", "August", 
            "September", "October", "November", "December"
        };
        return months[number - 1];
    } else {
        // - if the ${number} is invalid, the method should return "Invalid month number"
        return "Invalid month number";
    }
             // throw new RuntimeException("Not implemented");
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i=1; i <=100; i ++){
            numbers.add(i);
        }
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        int SumOfEvens=0,SumOfOdds =0;
        for (int num : numbers){
            if (num % 2 ==0){
                SumOfEvens += num;
            }
            else {
                SumOfOdds += num;
            }
        }
      
        Map<String, Integer> resultMap = new HashMap<>() ;
        resultMap.put("SumOfEvens", SumOfEvens);
        resultMap.put("SumOfOdds", SumOfOdds);

        //  - returns a map with two entries:
        return resultMap;
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        //throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        List<Integer> numbersList = new ArrayList<>(numbers);
        //  - it returns the list in reverse order
        Collections.reverse(numbersList);
       // throw new RuntimeException("Not implemented");
       return numbersList;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}

//./mvnw clean test