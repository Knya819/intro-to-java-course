package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }

    @Test
    @DisplayName("print 1 if input is 1" )
    public void prints1IfInputIs1() {
        assertEquals("1", FizzBuzz.get(1));
    }
        @Test
    @DisplayName("print 2 if input is 2" )
    public void prints2IfInputIs2() {
        assertEquals("2", FizzBuzz.get(2));
    }
        @Test
        @DisplayName("print Fizz if input is 3" )
        public void printsFizzIfInputIs3() {
            assertEquals("Fizz", FizzBuzz.get(3));
            
    }
    @Test
        @DisplayName("print Fizz if input 6" )
        public void printsFizzIfInputIs6() {
            assertEquals("Fizz", FizzBuzz.get(6));
    }

    @Test
        @DisplayName("print Fizz if input 9" )
        public void printsFizzIfInputIs9() {
            assertEquals("Fizz", FizzBuzz.get(9));
    }
    
    @Test
    @DisplayName("print Buzz if input 5" )
    public void printsBuzzIfInputIs5() {
        assertEquals("Buzz", FizzBuzz.get(5));
}
    
}