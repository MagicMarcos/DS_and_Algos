package com.algorithms;

public class BinarySearch {
    public static boolean binarySearch(int target, int[] sortedArray){
        return sortedArray != null && binarySearch(target, sortedArray, 0, sortedArray.length - 1);
    }

    public static boolean binarySearch2(int target, int[] sortedArray){
        return sortedArray != null && binarySearch2(target, sortedArray, 0, sortedArray.length - 1);
    }

    private static boolean binarySearch(int target, int[] array, int start, int end){
        if (start<=end){
            int mid = (end-start)/2 + start;
            if (array[mid] == target){
                return true;
            }
            else if (array[mid] > target){
                return binarySearch(target, array, start, mid-1);
            }
            else{
                return binarySearch(target, array, mid+1, end);
            }
        }
        return false;
    }

//    THIS IS BROKEN
    private static boolean binarySearch2(int target, int[] array, int start, int end){
        if (start>end){
         return false;
        }

        int mid = (end-start)/2 + start;
        if (array[mid] == target){
            return true;
        }
        else if (array[mid] > target){
            return binarySearch2(target, array, start, mid-1);
        }
        else{
            return binarySearch2(target, array, mid+1, end);
        }
    }

    public static void main(String[] args){
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(BinarySearch.binarySearch(7, sorted));
        System.out.println(BinarySearch.binarySearch(0, sorted));
        System.out.println("----------------------------------");
        System.out.println(BinarySearch.binarySearch2(7, sorted));
        System.out.println(BinarySearch.binarySearch2(0, sorted));
    }


}

