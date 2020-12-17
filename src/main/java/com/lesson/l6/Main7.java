package com.lesson.l6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main7 {
    public static void main(String[] args) {

     /*   List<Integer> list = Arrays.asList(2,5,1,563,14,5654,124,657657,23432,5436);
        Collections.sort(list);
        list.forEach(System.out::println);

        List<Cat> listCat = Arrays.asList(new Cat("Roma",12),new Cat("Karina",4),
                new Cat("Tom",5));
        Comparator<Cat> catComparatorAge = Comparator.comparingInt(Cat::getAge);
        Comparator<Cat> catComparatorNameLength = Comparator.comparingInt(o -> o.getName().length());
        Collections.sort(listCat,catComparatorNameLength);
        listCat.forEach(System.out::println);*/

        //Java 8
        Set<Cat> listCat1 = Stream.of(new Cat("Roma",12),new Cat("Karina",4),
                new Cat("Tom",5))
                .sorted(Comparator.comparing(Cat::getAge))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        listCat1.forEach(System.out::println);


    }
}
