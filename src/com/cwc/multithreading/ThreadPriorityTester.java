package com.cwc.multithreading;

class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<=5;i++){
            try{
                Thread.sleep(3000);
                System.out.println("Thread-1: " + i);
            }catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
        System.out.println("Thread-1 finished");
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<=5;i++){

            try {
                Thread.sleep(3000);
                System.out.println("Thread-2: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Thread-2 finished");
    }
}

public class ThreadPriorityTester {
    public static void main(String[] args) throws InterruptedException {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        /**
            NORM_PRIORITY = 1;
            MIN_PRIORITY = 5;
            MAX_PRIORITY = 10;
         */
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
