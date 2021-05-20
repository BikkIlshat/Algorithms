package com.company.lesson3;

import java.util.ArrayList;

class ArObj{
    private final int x;
    private final int y;

    public ArObj(int x, int y){
        this.x=x;
        this.y=y;

    }
    public void print(){
        System.out.println("X: "+this.x + "; Y: " + this.y);
    }
    public int  getX(){return x;}
    public int  getY(){return y;}

}

class Link<T>{
    private T link;
    private Link<T> next;

    public Link(T link){this.link=link;}

    public Link<T>getNext(){return  next;}

    public void setNext(Link<T> next){this.next=next;}

    public T getValue(){return link;}
}

class LinkedList<T>{
    private Link<T> first;
    public LinkedList(){first=null;}
    public boolean isEmpty(){return (first==null);}

    public void insert(T link){
        Link<T> l=new Link<>(link);
        l.setNext(first);
        this.first=l;
    }

    public Link<T>delete(){
        Link<T> temp =first;
        first=first.getNext();
        return temp;
    }

    public void display(){
        Link<T> current =first;
        while (current!=null){
            System.out.println(current.getValue());
            current=current.getNext();
        }
    }
    public T find(T searchNode){
        Link<T> findNode=new Link<>(searchNode);
        Link<T> current=first;
        while (current!=null){
            if (current.getValue().equals(findNode.getValue())){
                return findNode.getValue();
            }
        }
        return null;
    }

}

public class Main {
    public static void main(String[] args) {
//        Задание 3.1
//        На основе массива из домашнего задания 2.1 реализуйте простой список и коллекцию.
//        Оцените время выполнения преобразования.
//
//        Задание 3.2
//        На основе списка из задания 3.1 реализуйте основные методы добавления, удаления и получения объекта или элемента из списка.
//        Оценить выполненные методы с помощью базового класса System.nanoTime().
//
//        Задание 3.3
//        Реализуйте простой односвязный список и его базовые методы.
//
//        Задание 3.4
//        На основе списка из задания 3.1 реализуйте простой двусторонний список и его базовые методы.
//        Реализуйте список заполненный объектами из вашего класса из задания 1.3
//
//        Задание 3.5
//        Реализуйте итератор на основе связанных списков из задания 3.4 и выполните базовые операции итератора.
//        Оцените время выполнения операций с помощью базового метода System.nanoTime()
        long start = System.nanoTime();
        ArrayList<String> mArray=new ArrayList<>();
        ArrayList<String> mArrayCopy = new ArrayList<>(mArray);

        // mArrayCopy.addAll(0,mArray);
        // Collections.copy(mArrayCopy,mArray);
        // ArrayList<String> mArrayCopy=(new ArrayList<String>).mArray.clone();

        mArray.add("One");
        mArray.add("Two");
        mArray.add("Three");
        System.out.println(mArray);

        mArray.add(1,"Four");
        System.out.println(mArray);
        mArray.set(2,"Set");
        System.out.println(mArray);
        System.out.println(mArray.get(2));
        mArray.remove(1);
        mArray.remove("Set");
        System.out.println(mArray);
        long stop = System.nanoTime();
        long difStopStartCreateAndMethodsArrayList=stop-start;
        System.out.println("Время затраченное на создание ArrayList и применение методов составило, наносек: " +
                difStopStartCreateAndMethodsArrayList);

        ArrayList<ArObj> mArrayObj=new ArrayList<>();
        mArrayObj.add(new ArObj(1,2));
        mArrayObj.add(new ArObj(3,2));
        mArrayObj.add(new ArObj(5,8));
        mArrayObj.set(2,new ArObj(1,2));
        System.out.println(mArrayObj.get(1));
        System.out.println(mArrayObj);
        mArrayObj.get(0);
        for (ArObj number:mArrayObj) {
            number.print();
            System.out.println("  ");
            System.out.println(number.getX()+" "+ number.getY());

        }

        LinkedList<String> list=new LinkedList<>();
        list.insert("Ivan");
        list.insert("Alex");

        list.display();

        System.out.println("\n"+list.find("Ivan"));

    }

}