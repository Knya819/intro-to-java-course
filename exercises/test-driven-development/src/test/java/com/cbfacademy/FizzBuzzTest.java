package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FizzBuzzTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();
        assertThat(app, is(notNullValue()));
    }

    // Single number tests
    static Stream<Arguments> singleNumberTests() {
        return Stream.of(
            Arguments.of(1, "1"),
            Arguments.of(3, "Fizz"),
            Arguments.of(5, "Buzz"),
            Arguments.of(15, "FizzBuzz"),
            Arguments.of(9, "Fizz"),
            Arguments.of(40, "Buzz")
        );
    }

    @ParameterizedTest
    @MethodSource("singleNumberTests")
    @DisplayName("Single number FizzBuzz")
    public void singleNumberFizzBuzz(Integer number, String expected) {
        String result = FizzBuzz.get(number);
        assertEquals(expected, result);
    }

    // List tests
    static Stream<Arguments> listTests() {
        return Stream.of(
            Arguments.of(List.of(1, 2, 4, 7, 8, 11, 13, 17), List.of("1", "2", "4", "7", "8", "11", "13", "17")),
            Arguments.of(List.of(1, 2, 3, 5, 9, 15, 21, 30, 35), List.of("1", "2", "Fizz", "Buzz", "Fizz", "FizzBuzz", "Fizz", "FizzBuzz", "Buzz")),
            Arguments.of(List.of(3, 5, 15, 18, 20, 30), List.of("Fizz", "Buzz", "FizzBuzz", "Fizz", "Buzz", "FizzBuzz")),
            Arguments.of(List.of(213, 54, 91, 187, 2001, 2023), List.of("Fizz", "Fizz", "91", "187", "Fizz", "2023"))
        );
    }

    @ParameterizedTest
    @MethodSource("listTests")
    @DisplayName("List FizzBuzz")
    public void listFizzBuzz(List<Integer> numbers, List<String> expected) {
        FizzBuzz exercise = new FizzBuzz();
        List<String> result = exercise.fizzBuzz(numbers);
        assertEquals(expected, result);
    }
}
