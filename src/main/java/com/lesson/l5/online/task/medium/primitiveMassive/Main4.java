package com.lesson.l5.online.task.medium.primitiveMassive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Создать массив на 15 целых чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
 * Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы
 * проживает больше жителей.
 * 4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами
 * проживает больше жителей."
 *
 * Примечание:
 * дом с порядковым номером 0 считать четным.
 *
 * Требования:
 * Программа должна создавать массив на 15 целых чисел.
 * Программа должна считывать числа для массива с клавиатуры.
 * Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных
 * элементов массива больше суммы четных.
 * Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов
 * массива больше суммы нечетных.
 */
public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[15];
        int evenNumber = 0; //четное
        int oddNumber = 0; //нечетное
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(r.readLine());

            if (number[i] % 2 == 0) {
                evenNumber = evenNumber + number[i];
            } else if (number[i] % 2 != 0) {
                oddNumber = oddNumber + number[i];
            }
        }
        if (evenNumber > oddNumber) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (evenNumber < oddNumber) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}