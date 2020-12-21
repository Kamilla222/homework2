package com.lesson.l9.анонимный_класс;

public class Main {
    public static void main(String[] args) {
        //Мы создаем анонимный класс, когда нужен 1 объект
        //Мы создаем анонмный класс, когда нам нужны 2 и более разных объекта (LGPult, SasmungPult), но от одного интерфейса
        //А если нам нужно от одной марки модели более, чем один объект создаем класс
        Pult LGPult = new Pult() {
            @Override
            public void but1() {
                System.out.println("ВКЛ");
            }

            @Override
            public void but2() {
                System.out.println("ВЫКЛ");
            }
        };

        Pult samsungPult = new Pult() {
            @Override
            public void but1() {
                System.out.println("ВКЛ");
            }

            @Override
            public void but2() {
                System.out.println("ВЫКЛ");
            }
        };
        Pult pult = new LGPult2();
        Pult pult1 = new LGPult2();
        Pult pult2 = new LGPult2();
        Pult pult3 = new LGPult2();
        Pult pult4 = new LGPult2();
        Pult pult5 = new LGPult2();
        Pult pult6 = new LGPult2();

    }
}
