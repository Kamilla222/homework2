package com.lesson.l6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main2 {
    public static void main(String[] args)  {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(0);
        System.out.println(date1);
        System.out.println(date.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,2);
        System.out.println(calendar.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        Date calendar1 = null;
        try {
            calendar1 = simpleDateFormat.parse("12.02.2020");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(simpleDateFormat.format(calendar1.getTime()));

        //Это было, кошмарно, выше код - фу!!!

        // Появился в Java 8

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2000, 2,1);

        System.out.println(localDate1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(localDate.format(dateTimeFormatter));
        localDate = LocalDate.parse("23.10.1999",dateTimeFormatter);
        System.out.println(localDate.format(dateTimeFormatter));


    }
}
