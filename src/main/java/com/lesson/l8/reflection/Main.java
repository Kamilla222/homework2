package com.lesson.l8.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@Data
@AllArgsConstructor

public class Main {

   /* private int a;
    private int b;
    private int v;
    private int g;
    private int j;
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Roman roman = Roman.builder().age(2).build();
        Roman roman1 = Roman.builder().age(2).name("Roman").weight(3).build();

    }

    public static <T> T setter(Class<?> clazz) throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        Object object = clazz.newInstance();

        Field[] fields = clazz.getDeclaredFields();
        for (int i=0; i< fields.length; i++) {
            fields[i].setAccessible(true);
            fields[i].set(object,i);
        }
        return (T) object;
    }*/
}
