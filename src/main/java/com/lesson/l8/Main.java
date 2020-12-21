package com.lesson.l8;


import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("test.txt");
        File file1 = new File("test2.txt");
        List<Character> a =  new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
       /* while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }*/

        InputStream inputStream = new FileInputStream(file); //ACII
        InputStreamReader inputStream1 = new InputStreamReader(inputStream,"UTF-8");
       /* int temp = 0;
        while ((temp = inputStream.read())!=-1) {
            System.out.println((char) temp);
        }*/
        int temp = 0;

        while ((temp = inputStream1.read())!=-1) {
            a.add((char)temp);
        }
        char[] symb = new char[a.size()];
        for(int i = 0;i<a.size(); i++) {symb[i]=a.get(i);}

        OutputStream outputStream = new FileOutputStream(file1);
        // Текст
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,"UTF-8");
        outputStreamWriter.write(symb);
        outputStreamWriter.flush();
        outputStreamWriter.close();
      //  String content = "Hello World !!";
      //  Files.write(Paths.get("c:/output.txt"), content.getBytes());
    }
}
