package com.tms.lessons16;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Thread T1 = new MyThread();
        Thread T2 = new MoreMyThread();
        Thread T3 = new Thread(new MyRunnable());


        T3.start();
        T3.join();

        T2.start();
        T2.join();

        T1.start();
        T1.join();


    }
}
