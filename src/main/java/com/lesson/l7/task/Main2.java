package com.lesson.l7.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * /* Работа с датой
 * 1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
 * если количество дней с начала года - нечетное число, иначе false
 * 2. String date передается в формате MAY 1 2013
 * Не забудьте учесть первый день года.
 * Пример:
 * JANUARY 1 2000 = true
 * JANUARY 2 2020 = false
 * */
//Используй Java 8
public class Main2 {
    public static void main(String[] args) {
        System.out.print(isDateOdd("May 1 2013"));
    }
    public static boolean isDateOdd(String date) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d yyyy",
                new Locale("en", "EN"));
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        System.out.print(localDate.format(dateTimeFormatter).toUpperCase() + " = ");

        if (localDate.getDayOfYear() % 2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
