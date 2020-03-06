package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] unsorted = {5, 19, 4, 1, 16, 9, 6, 7, 3, 2, 8};

        insertSort(unsorted);

        System.out.println(Arrays.toString(unsorted));
    }

    private static void insertSort(int[] unsorted) {
        int temp;
        int startOfUnsorted = 1;
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
    }
}