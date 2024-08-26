package com.cbfacademy.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

class SortTest {
    private ArraySorter bubbleSorter;
    private ArraySorter heapSorter;
    private ArraySorter mergeSorter;
    private ArraySorter quickSorter;

    @BeforeEach
    void setup() {
        bubbleSorter = new BubbleSort();
        heapSorter = new HeapSort();
        mergeSorter = new MergeSort();
        quickSorter = new QuickSort();
    }

    @ParameterizedTest
    @MethodSource("sort_ReturnsSortedArrayForUnsortedInputArray")
    @DisplayName("BubbleSort: sort() method returns sorted array for unsorted input array")
    void bubbleSort_ReturnsSortedArrayForUnsortedInputArray(int[] arr, int[] sortedArr) {
        bubbleSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sort_ReturnsSortedArrayForUnsortedInputArray")
    @DisplayName("HeapSort: sort() method returns sorted array for unsorted input array")
    void heapSort_ReturnsSortedArrayForUnsortedInputArray(int[] arr, int[] sortedArr) {
        heapSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sort_ReturnsSortedArrayForUnsortedInputArray")
    @DisplayName("MergeSort: sort() method returns sorted array for unsorted input array")
    void mergeSort_ReturnsSortedArrayForUnsortedInputArray(int[] arr, int[] sortedArr) {
        mergeSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);
    }

    @ParameterizedTest
    @MethodSource("sort_ReturnsSortedArrayForUnsortedInputArray")
    @DisplayName("QuickSort: sort() method returns sorted array for unsorted input array")
    void quickSort_ReturnsSortedArrayForUnsortedInputArray(int[] arr, int[] sortedArr) {
        quickSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);
    }

    static Stream<Arguments> sort_ReturnsSortedArrayForUnsortedInputArray() {
        return Stream.of(
                Arguments.of(new int[]{55, 18, -9, 3, 107, 24, 66, 0}, new int[]{-9, 0, 3, 18, 24, 55, 66, 107}),
                Arguments.of(new int[]{5, 3, 8, 4, 2, 7, 1, 6}, new int[]{1, 2, 3, 4, 5, 6, 7, 8}),
                Arguments.of(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2}),
                Arguments.of(new int[]{29, 28, 27, 26, 25, 24, 23, 22, 21, 20},
                        new int[]{20, 21, 22, 23, 24, 25, 26, 27, 28, 29})
        );
    }

    @Test
    @DisplayName("sort() method returns empty array for empty input array")
    void sort_ReturnsEmptyArrayForEmptyInputArray() {
        int[] arr = {};
        int[] sortedArr = {};

        bubbleSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);

        heapSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);

        mergeSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);

        quickSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    @DisplayName("sort() method returns original array for pre-sorted input array")
    void sort_ReturnsOriginalArrayForPresortedInputArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] sortedArr = {1, 2, 3, 4, 5, 6};

        bubbleSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);

        heapSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);

        mergeSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);

        quickSorter.sort(arr, 0, arr.length - 1);
        assertArrayEquals(sortedArr, arr);
    }
}