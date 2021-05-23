package com.company.lesson4;



import java.util.*;
import java.util.Queue;

public class HomeWork {

    public static void main(String[] args) {


        System.out.println("Задание 4.1: простой стек и его базовые методы:");

        long startOne = System.nanoTime();
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.add(7);

        System.out.println("Initial stack: " + stack);
        System.out.println("Searching value 3 in stack: " + stack.search(3));
        System.out.println("Searching value 8 in stack: " + stack.search(8));
        System.out.println("Element on stack top: " + stack.peek());
        System.out.println("View stack fill: " + stack.empty());

        while (!stack.empty()) {
            System.out.println("Removing an item from the stack " + stack.pop());
        }

        System.out.println("Final stack: " + stack);
        System.out.println("View stack fill: " + stack.empty());

        long endOne = System.nanoTime();
        long elapsedTime = endOne - startOne;

        System.out.println("Time spent on surgery: " + elapsedTime + " nanoseconds");

        System.out.println("\n" + "Задание 4.2: простая очередь и его базовые методы:");

        long startTwo = System.nanoTime();
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("Б");
        queue.add("В");
        queue.add("Г");
        queue.add("Д");
        queue.offer("Е");
        queue.offer("Ё");
        queue.offer("Ж");

        System.out.println("Initial queue: " + queue);
        System.out.println("Element on queue top: " + queue.peek());
        System.out.println("Element on queue top: " + queue.element());
        System.out.println("View queue fill: " + queue.isEmpty());
        System.out.println("Removing the top element " + queue.remove());
        System.out.println("Removing the top element " + queue.remove());
        System.out.println("Initial queue: " + queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("Initial queue: " + queue);
        System.out.println("View queue fill: " + queue.isEmpty());

        long endTwo = System.nanoTime();
        long elapsedTimeTwo = endTwo - startTwo;
        System.out.println("Time spent on surgery: " + elapsedTimeTwo + " nanoseconds");

        System.out.println("\n" + "Задание 4.3: простой дек и его базовые методы:");

        long startThree = System.nanoTime();
        Deque<String> deque = new ArrayDeque<>();

        deque.add("Apricot");
        deque.add("Pineapple");
        deque.add("Orange");
        deque.add("Banana");
        deque.add("Grape");
        deque.add("Kiwi");

        deque.addFirst("Яблоко");
        deque.push("Манго");
        deque.addLast("Арбуз");
        deque.add("Дыня");

        System.out.println("Initial queue: " + deque);

        System.out.println("Removing the first element:: " + deque.pollFirst());
        System.out.println("Removing the last element:: " + deque.pollLast());
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());
        System.out.println("Removing the top element: " + deque.remove());
        System.out.println("Removing the last element:: " + deque.pollLast());

        System.out.println("Initial deque: " + deque);

        while (deque.peek() != null) {
            System.out.println(deque.pop());
        }


        System.out.println("View deque fill: " + deque.isEmpty());
        System.out.println("Initial deque: " + deque);

        long endThree = System.nanoTime();
        long elapsedTimeThree = endThree - startThree;
        System.out.println("Time spent on surgery: " + elapsedTimeThree + " nanoseconds");

        System.out.println("\n" + "Задание 4.4: приоритетная очередь на основе ссылочных типов данных Integer:");

        long startFour = System.nanoTime();
        PriorityQueue<Integer> prior = new PriorityQueue<>();

        prior.add(9);
        prior.add(3);
        prior.add(7);
        prior.offer(5);

        while (!prior.isEmpty()) {
            System.out.println(prior.poll());
        }

        long endFour = System.nanoTime();
        long elapsedTimeFour = endFour - startFour;
        System.out.println("Time spent on surgery: " + elapsedTimeFour + " nanoseconds");


        System.out.println("\n" + "Задание 4.5:  стек и очередь на базе связанного списка.:");

        long startFive = System.nanoTime();
        LinkedListStack<Integer> stackMy = new LinkedListStack<>();


        stackMy.push(1);
        stackMy.push(2);
        stackMy.push(3);
        stackMy.push(4);



        System.out.println("Initial stack: " + stackMy);
        System.out.println("View stack fill: " + stackMy.isEmpty());

        while (!stackMy.isEmpty()) {
            System.out.println(stackMy.pop());
        }

        System.out.println("View stack fill: " + stackMy.isEmpty());
        System.out.println("Initial stack: " + stackMy);


        QueueMy<String> queueMy = new QueueMy<>();


        queueMy.add("A");
        queueMy.add("Б");
        queueMy.add("В");
        queueMy.add("Г");
        queueMy.add("Д");

        System.out.println("Initial queueMy: " + queueMy);
        System.out.println("View My fill: " + queueMy.isEmpty());
        System.out.println("Removing the last element " + queueMy.removeLast());
        System.out.println("Removing the first element " + queueMy.removeFirst());
        System.out.println("Initial queue: " + queueMy);

        while (!queueMy.isEmpty()) {
            System.out.println(queueMy.removeFirst());
        }

        System.out.println("Initial queue: " + queueMy);
        System.out.println("View queue fill: " + queueMy.isEmpty());

        long endFive = System.nanoTime();
        long elapsedTimeFive = endFive - startFive;
        System.out.println("Time spent on surgery: " + elapsedTimeFive + " nanoseconds");
    }

    public static class LinkedListStack<T> {

        private final LinkedListMy<T> linkedList = new LinkedListMy<>();

        public void push(T data) {
            linkedList.addFirst(data);
        }

        public T pop() {
            return linkedList.removeFirst();
        }

        public boolean isEmpty() {
            return linkedList.isEmpty();
        }

        @Override
        public String toString() {
            return linkedList.toString();
        }

    }

    public static class QueueMy<T>
    {
        protected LinkedList<T> list;

        public QueueMy() {
            list = new LinkedList<T>();
        }

        public void add(T element) {
            list.add( element);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public T removeLast() {
            return list.removeLast();

        }

        public T removeFirst() {
            return list.removeFirst();
        }


        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(list);

            return String.valueOf(list);
        }


    }

    static class LinkedListMy<T> {

        // внутренний класс, который представляет элемент списка
        private class Node<T> {

            // данные
            private T data;
            // указатель на следующий элемент
            private Node<T> next;

            public Node(T data) {
                this.data = data;
            }

            @Override
            public String toString() {
                return data.toString();
            }
        }

        private Node<T> first = null;

        // используется для push операции
        public void addFirst(T data) {
            Node<T> newFirst = new Node<T>(data);
            newFirst.next = first;
            first = newFirst;
        }

        // используется для pop операции
        public T removeFirst() {
            Node<T> oldFirst = first;
            first = first.next;
            return oldFirst.data;
        }

        @Override
        public String toString() {
            StringBuilder listBuilder = new StringBuilder();
            Node currentNode = first;
            while (currentNode != null) {
                listBuilder.append(currentNode).append(",");
                currentNode = currentNode.next;
            }
            return listBuilder.toString();
        }

        public boolean isEmpty() {
            return first == null;
        }

    }
}
