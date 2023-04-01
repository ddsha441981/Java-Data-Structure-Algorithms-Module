package com.cwc.multithreading;

public class HelloWorld extends Thread {

    @Override
    public void run() {

        System.out.println("Hello World!!");
        for (int i = 0; i<=5; i++){
            System.out.println("Val : " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread started");        HelloWorld t1 = new HelloWorld();
        t1.start();
        System.out.println(t1.isAlive());//true
        t1.join(); // main method waits for thread t to complete
        System.out.println(t1.isAlive());//false
        t1.sleep(3000);// main method sleeps for 3 seconds
        System.out.println("Main Thread ended");

    }

}
