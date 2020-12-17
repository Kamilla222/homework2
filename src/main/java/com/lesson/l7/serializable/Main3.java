package com.lesson.l7.serializable;

import lombok.Data;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Locale;


@Data
public class Main3 implements Runnable {


    class ILoveWorld implements Runnable{
        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                Thread.sleep(100);
                System.out.println("Я ЛЮБЛЮ МИР!");
            }
        }
    }

    private Girl girl;
    private int a =100;
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InterruptedException {
        Girl girl = new Girl("Maria",24);
        Girl girl1 = new Girl("Irina",24);
        Main3 main3 =new Main3(girl);
        Main3 main4 =new Main3(girl1);
        Thread thread = new Thread(main3);
        Thread thread1 = new Thread(main4);
        Thread thread5 = new Thread(new Main3(new Girl("1",1)).new ILoveWorld());
      //  Class<Girl> girlClass = (Class<Girl>) girl.getClass();
       // Girl girl3 = Girl.class.newInstance();

      //  System.out.println(girlClass.getName());
     //   Field[] fields = girlClass.getDeclaredFields();
     /*   for (Field f: fields) {
            System.out.println(f.getName());
        }*/
        thread.start();
        thread5.start();
        int a = main3.getA();
        while(a>0) {
            Thread.sleep(100);
            System.out.println("Я не хочу больше программировать");
            a--;
        }


    }

    public Main3(Girl girl) {
        this.girl = girl;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            number(this.a);
        }

    }

    //10
    //9
  /*  8
    7
    6
    5
    4
    3
    2
    1
    0
    -1*/

    @SneakyThrows
    private static int number(int a) {
        Thread.sleep(100);
        System.out.println("Мама я не хочу учить математику :(");
       // System.out.println(a);
        if(a<0) return a;
        return number(a-1);
    }
}
