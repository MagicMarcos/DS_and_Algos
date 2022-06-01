package com.algorithms;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @org.junit.Test
    public void sort() {
        int[] input = {4, 15, 2, 6, 9, 22, 13};
        BubbleSort.sort(input);
        int[] expected = {2, 4, 6, 9, 13, 15, 22};
        assertArrayEquals(expected, input);
    }

    @org.junit.Test
    public void sortNeg() {
        int[] input = {4, -15, 2, 6, 9, 22, 13};
        BubbleSort.sort(input);
        int[] expected = {-15, 2, 4, 6, 9, 13, 22};
        assertArrayEquals(expected, input);
    }

    @org.junit.Test
    public void sortRepeat() {
        int[] input = {4, -15, 2, 6, 9, 22, 13, 13};
        BubbleSort.sort(input);
        int[] expected = {-15, 2, 4, 6, 9, 13, 13, 22};
        assertArrayEquals(expected, input);
    }

    @org.junit.Test
    public void sortAllSame() {
        int[] input = {4, 4, 4, 4, 4, 4, 4, 4, 4};
        BubbleSort.sort(input);
        int[] expected = {4, 4, 4, 4, 4, 4, 4, 4, 4};
        assertArrayEquals(expected, input);
    }

    @org.junit.Test
    public void sortAllSameNeg() {
        int[] input = {-4, -4, -4, -4};
        BubbleSort.sort(input);
        int[] expected = {-4, -4, -4, -4};
        assertArrayEquals(expected, input);
    }

    @org.junit.Test
    public void sortAllNeg() {
        int[] input = {-4, -3, -12, -978548};
        BubbleSort.sort(input);
        int[] expected = {-978548, -12, -4, -3};
        assertArrayEquals(expected, input);
    }
}