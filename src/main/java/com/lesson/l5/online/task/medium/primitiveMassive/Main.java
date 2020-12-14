package com.lesson.l5.online.task.medium.primitiveMassive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
/*Требования:
Метод initializeArray должен создавать массив из 20 целых чисел.
Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
Метод max должен возвращать максимальный элемент из переданного массива.
Метод main изменять нельзя.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int [] array = initializeArray();
        int max = max(array);
        System.out.println(max);

    }

    public static int[] initializeArray() throws IOException {
        int [] array = new int [3];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<array.length; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        // создай и заполни массив
        //return new int[0];
        return array;
        }

        public static int max(int[] array){
        int max = array[20];
        for (int i = 0; i < array.length; i++) {
            if (max > array[i])
                max = array [i];


        }
            return max;
        }
}
