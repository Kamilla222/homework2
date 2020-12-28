package com.lesson.l5.online.task.medium;

/**
 * Сделать класс StringСoncat, у которого будут 2 статических метода:
 * String multiply(String s, int count) - возвращает строку повторенную count раз.
 * String multiply(String s) - возвращает строку повторенную 5 раз.
 *
 * Пример:
 * Амиго -> АмигоАмигоАмигоАмигоАмиго
 */
 /* Требования:
 * Программа не должна считывать данные с клавиатуры.
 * Методы класса StringСoncat должны возвращать строку.
 * Методы класса StringСoncat должны быть статическими.
 * Методы класса StringСoncat должны быть public.
 * Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
 * Метод multiply(String s) должен возвращать строку повторенную 5 раз.
 */
public class StringConcat {

    public static String multiply(String s) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            string.append(s);
    }
        System.out.println(string);

        return string.toString();
}
    public static String multiply(String s, int count) {
        StringBuilder string2 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            string2.append(s);
        }

        System.out.println(string2);
        return string2.toString();
    }

    public static void main(String[] args) {
       StringConcat.multiply("hi");
       StringConcat.multiply("hello",2);

    }
}
