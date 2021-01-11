package com.lesson.l11;

import lombok.SneakyThrows;

public class Main3 {

    public static void main(String[] args) throws InterruptedException {
      start1();
      start();
    }
    public  static  void start1() throws InterruptedException {
        JoinRunnable a = new JoinRunnable("A");
        JoinRunnable b = new JoinRunnable("B");
        JoinRunnable c = new JoinRunnable("C");
        a.start();
        a.join(3000);
        b.start();
        b.join();
        c.start();

    }
    public static class JoinRunnable extends Thread {

        public JoinRunnable(String name) {
            super(name);
        }

        @SneakyThrows
        @Override
        public void run() {

        }
    }

    private static void start() throws InterruptedException {
      Main2.MyThread myThread = new Main2.MyThread();
        myThread.start();
        myThread.join();
        String currentThreadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThreadName + " is running!" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(currentThreadName + " completed");
    }
}
