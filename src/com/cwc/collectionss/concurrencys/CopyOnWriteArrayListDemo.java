package com.cwc.collectionss.concurrencys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    private static void removeOperationNormalArrayList(ArrayList<Integer> a1) {
        Iterator<Integer> iterator = a1.iterator();
        System.out.println("...................ArrayList.............................");
        while (iterator.hasNext()){
            Integer next = iterator.next();

            System.out.println("Before Removing");
            System.out.println(next);
            if (next % 2 == 0){
                iterator.remove();
            }
            System.out.println("After Removing");
            System.out.println(next);
        }

    }

    private static void removeOperationCOWAL(CopyOnWriteArrayList c1) {
        Iterator itr = c1.iterator();
        System.out.println("...................Copy On Write ArrayList.............................");
        while (itr.hasNext()){
            Integer next = (Integer) itr.next();
            System.out.println("Before Removing");
            System.out.println(next);
            if (next % 2 == 0){
                itr.remove();
            }
            System.out.println("After Removing");
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        //Normal ArrayList --> Fail Fast

        //Concurrency CopyOnWriteArrayList --> Fail Safe
        CopyOnWriteArrayList c1 = new CopyOnWriteArrayList();
        c1.add(9);
        c1.add(5);
        c1.add(4);
        c1.add(3);
        c1.add(1);
        //We can not remove
       // removeOperationCOWAL(c1);//UnsupportedOperationException

        //Normal Array
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(6);
        a1.add(2);
        a1.add(3);
        a1.add(5);
        //We can remove operation No Exception occurs
        removeOperationNormalArrayList(a1);

    }




}
