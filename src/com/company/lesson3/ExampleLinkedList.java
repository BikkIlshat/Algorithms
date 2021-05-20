package com.company.lesson3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;


class ArObjClone{
    private final int x;
    private final int y;

    public ArObjClone(int x, int y){
        this.x=x;
        this.y=y;

    }
    public void print(){
        System.out.println("X: "+this.x + "; Y: " + this.y);
    }
    public int  getX(){return x;}
    public int  getY(){return y;}

}

public class ExampleLinkedList {
    public static void main(String[] args) {

        LinkedList<String> mArrayLinkedList=new LinkedList<>();
        ArrayList<String> mArrayLinkedListCopy=new ArrayList<>(mArrayLinkedList);

        // mArrayCopy.addAll(0,mArray);
        // Collections.copy(mArrayCopy,mArray);
        // ArrayList<String> mArrayCopy=(new ArrayList<String>).mArray.clone();

        mArrayLinkedList.add("One");
        mArrayLinkedList.add("Two");
        mArrayLinkedList.add("OneTwo");
        mArrayLinkedList.add("TwoThree");
        mArrayLinkedList.add("Three");
        System.out.println(mArrayLinkedList);

        mArrayLinkedList.add(1,"Four");
        System.out.println(mArrayLinkedList);
        mArrayLinkedList.set(2,"Set");
        System.out.println(mArrayLinkedList);
        System.out.println(mArrayLinkedList.get(2));
        mArrayLinkedList.remove(1);
        mArrayLinkedList.remove("Set");
        System.out.println(mArrayLinkedList);

        mArrayLinkedList.addFirst("first");
        System.out.println(mArrayLinkedList);
        mArrayLinkedList.addLast("last");
        System.out.println(mArrayLinkedList+"\n");

        System.out.println(mArrayLinkedList.peekFirst());
        System.out.println(mArrayLinkedList.peekLast()+"\n");

        System.out.println(mArrayLinkedList.pollFirst());
        System.out.println(mArrayLinkedList.pollLast()+"\n");

        System.out.println(mArrayLinkedList+"\n");

        if (mArrayLinkedList.contains("One")){
            System.out.println("Содержит 'One' "); //метод поиска элемента в коллекции
        }
        LinkedList<ArObjClone> mArrObjClone = new LinkedList<>();
        mArrObjClone.add(new ArObjClone(1,6));
        mArrObjClone.add(new ArObjClone(7,10));
        mArrObjClone.add(new ArObjClone(21,16));
        mArrObjClone.add(new ArObjClone(31,9));

        mArrObjClone.set(2,new ArObjClone(33,55));

        for (ArObjClone num: mArrObjClone) {
            num.print();
            System.out.println(num.getX()+" "+ num.getY());
        }

        mArrayLinkedListCopy.addAll(mArrayLinkedList);
        System.out.println("\n"+mArrayLinkedListCopy);
        System.out.println(mArrayLinkedListCopy.equals(mArrayLinkedList));
        System.out.println(mArrayLinkedList.hashCode());

        System.out.println(mArrayLinkedList+ "\n");
        Iterator<String> iterator=mArrayLinkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"\n");
            iterator.remove();
        }

        System.out.println("Тест: "+mArrayLinkedList+"\n");

        ListIterator<ArObjClone> listIterator =mArrObjClone.listIterator();
        while (listIterator.hasNext()){
            listIterator.next();
        }
        Random random =new Random();

        ArObjClone m;
        while (listIterator.hasPrevious()){
            m= listIterator.previous();
            m.print();
            listIterator.set(new ArObjClone(random.nextInt(10), random.nextInt(10)));
        }
        System.out.println( "");
        for (ArObjClone numb: mArrObjClone) {
            numb.print();
            System.out.println(numb.getX()+" "+ numb.getY());

        }
    }
}