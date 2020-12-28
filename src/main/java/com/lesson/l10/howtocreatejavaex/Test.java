package com.lesson.l10.howtocreatejavaex;

public class Test {

    public static void main(String[] args) {

        try {
            System.out.println(getMyName());
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
    public static String getMyName() throws MyException {
        return "Roman";
    }
}
