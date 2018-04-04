package org.computerlinguist.sort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SortTest {


    @org.junit.jupiter.api.Test
    void testEmpty() {
        int[] test1 = {};
        int[] expected1 = {};
        verify(test1, expected1);
    }

    @org.junit.jupiter.api.Test
    void testSingle() {
        int[] test1 = {1};
        int[] expected = {1};
        verify(test1, expected);
    }

    @org.junit.jupiter.api.Test
    void testPreSorted() {
        int[] test1 = {1, 2, 3};
        int[] expected = {1, 2, 3};
        verify(test1, expected);
    }

    @org.junit.jupiter.api.Test
    void testOddLength() {
        int[] test1 = {4, 7, 2};
        int[] expected = {2, 4, 7};
        verify(test1, expected);
    }

    @org.junit.jupiter.api.Test
    void testEvenLength() {
        int[] test1 = {4, 9, 0, 3};
        int[] expected = {0, 3, 4, 9};
        verify(test1, expected);
    }

    @org.junit.jupiter.api.Test
    void testLargeArray() {
        int[] test1 = {2, 77, 1, 333, 2, 99, 0, 76};
        int[] expected = {0, 1, 2, 2, 76, 77, 99, 333};
        verify(test1, expected);
    }

    void verify(int[] toBeSorted, int[] expected) {
        BubbleSort.sort(toBeSorted);
        assertTrue(Arrays.equals(toBeSorted, expected));
    }
}
