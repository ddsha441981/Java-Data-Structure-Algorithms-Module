package com.cwc.collectionss.concurrencys;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.*;
import java.util.Map;

public class MyThread extends  Thread{


    static ConcurrentHashMap map = new ConcurrentHashMap();
   // static HashMap map = new HashMap();//Throw an exception :---> ConcurrentModificationException
    @Override
    public void run() {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Child Thread updating Map...........");
        map.put(103,"C");
    }

    public static void main(String[] args) throws InterruptedException {
        map.put(101,"A");
        map.put(102,"B");
        MyThread t1 = new MyThread();
        t1.start();
        Set s1 = map.keySet();
        Iterator iterator = s1.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("Main Thread iterating map and current entry is " + next + "....." + map.get(next) );
            Thread.sleep(3000);
            System.out.println(map);
        }
    }
}
