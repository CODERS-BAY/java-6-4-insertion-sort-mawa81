package com.codersbay;

public class Main {

    public static void main(String[] args) {
        int[] list = {5, 4, 1, 9, 6, 7, 3, 2, 8};
        int[] unsorted = new int[list.length];
        int[] sorted = new int[list.length];
        int count = 1;
        int temp;
        while (count < list.length) {
            System.out.println(count);
            for (int i = 1; i <= count; i++) {
                if (list[i] < list[i - 1]) {

                    temp = list[i];
                    System.out.println("temp " + temp);
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                    count++;
                } else {
                    System.out.println("else");
                }
            }
        }
        for (int p : list) {
            System.out.println(p);
        }
    }

}