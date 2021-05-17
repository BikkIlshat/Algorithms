package com.company.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task_2_2 {
    public static void main(String[] args) {
        long startlinearSearch = System.nanoTime();
        int[] array;
        array = new int [15];
        int key = 7;

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(35);
        }
        System.out.println("2.2 Реализация линейного и двоичного посика : ");
        System.out.println("Исходный массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Ключевое значение найдено под индексом: " + i);
            }
        }

        Arrays.sort(array);

        System.out.println("Отсортированный массив " + Arrays.toString(array));

        long endlinearSearch = System.nanoTime();
        long elapsedTime = endlinearSearch - startlinearSearch;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " Линеый поиск за секунд");

        System.out.println(binarySearch(array, key));

    }

    public static int binarySearch(int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;
        }
        return -1;

    }

}
