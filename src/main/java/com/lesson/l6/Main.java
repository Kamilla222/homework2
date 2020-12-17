package com.lesson.l6;

import com.lesson.l4.easy.Cat;
import com.lesson.l4.easy.Main7;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
     Set<Integer> a = new LinkedHashSet<>();
        Set<Integer> a1 = new TreeSet<>();
     a.add(1);
     a.add(2);
     a.add(5);
        a1.add(1554453);
        a1.add(23254);
        a1.add(512322);

        a.forEach(System.out::println);
        a1.forEach(System.out::println);


       Map<String,String> b = new HashMap<>(1000);
      // Cat cat = new Cat(1,"Tom");
       b.put("sad","asd");



      //  System.out.println(b.get(cat));
     //   b.forEach((k,v)->System.out.println(k+" "+v));

    }
}
