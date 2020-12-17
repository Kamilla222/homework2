package com.lesson.l6;

import java.util.ArrayList;
import java.util.List;

public class Main10 {
    public static void main(String[] args) {
        //UpCasting
        Dog dog = new Dog();
        Animal animal = (Animal) dog;
        System.out.println(animal);
        //DownCasting
        Animal animal1 = new HomeDog();
        Dog dog1 = (Dog) animal1;
        //DownCasting очень опасная вещь
        Animal animal2 = new Animal(); // ошибка компиляций
        Dog dog2 = (Dog) animal2;

    }
}
