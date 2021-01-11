package com.lesson.l11;

public class Main {

    public static void main(String[] args) {
        MyThread myThread1Deamon = new MyThread();
        MyThread myThread2 = new MyThread();
      //  myThread1Deamon.setDaemon(true);
     //   myThread2.setDaemon(true);
        myThread1Deamon.start();
        myThread2.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
