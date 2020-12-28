package com.lesson.l10.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java implements Calculate2 {
    public static void main(String[] args) {
        //Лямбда выражение
     /*   JavaScript:
        var testStrings = [“one”, “two”, “three”, “four”];
        testString.sort(function(s1, s2) {
            return (s1.length – s2.length) ;
        } );*/

        // До Java 8
        Calculate sum = new Calculate() {

            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        };
        Calculate minus = new Calculate() {

            @Override
            public int calc(int a, int b) {
                return a-b;
            }
        };

       int sum1 = sum.calc(5,6);
       int minus1 = minus.calc(2,5);
        System.out.println(sum1+" "+ minus1);

        //После Java 8
        Calculate sum3 = (a,b) -> a+b; // Лямбда - синтаксический сахар
        Calculate min3 = (a,b) -> a-b;
        int min4 = min3.calc(5,5);
        System.out.println(min4);

        Calculate plus5 = (int a, int b) -> {return  a+b;};
        Calculate plus5_1 = ( a,  b) -> {return  a+b;};
        Calculate plus5_2 = ( a,  b) -> a+b;
        Calculate plus5_3 = (int a, int b) -> a+b;
        //В функциональном интерфейсе может быть 1 метод

        int c = Calculate2.calc2(5,6);
        int d = new Java().calc1(1,2);

        System.out.println(d);


    }

    @Override
    public int calc(int a, int b) {
        return 0;
    }



    @FunctionalInterface
   public interface Calculate {
        int calc(int a, int b);

    }

    // До Java 8 мы не могли писать тело в методах, а теперь можем :)


  /*  abstract class T {
        abstract int calc(int a, int b);
        int calc1(int a, int b) {};
    }*/

}

@FunctionalInterface
interface Calculate2 {
     int calc(int a, int b); // В функциональном интрефейсе может быть только один метод
    //Мы можем писать код в интерефейсах! До Java 8 нельзя :)
    default int calc1(int a, int b) {
        return a+b;
    }
    static int calc2(int a, int b) {
        return a+b;
    }
}
