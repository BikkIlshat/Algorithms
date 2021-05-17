package com.company.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task_2_6 {
    static final int SIZE = 400;

    public static void main(String[] params) {
        long start = System.nanoTime();
        int[] array = new int[SIZE];
        int[] arrayCopy;
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(300);
        }

        System.out.println(Arrays.toString(array));
        arrayCopy = Arrays.copyOf(array, array.length);
        insertionSort(arrayCopy);

        long end = System.nanoTime();

        long elapsedTime = end - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;

        }
        System.out.println(Arrays.toString(array));


    }

}
