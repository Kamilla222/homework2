package com.lesson.l7.task;

import java.util.HashMap;

/**
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * HashMap<String, String> map = new HashMap<String, String>(null);
 * map.put(null, null);
 * map.remove(null);
 */
///Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода
public class Main8 {
    public static void main(String[] args) { //throws Exception

        try {
            HashMap<String, String> map = new HashMap<>(null); //???m
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println(e.toString());

        }
    }
}
