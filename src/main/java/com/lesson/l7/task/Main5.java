package com.lesson.l7.task;
/**
 Исключение при работе с массивами
 int[] m = new int[2];
 m[8] = 5;
 */
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода
    /*Создай свой Exception*/
public class Main5 {
    public static void main(String[] args)  {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
class myArrayIndexOutException extends ArrayIndexOutOfBoundsException {
    public myArrayIndexOutException() {
    }
    public myArrayIndexOutException(String s) {
        super(s);
    }
    public myArrayIndexOutException(int index) {
        super(index);
    }
}
