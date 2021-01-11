package com.lesson.l11;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    // static List<Object> list = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
       /* MyThread thread = new MyThread();
        MyThread thread1 = new MyThread();
        thread.start();
        thread1.start();*/
        Plane plane = new Plane();
        Plane plane1 = new Plane();
        Thread thread = new Thread(plane);
        Thread thread1 = new Thread(plane1);
        Thread thread2 = new Thread(plane);
        //thread.setDaemon(true);
        //thread1.setDaemon(true);

      //  Thread.sleep(50);
      /*  thread.interrupt();
        thread1.interrupt();
       thread.setPriority(Thread.MIN_PRIORITY);
       thread1.setPriority(Thread.MIN_PRIORITY);
       thread2.setPriority(Thread.MAX_PRIORITY);
       thread.start();
        thread.join();

       thread2.start();
      thread2.interrupt();
        thread.interrupt();
        thread2.interrupt();
      thread1.interrupt();*/


    MyThread thread3 = new MyThread();
        MyThread thread14 = new MyThread();
        thread3.start();
        Thread.sleep(100);
        thread14.start();


    }

    static class MyThread extends Thread {
        @SneakyThrows
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(4000);
        }
    }

    static class Plane implements Runnable {

        @Override
        public void run() {
            boolean isActive = true;
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            int counter = 1; // счетчик циклов
            while (isActive) {
                System.out.println("Loop " + counter++);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                    isActive = false;
                }
            }
        }
    }
}
