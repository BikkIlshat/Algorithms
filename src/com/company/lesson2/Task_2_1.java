package com.company.lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task_2_1 {

    public static void main(String[] args) {
        long start = System.nanoTime();
        Integer array[] = new Integer[13];


        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(30);
        }

        System.out.println("2.1 Базовые операции класса Arrays: ");

        System.out.println("Исходный массив: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Массив отсортирован в обратном порядке " + Arrays.toString(array));

        Integer[] arrayCopyOne = Arrays.copyOf(array,13);
        System.out.println("Скопированный массив: " + Arrays.toString(arrayCopyOne));

        System.out.println("Сравние исходного массива с копией: " + Arrays.equals(array, arrayCopyOne));

        Integer[] arrayCopyTwo = Arrays.copyOfRange(array, 2,8);
        System.out.println("Копирование части массива: " + Arrays.toString(arrayCopyTwo));

        long end = System.nanoTime();
        long elapsedTime = end - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");

    }


}
