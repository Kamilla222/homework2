package com.lesson.l5.online.task.medium.primitiveMassive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 10 чисел.
 * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 * 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 */
 /* Требования:
 * Программа должна создавать массив на 10 целых чисел.
 * Программа должна считывать числа для массива с клавиатуры.
 * Программа должна выводить 10 строчек, каждую с новой строки.
 * Массив должен быть выведен на экран в обратном порядке.
 */
public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = Integer.parseInt(r.readLine());
        }
        for (int j = number.length-1; j>=0; j--) {
            System.out.println(number[j]);
        }
    }
}
