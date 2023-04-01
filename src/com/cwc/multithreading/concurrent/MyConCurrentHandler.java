package com.cwc.multithreading.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class MyConCurrentHandler extends Thread{
static ArrayList al = new ArrayList();
    @Override
    public void run() {
       try{
           Thread.sleep(3000);
       }catch(InterruptedException ex){
           //............//
       }
        System.out.println("Child Thread updating list" + al.add("F"));
    }

    public static void main(String[] args) throws InterruptedException {
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        MyConCurrentHandler currentHandler = new MyConCurrentHandler();
        currentHandler.start();//Main Thread
        Iterator iterator = al.iterator();
        while (iterator.hasNext()){
            String s1 = (String) iterator.next();
            System.out.println("Main Thread iterating list and current object is " + s1);
        }
        Thread.sleep(3000);
        System.out.println(al);

    }
}
