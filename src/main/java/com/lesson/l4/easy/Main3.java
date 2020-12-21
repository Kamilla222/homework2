package com.lesson.l4.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания.
 * Выведенные числа должны быть разделены пробелом.
 */
/*
Требования:
Программа должна считывать числа c клавиатуры.
Программа должна выводить числа на экран.
Программа должна выводить три числа разделенных пробелами.
Программа должна выводить числа в порядке убывания.
 */
public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


       /* Integer[] mas = new Integer[3];
        for(int i=0; i<mas.length; i++) {
            mas[i]= Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(mas, Collections.reverseOrder());
        for (int a:mas){
            System.out.println(a);
        }*/

        //С Java 8
       /* Stream.of(Integer.parseInt(bufferedReader.readLine()),
                Integer.parseInt(bufferedReader.readLine()),
                Integer.parseInt(bufferedReader.readLine()))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);*/


//
//        if (number1 < number2 && number1 < number3 && number2 < number3) {
//            System.out.print(number3 + " " + number2 + " " + number1);
//        }
//        if (number1 < number3 && number3 < number2) {
//            System.out.print(number2 + " " + number3 + " " + number1);
//        }
//        if (number2 < number1 && number2 < number3 && number1 < number3) {
//            System.out.print(number3 + " " + number1 + " " + number2);
//        }
//        if (number2 < number3 && number3 < number1) {
//            System.out.print(number1 + " " + number3 + " " + number2);
//        }
//        if (number3 < number1 && number3 < number2 && number1 < number2) {
//            System.out.print(number2 + " " + number1 + " " + number3);
//        }
//        if (number3 < number2 && number2 < number1) {
//            System.out.print(number1 + " " + number2 + " " + number3);}
//        }
//    }


    }
}

