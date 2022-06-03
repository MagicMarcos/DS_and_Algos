package com.algorithms;

import java.lang.reflect.Array;

public class MergeSort {

    public void mergeSort(int[] array) {
        // delegate to private mergeSort.  Follow example in QuickSort

    }

    private void mergeSort(int[] array, int start, int end) {
//    pseudo code:
//        mergeSort(array, start, end)
//        if start<end
//           middle = (end-start)/2 + start
//           mergeSort(array, start, middle)
//           mergeSort(array, middle+1, end)
//           merge(array, start, middle, end)
        int middle;
        mergeSort(array, start, end);
        if(start < end) {
            middle = (end-start)/2 + start;
            mergeSort(array, start, middle);
            mergeSort(array, middle+1, end);
            merge(array, start, middle, end);
        }
    }

    private void merge(int[] array, int start, int middle, int end) {
//    pseudo code:
//        merge(array, start, middle, end)
//        i = start
//        j = middle + 1
//        arrayTemp = initArrayOfSize(end - start + 1)
//        for (k = 0 until (end of arrayTemp))
//             if (i <= middle && (j > end || array[i] <= array[j]))
//                 arrayTemp[k] = array[i]
//                 i++
//	           else
//                  arrayTemp[k] = array[j]
//                  j++
//        copyArray(arrayTemp, array, start)
        merge(array, start, middle, end);
        int i = start;
        int j = middle +1;
        Array arrayTemp = initArrayOfSize(end - start + 1);
        for (int k = 0; k < arrayTemp.length; k++) {
            if (i <= middle && (j > end || array[i] <= array[j])){
                arrayTemp[k] = array[i];
                i++;
            }
            else {
                arrayTemp[k] = array[j];
                j++;
            }
        }

    }

    public static void main(String[] arge){
        MergeSort sorter = new MergeSort();
        int[] array = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        System.out.println("Unsorted:");
        for(int a: array){
            System.out.println(a);
        }
        sorter.mergeSort(array);
        System.out.println("Sorted:");
        for(int a: array){
            System.out.println(a);
        }
    }
}
