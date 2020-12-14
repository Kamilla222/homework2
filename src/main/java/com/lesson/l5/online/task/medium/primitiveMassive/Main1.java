package com.lesson.l5.online.task.medium.primitiveMassive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 1. Создать массив на 10 строк.
 * 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
 * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 */
 /* Требования:
 * Программа должна создавать массив на 10 строк.
 * Программа должна считывать 8 строк для массива с клавиатуры.
 * Программа должна выводить на экран 10 строк, каждую с новой строки.
 * Программа должна выводить на экран массив (10
 */
public class Main1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];

        for (int i = 0; i < 8; i++) {
            strings[i] = bufferedReader.readLine();
        }
        for (int j = strings.length - 1; j >= 0; j--) {
            System.out.println(strings[j]);
        }
    }
}
