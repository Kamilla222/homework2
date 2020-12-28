package com.lesson.l10.java8;

public class Java2 {
    public static void main(String[] args) {
        long l1 = System.nanoTime();
        //Анонимный класс производительнее, чем лямбда выражение! Но начиная с JDK 11 - это стало иначе.
        // Если испеользуются JDK 11 в твоем проекте, используешь лямбда выражения не думаю
        Print print = new Print() {
            @Override
            public void print(String name) {
                System.out.println("Hello");
            }
        };
        long l2 = System.nanoTime();
        long l3 = System.nanoTime();
        Print print1 = name -> System.out.println("Hello");
        long l4 = System.nanoTime();
        System.out.println(l2-l1);
        System.out.println(l4-l3);
    }

    @FunctionalInterface
    interface Print {
        void print(String name);
    }
}
