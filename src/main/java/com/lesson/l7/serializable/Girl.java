package com.lesson.l7.serializable;

import java.io.Serializable;
import java.util.HashMap;

public class Girl implements Serializable{

    //явно даем понять java какая версия у нашего объекта
    private static final long serialVersionUID = 1L;
    private String name;
    private static int age;
    //transient - мы не будет сериализовать это поле, то есть мы не будем сохранять это поле файл

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void setAge(int age) {
        Girl.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Girl girl = (Girl) o;

        return name != null ? name.equals(girl.name) : girl.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' + "age"+age+
                '}';
    }
}
