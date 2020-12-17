package com.lesson.l5.online.task.medium.Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

/*Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3. Программа должна выводить самую короткую строку на экран.
4. Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/
public class Main3 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        list.sort(comparator);
        String tempString = list.get(0);
        List<String> listConclusion = new ArrayList<>();
        listConclusion.add(tempString);
        for (int i = 1; i < list.size(); i++) {
            if (tempString.length() == list.get(i).length()) {
                listConclusion.add(list.get(i));
            }
        }
        listConclusion.forEach(System.out::println);
    }
}