package com.lesson.l4.easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
 * Если два числа равны между собой, необходимо вывести любое.
 */

/*Требования:
Программа должна считывать числа c клавиатуры.
Программа должна выводить число на экран.
Программа должна выводить на экран минимальное из двух целых чисел.
Если два числа равны между собой, необходимо вывести любое
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer number1 = Integer.parseInt(bufferedReader.readLine());
        Integer number2 = Integer.parseInt(bufferedReader.readLine());

        if (number1 > number2 || number1.equals(number2)) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }

    //Написать здесь код
}

