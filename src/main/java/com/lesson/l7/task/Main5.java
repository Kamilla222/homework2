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
            {
                throw new myArrayIndexOutException();
            }
        } catch (myArrayIndexOutException e) {
            System.out.println(e.getMessage());
        }
    }
}
class myArrayIndexOutException extends Exception {
    public myArrayIndexOutException() {
    }
    public myArrayIndexOutException(String message) {
        super(message);
    }

    public myArrayIndexOutException(String message, Throwable cause) {
        super(message, cause);
    }

    public myArrayIndexOutException(Throwable cause) {
        super(cause);
    }
}
