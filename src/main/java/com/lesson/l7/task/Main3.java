package com.lesson.l7.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *  Номер месяца
 * Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
 * Используйте коллекции.
 * */
 // Java 8
public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);


        Set<Map.Entry<String, Integer>> set = map.entrySet();
        String monthName = bufferedReader.readLine();
        for (Map.Entry<String, Integer> nm : set) {

            if (nm.getKey().equals(monthName)) {
                System.out.println(nm.getKey() + " is " + nm.getValue() + " month");
            }
        }
    }
}
