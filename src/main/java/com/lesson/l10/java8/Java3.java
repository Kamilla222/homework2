package com.lesson.l10.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java3 {
    public static void main(String[] args) {
        //Работа с коллекциями
        //Стримы делятся на три части: stream - источник, конвейрные операции sorted, filter, distinct , итоговые - терменальные collect, foreach, min/max , count
        // Стримы выполнябются тогда, когда есть итоговые операции collect, foreach, min/max , count
        List<Integer> list = Arrays.asList(123,324,324342,521,332,5342,213, 521, 521, 521);
        // проигнорирует
       list.stream().sorted();
       // Comparator<Flight> flightComparator = Comparator.comparing(Flight::getDate); //(s) -> Fligt.getDate(x)

        list.stream().sorted().distinct().filter(x -> x>200).forEach(System.out::println);

     //  list.forEach(System.out::println);



    }
}
