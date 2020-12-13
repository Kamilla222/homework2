package com.lesson.l5.online.task.medium.Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 10 строчек с клавиатуры.
 * 3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
 * Если таких строк несколько, то должны быть учтены самые первые из них.
 * 4. Выведи на экран строку из п.3.
 */
/*
Требования:
Объяви переменную типа список строк и сразу проинициализируй ee.
Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
Должна быть выведена только одна строка.
 */
public class Main6 {
    public static void main(String[] args) throws IOException {
    List<String> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }
        int max = 0;
        int min = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(min).length() < list.get(i).length()) {
                min = i;
            }
            if (list.get(max).length() > list.get(i).length()) {
                max = i;
            }
        }
        if (min < max) {
            System.out.println(list.get(min));
        } else
            System.out.println(list.get(max));

    }
}
