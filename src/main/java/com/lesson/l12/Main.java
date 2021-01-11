package com.lesson.l12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {


    static int  a = 5;
    int  b = 5;

    public Main(int b) {
        this.b = b;
    }

    public  void setA(int a) {
        Main.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main(5);
        Main main1 = new Main(5);
        main1.setA(7);
        main1.setB(8);
        main.setA(9);
        System.out.println(main1.b+" "+ main1.getA());





        Number number = new Number(3); //ж
        Number number1 = new Number(5); //м
        number1.setJ(4);
        number.setJ(6);
        MyThread myThread = new MyThread(number);
        MyThread myThread1 = new MyThread(number1);
        MyThread myThread2 = new MyThread(number);
        MyThread myThread3 = new MyThread(number);
        myThread.start();
        myThread1.start();
    //    myThread2.start();
     //   myThread3.start();
        myThread.join();
        myThread1.join();
     //   myThread2.join();
    //    myThread3.join();
        System.out.println(number.getNumber() +" "+Number.getJ());
    }

   static class MyThread extends Thread {
        Number number;

       public MyThread(Number number) {
           this.number = number;
       }

       @Override
       public void run() {
           number.changeNumberMinus();
           number.changeNumberPlus(); // 5 //6
           Number.changeNumberPlus2();
       }
   }
   static class My2 implements Runnable {
       @Override
       public void run() {

       }
   }
   static class Number {
        private int i;
        private static int j;
        Lock lock = new ReentrantLock();
       public void setJ(int j) {
           Number.j = j;
       }

       public Number(int i) {
           this.i = i;
       }


       public synchronized static  void changeNumberPlus2() {
           int k = Number.j;  //2  5
           k++; //1 6
           Number.j=k; // 6
       }


       public synchronized   void changeNumberMinus() {
           lock.lock();
           int k = this.i;  //2  5
           k--; //1 6
           this.i=k; // 6

       }
       public  void changeNumberPlus() {

           int k = this.i;  //2  5
           k++; //1 6
           this.i=k; // 6
           lock.unlock();
       }
   /*  public   void changeNumberPlus() {
         synchronized (this //3 //м // 3 //ж) {
             int k = this.i;  //2  5
             k++; //1 6
             this.i = k; // 6
         }
     }*/
   public  static  void changeNumberPlus22() {
       synchronized (Number.class) {
           int k = Number.j;  //2  5
           k++; //1 6
           Number.j = k; // 6
       }
   }

       public int getNumber() {
           return i;
       }

       public static int getJ() {
           return j;
       }
   }
}
