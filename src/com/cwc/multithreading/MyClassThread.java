package com.cwc.multithreading;

import com.cwc.collectionss.concurrencys.MyThread;

public class MyClassThread{
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("This is Thread");
        };
        Thread t1 = new Thread(runnable);
        t1.start();

    }
}
