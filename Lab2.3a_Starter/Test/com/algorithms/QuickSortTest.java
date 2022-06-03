package com.algorithms;

import static org.junit.Assert.*;
import org.junit.*;

public class QuickSortTest {
    // TODO: change names

    QuickSort quickSort;

    @Before
    public void setUp() {
        quickSort = new QuickSort();
    }

    @Test
    public void sort() {
        int[] array = {1,2,5,4,9,54,654,35};
        int[] expected = {1,2,4,5,9,35,54,654};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sortNeg() {
        int[] array = {-1,-2,-5,-4,-9};
        int[] expected = {-9,-5,-4,-2,-1};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sortMixed() {
        int[] array = {-1,-2,-5,10,-4,9};
        int[] expected = {-5,-4,-2,-1, 9, 10};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sortSame() {
        int[] array = {4,4,4,4,4,4,4,4,4,4,4};
        int[] expected = {4,4,4,4,4,4,4,4,4,4,4};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sortDupes() {
        int[] array = {1,2,4,2,6,8,8,10};
        int[] expected = {1,2,2,4,6,8,8,10};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }
}