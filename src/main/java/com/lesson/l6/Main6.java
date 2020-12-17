package com.lesson.l6;

public class Main6 {

    public static void main(String[] args) {

        //:)
        try{
            int a = 5;
            System.exit(0);
            throw new IllegalArgumentException();

        } catch (Exception ignored) {
            System.out.println("1");
        }
        finally {
            System.out.println("4");
        }
    }
}
