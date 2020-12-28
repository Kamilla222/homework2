package com.lesson;

public abstract class Animal {
    private  int a = 2;
    public void jump() {
        System.out.println("Jump");
    }
    public void run() {
        System.out.println("Jump");
    }
   // public abstract void voice();


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
