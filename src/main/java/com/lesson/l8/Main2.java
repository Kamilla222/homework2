package com.lesson.l8;

import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Main2 {
    @SneakyThrows
    public static void main(String[] args) {
        File file2 = new File("test2.txt");
        String text = "Hello, Kamilla Привет"; //ACII

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8),1,3);
        int temp = 0;
        while ((temp = arrayInputStream.read())!=-1) {
            System.out.print((char) temp);
        }

    }
}
