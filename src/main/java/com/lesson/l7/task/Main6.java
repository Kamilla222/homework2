package com.lesson.l7.task;

import java.util.ArrayList;

/**
 * Исключение при работе с коллекциями List
 * ArrayList<String> list = new ArrayList<String>();
 * String s = list.get(18);
 */
///Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода
public class Main6 {
    public static void main(String[] args) {

        try {
            ArrayList<String> arrayList = new ArrayList<>();
            String s = arrayList.get(18);
        } catch (Exception e) {
            System.out.println("oops u have a problem");
            System.out.println(e.toString());

        }
    }
}