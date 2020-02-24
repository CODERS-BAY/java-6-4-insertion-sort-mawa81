package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] unsorted = {5, 4, 1, 9, 6, 7, 3, 2, 8};
        int startOfUnsorted = 1;
        int temp;

        while (startOfUnsorted < unsorted.length) {
            for (int j = startOfUnsorted; j > 0; j--) {
                if (unsorted[j] < unsorted[j - 1]) {
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j - 1];
                    unsorted[j - 1] = temp;
                }
            }
            startOfUnsorted++;
        }
        /* print the sorted array */
 /*       for (int p : unsorted) {
            System.out.print(p + " ");
        }*/
        System.out.println(Arrays.toString(unsorted));

    }

}