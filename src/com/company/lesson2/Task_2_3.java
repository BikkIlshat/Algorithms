package com.company.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task_2_3 {
    static final int SIZE = 400;

    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] array = new int[SIZE];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(300);
        }

        System.out.println("Сортировка методом Sort()");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        long end = System.nanoTime();
        long elapsedTime = end - start;
        double seconds = (double) elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");


    }

}
