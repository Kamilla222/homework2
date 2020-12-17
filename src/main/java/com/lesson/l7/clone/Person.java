package com.lesson.l7.clone;

// Cloneable он говорит jvm, что ок. Можем клонировать наш объект
public class Person implements Cloneable {
    private String name;
    private int age;
    private String eyes;
    private Child child; // клонируется ссылка у объекта, если мы используем shallow copy
    private Child2 child2;

    public Person(String name, int age, String eyes, Child child) {
        this.name = name;
        this.age = age;
        this.eyes = eyes;
        this.child = child;
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

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (eyes != null ? !eyes.equals(person.eyes) : person.eyes != null) return false;
        return child != null ? child.equals(person.child) : person.child == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (eyes != null ? eyes.hashCode() : 0);
        result = 31 * result + (child != null ? child.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyes='" + eyes + '\'' +
                '}';
    }

    //Поверхностное клонирование
    /*@Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }*/

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.child = child.clone();
        return person;
    }
}
