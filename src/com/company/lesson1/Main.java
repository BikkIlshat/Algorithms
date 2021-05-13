package com.company.lesson1;

public abstract class Main {


    public static void main(String[] args) {
        long start = System.nanoTime();
        int maxAge = 40;
        Employees[] persArray = new Employees[5];
        persArray[0] = new Employees("Tikhonov Vyacheslav Vladimirovich", "Data-Engineer", "TihVV@mail.ru", 88005553555l, 200000,40);
        persArray[1] = new Employees("Timofeev Alexander Sergeevich ", "Unity-developer",  "TimoA@rambler.ru", 88005554555l, 120000, 41);
        persArray[2] = new Employees("Govorkov Petr Vasilievich", "Game Analyst", "PVGovor@gmail.com", 88005556555l, 150000,42);
        persArray[3] = new Employees("Bratskiy Danil Bagrov", "3D-artist", "DanilBagrov@mail.ru", 880005557555l, 170000, 39);
        persArray[4] = new Employees("Alexander Alexandrovich Bely","Android-developer","AlexandrWhite@gmail.com",88001231233l, 180000, 33);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >= maxAge) {
                persArray[i].getInformationEmployee();
            }

            long end = System.nanoTime();
            long elapsedTime = end - start;
            double seconds = (double)elapsedTime / 1_000_000_000.0;
            System.out.println((seconds) + " секунд");
        }

        /*
        Пример алгоритмов:
        1.Линейный поиск (или последовательный поиск) - простейший алгоритм поиска. Он редко используется из-за своей неэффективности.
        2.Двоичный поиск - Двоичный или логарифмический поиск часто используется из-за быстрого времени поиска.
        3.Поиск прыжками - От двоичного поиска этот алгоритм отличает движение исключительно вперёд.
        (Имейте в виду, что такой поиск требует отсортированной коллекции).
        4.Алгоритм Кнута – Морриса – Пратта - Алгоритм КМП осуществляет поиск текста по заданному шаблону.
        5.Интерполяционный поиск - Интерполяционный поиск используется для поиска элементов в отсортированном массиве.
        (Он полезен для равномерно распределенных в структуре данных).
        6.Экспоненциальный поиск - используется для поиска элементов путём перехода в экспоненциальные позиции, то есть во вторую степень.

        Примермы алгоритмов из жизни:
        1.Приготовление какого - либо напитка (чай,кофе)
        2.Готовка еды по рецепту
        3.Перехода через проезжую часть
        4.Выполнение домашнего задание
        5.Посадка дерева
        6.Строительство дома


        Пример структур данных:
          1.Массив (Array)
          2.Стек (Stack)
          3.Очередь (Queue)
          4.Связный список (Linked List)
          5.Дерево (Tree)
          6.Граф (Graph)
          7.Префиксное дерево (Trie)
          8.Хэш-Таблица (Hash Table)

          Пример стурктур данных из жизни
          1. Телефонный справочник
          2. Толковый словарь
          3. Прайс -лист
          5. Иерархия должностей в организации.
         */
    }
}
