package com.cwc.multithreading;

public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable interface");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadRunnable obj1 = new ThreadRunnable();
        Thread t1 = new Thread(obj1);
        System.out.println("Main Thread started : " + t1.getName());
        t1.start();
        System.out.println(t1.isAlive());//true

        t1.join();
        System.out.println(t1.isAlive());//false because main thread waiting for t1 to complete

    }
}
