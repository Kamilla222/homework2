package com.lesson.l7.task;




import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * /*
 * Работа с датами
 * Реализуй метод printDate(String date).
 * Он должен в качестве параметра принимать дату (в одном из 3х форматов) и выводить ее в консоль
 * в соответствии с примером:
 * 1) Для «21.4.2014 15:56:45» вывод должен быть:
 * День: 21
 * День недели: 1
 * День месяца: 21
 * День года: 111
 * Неделя месяца: 4
 * Неделя года: 17
 * Месяц: 4
 * Год: 2014
 * AM или PM: PM
 * Часы: 3
 * Часы дня: 15
 * Минуты: 56
 * Секунды: 45
 * 2) Для «21.4.2014»:
 * День: 21
 * День недели: 1
 * День месяца: 21
 * День года: 111
 * Неделя месяца: 4
 * Неделя года: 17
 * Месяц: 4
 * Год: 2014
 * 3) Для «17:33:40»:
 * AM или PM: PM
 * Часы: 5
 * Часы дня: 17
 * Минуты: 33
 * Секунды: 40
 */
//Используй Java 8
public class Main {
    public static void main(String[] args) {
        printDate("21.04.2014");
        System.out.println();
        printDate("21.04.2014 15:56:45");
        System.out.println();
        printDate("17:33:40");
        System.out.println();
    }
    public static void printDate(String date) {

        switch (date.length()) {

            case 19 :

                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
                LocalDateTime localDate1 = LocalDateTime.parse(date, dateTimeFormatter);
                System.out.println(localDate1.format(dateTimeFormatter));
                System.out.println("День: " + localDate1.getDayOfMonth());
                System.out.println("День недели: " + localDate1.getDayOfWeek().getValue());
                System.out.println("День месяца: " + localDate1.getDayOfMonth());
                System.out.println("День года: " + localDate1.getDayOfYear());
                System.out.println("Неделя месяца: " + localDate1.get(WeekFields.of(Locale.getDefault()).weekOfMonth()));
                System.out.println("Месяц: " + localDate1.getMonthValue());
                System.out.println("Год: " + localDate1.getYear());
                LocalTime localTime1 = LocalTime.parse(date, dateTimeFormatter); //?
                System.out.println("AM или PM: " + (localTime1.get(ChronoField.AMPM_OF_DAY) == 0 ? "AM" : "PM")); //?
                System.out.println("Часы: " + localTime1.get(ChronoField.HOUR_OF_AMPM));
                System.out.println("Часы дня: " + localTime1.getHour());
                System.out.println("Минуты: " + localTime1.getMinute());
                System.out.println("Секунды: " + localTime1.getSecond());
                break;
            case 10:

                dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
                System.out.println(localDate.format(dateTimeFormatter));
                System.out.println("День: " + localDate.getDayOfMonth());
                System.out.println("День недели: " + localDate.getDayOfWeek().getValue());
                System.out.println("День месяца: " + localDate.getDayOfMonth());
                System.out.println("День года: " + localDate.getDayOfYear());
                System.out.println("Неделя месяца: " + localDate.get(WeekFields.of(Locale.getDefault()).weekOfMonth()));
                System.out.println("Месяц: " + localDate.getMonthValue());
                System.out.println("Год: " + localDate.getYear());
                break;

            case 8:

                dateTimeFormatter = DateTimeFormatter.ofPattern("H:m:s");
                LocalTime localTime = LocalTime.parse(date, dateTimeFormatter); //?
                System.out.println("AM или PM: " + (localTime.get(ChronoField.AMPM_OF_DAY) == 0 ? "AM" : "PM")); //?
                System.out.println("Часы: " + localTime.get(ChronoField.HOUR_OF_AMPM));
                System.out.println("Часы дня: " + localTime.getHour());
                System.out.println("Минуты: " + localTime.getMinute());
                System.out.println("Секунды: " + localTime.getSecond());
                break;


        }
    }
}
