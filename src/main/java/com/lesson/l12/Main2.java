package com.lesson.l12;

import java.util.concurrent.atomic.AtomicInteger;

public class Main2 {
   static AtomicInteger atomicInteger = new AtomicInteger(0);
   static volatile int i = 0;
    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i<10_000; i++) {
            new MyThread().start();
        }
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
      //  myThread.start();
       // myThread1.start();
   //     myThread.yield();

        Thread.sleep(2_000);
        System.out.println(atomicInteger.get());
        System.out.println(i);
    }
    static class MyThread extends Thread {


        @Override
        public void run() {
           atomicInteger.incrementAndGet();
            increment();
        }
    }
    public static  int increment() {
      return i++;
    }
}
