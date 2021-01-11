package com.lesson.l10.java8;

import com.lesson.Cat;

import java.util.Optional;

public class Java4 {
    public static void main(String[] args) {


        //Optional -> удобная обертка над null. Создаем тогда, когда уверены, что может быть null
        if(getA().isPresent()) {
            System.out.println(getA().get());
        }
        else System.out.println("Пустой");

        Optional<String> name = Optional.of("John");
        System.out.println(name.orElseGet(() -> "blank")); //output John

        Optional<Object> empty = Optional.empty();
        System.out.println(empty.orElseGet(() -> "blank"));

      //  Optional<User> user = Optional.of(repository.findById(userId));

        Optional<String> name1 = Optional.of("John");
        String nameValue = name1.orElseThrow(() -> new RuntimeException());
        System.out.println(nameValue);                                      //output John

        Optional<Object> empty1 = Optional.empty();
        Object emptyValue = empty1.orElseThrow(() -> new RuntimeException()); //ja
    }

    //ofNullable(null); -> может принимать и объект и null, а of() -> только объект

    public static Optional<String> getA() {
        return Optional.ofNullable(null);

    }
}
