package com.company.lesson5;

import java.util.Arrays;
import java.util.Random;

public class HomeWorck {

    public static void main(String[] args) {

        System.out.println("5.1_Классический пример применения рекурсивной функции – вычисление факториала от числа.");

        System.out.println("\n" + "5.2 Пример бесконечной рекурсии и обычной рекурсии с уловием для выхода: ");
        System.out.println(factorial(15) + "!" + " Факторириал");
      // recursionFucn(); // бесконечная рекурсия с переполнением стека


        System.out.println("\n" + "5.4 простой алгоритм реалезующий цикл:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ку-Ку");
        }

        System.out.println("\n" + "5.4 простой алгоритм реалезующий рекурсию:");
        System.out.println("Значение числа Фибоначи " + fibonachi(8));


        System.out.println("\n" + "5.5 Реализуйте алгоритм двоичного рекурсивного поиска:");

        int arr[] = new int[13];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15);
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(recBinaryFind(4, 0, arr.length - 1, arr));


        System.out.println("\n" + "5.6 Реализуйте алгоритм сортировки слиянием:");

        int array[] = new int[13];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(19);
        }

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(sortMerge(array)));
    }



    // 5.2
    private static int factorial(int n) {
        int result = 1;

        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }

        result = n * factorial(n-1);
        return result;
    }

    //  бесконечная рекурсия
    public static void recursionFucn() {
        System.out.println("Hello World");
        recursionFucn();
    }

    /* 5.3 Приведите пример изображающий стек вызова и стек вызова с рекурсией.

    Пример изображающий стек вызова:
    Стек вызовов
    main() ------>A(X) ---->B(X)
    A(x)------| B(X)-----|

    Стек вызовов:
    B(X)
    A(X)
    main()

    Стек выозова с рекурсией
    Вызов Функции в main:
    factorial(3)

    Схематичный стек:

    Вызов Функции
    Возврат 1
    Вызов Функции
    Возврат 2
    Вызов Функции
    Возврат 6

     */

    //5.4 простой алгоритм реалезующий рекурсию"
    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    public static int recBinaryFind(int searchKey, int low, int high, int[] arr) {
        if (low > high) {
            return arr.length;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == searchKey) {
            return mid;
        }

        // Если же это не так
        else if (arr[mid] < searchKey) {
            return recBinaryFind(searchKey, mid + 1, high, arr);
        } else {
            return recBinaryFind(searchKey, low, mid - 1, arr);
        }
    }

    // 5.6 Сортировка слиянием
    private static int[] sortMerge(int[] array) {
        int len = array.length; // вычисляем длну нашего массива
        if (len < 2) return array; // если длина нашего массива меньше двух (меньше еденицы) то мы вовращаем просто наш массив return arr
        int middle = len / 2; // вычисляем середину
        return merge(sortMerge(Arrays.copyOfRange(array, 0, middle)),sortMerge(Arrays.copyOfRange(array, middle, len))); // после начинает рекурсия. Вызывается метод merge
    }

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++]; // Тернарный оператор
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
        }
        return result;
    }

}
