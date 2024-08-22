package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Year;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class YearTest {
    // Single number tests
    static Stream<Arguments> sampleToTest() {
        return Stream.of(
            Arguments.of(1700, false),
            Arguments.of(1800, false),
            Arguments.of(1900, false),
            Arguments.of(2000, true),
            Arguments.of(2001, false),
            Arguments.of(2002, false),
            Arguments.of(2003, false),
            Arguments.of(2004, true),
            Arguments.of(2005, false),
            Arguments.of(2006, false),
            Arguments.of(2007, false),
            Arguments.of(2008, true),
            Arguments.of(2009, false),
            Arguments.of(2010, false),
            Arguments.of(2011, false)
        );
    }

    @ParameterizedTest
    @MethodSource("sampleToTest")
    @DisplayName("Check if a given year is a leap year or noy")
    public void returnValue(long number, boolean expected) {
        Boolean result = Year.isLeap(number);
        assertEquals(expected, result);
    }

}
