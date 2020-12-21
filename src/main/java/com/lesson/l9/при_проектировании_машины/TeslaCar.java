package com.lesson.l9.при_проектировании_машины;

import com.lesson.l9.pattern.MySingleton;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeslaCar {
    private Engine engine;
    private Seat seat;
    private Wheel wheel;
    private static int count;


    //nested-class - вложенный класс. Не можем создать статические поля и методы. Используем модификатор доступ private
    // при проектирований нашего приложения
    @Data
    private class Engine {
        public void start() {
            ++count;
            System.out.println("Запустился мотор" + "" + count);
        }

    }

    @Data
    //Должно быть private
    public class Seat {
        public void say() {
            System.out.println("С подогревом");
        }
    }

    @Data
    private class Wheel {

    }

    //static-nested-class - внутренний класс. Используем модификатор доступ public
    // В качестве какого-то чертежа, не привязанности класса
    public static class Passengers {
        private static int seats = 4;
        private int d;

        public static int getPassengers() {
            return seats;
        }

        public int getPassengers1() {
            return d;
        }

    }

    //Method local inner-class
    // До версий Java 8 мы указывааем над полем модифиактор final
    //В Java 8 поведение локальных классов было изменено.
    // В этой версии языка локальный класс имеет доступ не только к final-локальным переменным и параметрам, но и к effective-final.
    // Effective-final называют переменную, значение которой не менялось после инициализации.
    public void say() {
        //   final String myName = "Roman"; // До Java 8
        String myName = "Roman"; // После Java 8
        @Data
        class Jarvis {
            private String name;

            public void say() {
                System.out.println("Hello " + myName + ". I'm " + name);
            }
        }
        Jarvis jarvis = new Jarvis();
        jarvis.say();
    }


    public static void main(String[] args) {

      /*  TeslaCar.Engine engine = new TeslaCar().new Engine();
        TeslaCar tesla1 = new TeslaCar();
        engine.start();
        engine.start();
        tesla1.setEngine(engine);
        System.out.println(tesla1);
        int v = TeslaCar.Passengers.getPassengers();
        TeslaCar.Passengers tesla5 = new TeslaCar.Passengers();
        System.out.println(v);
        System.out.println();
        TeslaCar teslaCar = new TeslaCar();
        teslaCar.say();*/

        TeslaCarByAudi teslaCar = new TeslaCarByAudi();
        teslaCar.say();
        TeslaCarByBmw teslaCar1 = new TeslaCarByBmw();
        teslaCar1.say();
        teslaCar.say();
        //Так можно создать, но на практике не используется
        TeslaCar teslaCar2 = new TeslaCar() {
            @Override
            public void say() {
                System.out.println("Я Тесла кар от БМВ");
            }
        };
        teslaCar2.say();
        Car car = () -> System.out.println("Я Тесла кар от БМВ ");
        Car car2 = new Car() {
            @Override
            public void sayCar() {
                System.out.println("Я Тесла кар от Ауди ");
                System.out.println("bla-bla");
            }
        };
        car.sayCar();
        car2.sayCar();
        Car2 car21 = myName -> System.out.println(myName);;
        MySingleton.Database oracle = MySingleton.getDataBase();
        MySingleton.Database oracle1 = MySingleton.getDataBase();
        System.out.println(oracle);
        System.out.println(oracle1);
    }
}
//Так можно создать, но на практике не используется
class TeslaCarByBmw extends TeslaCar{
    @Override
    public void say() {
        System.out.println("Я Тесла кар от БМВ");
    }
}
class TeslaCarByAudi extends TeslaCar {
    @Override
    public void say() {
        System.out.println("Я Я Тесла кар от Ауди");
    }
}
//Анонимные классы используются с интерфейсами
interface Car {
    void sayCar();
}
interface Car2 {
    void say(String name);
}
