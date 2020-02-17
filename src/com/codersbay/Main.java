package com.codersbay;

public class Main {

    public static void main(String[] args) {
        int[] unsorted = {5, 4, 1, 9, 6, 7, 3, 2, 8};
        int countRight = 1;
        int countLeft = 1;
        int temp;

        while (countRight < unsorted.length) {
            for (int j = countRight; j > 0; j--) {

                if (unsorted[j] < unsorted[j - countLeft]) {
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j - countLeft];
                    unsorted[j - countLeft] = temp;
                }
           /*     System.out.println("countRight "+countRight);
                System.out.println("countLeft "+countLeft);
                System.out.println("countPos "+j);
                for (int p : unsorted) {
                    System.out.print(p + " ");
                }
                System.out.println(); */
            }
            countRight++;
        }
        /* print the sorted array */
        for (int p : unsorted) {
            System.out.print(p + " ");
        }

    }

}