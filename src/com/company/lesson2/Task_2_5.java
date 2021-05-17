package com.company.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task_2_5 {
    static final int SIZE = 400;

    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] array = new int[SIZE];
        int[] arrayCopy;
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(300);
        }

        System.out.println(Arrays.toString(array));
        arrayCopy = Arrays.copyOf(array, array.length);


        for (int step = 0; step < arrayCopy.length; step++) {
            int index = min(arrayCopy, step);

            int tmp = arrayCopy[step];
            arrayCopy[step] = arrayCopy[index];
            arrayCopy[index] = tmp;
        }
        System.out.println(Arrays.toString(arrayCopy));
        long end = System.nanoTime();

        long elapsedTime = end - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");
    }

    private static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        } return minIndex;
    }
}
