package com.lesson.l10;

import com.lesson.Animal;
import com.lesson.Cat;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 1); //  1 перемеенная != хранит ссылку -> () new
        Cat cat1 = new Cat("Jerry", 2);
        Cat cat2 = new Cat("Tom", 1);
        Cat cat3 = cat; // присваиваю ссылку 1
       // Cat cat4 = new Cat("a",2);
        cat.setAge(12);
  //   cat.getA()
        System.out.println(cat.equals(cat1));
        System.out.println(cat.equals(cat2));
        System.out.println(cat3);
        // НО это не работает с примитивными типами
      /*  int a = 5;
        int b = a; int, byte, long, double, float, boolean
        ++a;
        System.out.println(b);*/
        cat.jump();
        cat.run();
      //  cat.voice();
        //c++ Diamond Problem
    }
}
