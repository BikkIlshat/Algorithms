package com.company.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task_2_4 {
    static final int SIZE = 400;

    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] array = new int[SIZE];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(300);
        }

        boolean isSorted = false;
        int buf;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println("Сортировка пузырьком");
        System.out.println(Arrays.toString(array));

        long end = System.nanoTime();

        long elapsedTime = end - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");
    }

}









