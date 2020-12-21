package com.lesson.l8;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {

    public static void main(String[] args) {

       try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in))) {
          bufferedReader.readLine();
          bufferedReader1.readLine();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
