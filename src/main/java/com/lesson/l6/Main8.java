package com.lesson.l6;

public class Main8 {
    public static void main(String[] args) {

       /* Integer a = 4;
       int b = a;
        ++a;
        System.out.println(b);
        ++a;
       // System.out.println(v);*/


      int[] av = new int[1];  //ссылочный тип av <- (int[1])
      int[] b = av;
      av[0] = 1;
  //      System.out.println(b[0]);
    }

    public void mazohist(int a) {
        if(a==0) return;
        mazohist(a-1);
    }
}
