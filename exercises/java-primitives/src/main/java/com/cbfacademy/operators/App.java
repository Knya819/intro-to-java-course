package com.cbfacademy.operators;

import java.lang.*;;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double add(double operand1, double operand2) {
        double somma = operand1 + operand2;
        return somma ;
    }

    public static double subtract(double operand1, double operand2) {
       double subtract = operand1 - operand2;
       return subtract ;
    }

    public static double multiply(double operand1, double operand2) {
       double multiply = operand1 * operand2;
       return multiply ;
    }

    public static Boolean areEqual(double operand1, double operand2) {
        boolean equality = operand1 == operand2;
        return equality;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
       return operand1 < operand2;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        return operand1 > operand2;
    }
}
