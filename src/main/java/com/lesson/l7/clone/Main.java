package com.lesson.l7.clone;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //Shallow copy - копируем ссылки
     /*   Child child = new Child("Roman",1);
        Person person = new Person("Roman",12,"green",child);
        Person person1 = person.clone();
        child.setName("Michael");
        System.out.println(person1.getChild().getName());
        System.out.println(person1.equals(person));*/

        //Deep copy - копируем сами объекты
        Child2 child2 = new Child2("Andrey");
        Child child1 = new Child("Roman",1,child2);
        Person person2 = new Person("Roman",12,"green",child1);
        Person person3 = person2.clone();
        child2.setName("Irina");
      //  child1.setName("Roman1");
        System.out.println(person2.getChild().getChild2().getName());
        System.out.println(person3.getChild().getChild2().getName());
       // System.out.println(person2.getChild().getName());

      //  new Person("1",1,"fa", new Child("sad",1,new Child2("sad"));


    }
}
