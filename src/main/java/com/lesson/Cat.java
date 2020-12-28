package com.lesson;

public class Cat extends Animal{
    private String name;
    private int age;
    private final double PI = 3.14; //private, package, protected, public

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public double getPI() {
        return PI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", PI=" + PI +
                '}';
    }

    @Override
    public void voice() {

    }

}
