package com.lesson.l6;

public class Main9 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            if(i<3) continue; //возращает на начало цикла и итеррирует со следующего элемента
            System.out.println("hello");
        }

    }
}
