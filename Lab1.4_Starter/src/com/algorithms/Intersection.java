package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }

	public List<Integer> intersectionFast(int[]a, int[]b){
        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Declare empty list to contain intersection values
        ArrayList<Integer> intersectionValues = new ArrayList<>();

        // track current array index in loop
        int indexA = 0;
        int indexB = 0;


        while(indexA < a.length && indexB < b.length ) {
            if(a[indexA] == b[indexB]) {
                intersectionValues.add(a[indexA]);
                indexA ++;
                indexB ++;
            } else if(a[indexA] > b[indexB]) {
                indexB ++;
            } else if(a[indexA] < b[indexB]) {
                indexA ++;
            }
        }

		return intersectionValues;
	}

    public static void main(String args[]) {
        Intersection simpleIntersection = new Intersection();
        System.out.println("ORIGINAL " + simpleIntersection.intersection(new int[]{4, 7, 5, 2, 3, 18}, new int[]{4, 2, 3, 9, 1, 7, 18}));

        System.out.println("FAST AF BOI " + simpleIntersection.intersectionFast(new int[]{0, 4, 7, 5, 2, 6, 9}, new int[]{4, 2, 0, 3, 9}));
    }
}
