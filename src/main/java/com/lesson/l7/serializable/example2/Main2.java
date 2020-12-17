package com.lesson.l7.serializable.example2;

import com.lesson.l7.serializable.Girl;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car("BMW",new Engine("мотор"));

        String path = "C:"+ File.separator+"Users"+File.separator+"roman.boloban"+File.separator+"Desktop"
                +File.separator+"f"+File.separator+"homework2"+File.separator+"src"+File.separator+"main"+File.separator+
                "java"+File.separator+"com"+File.separator+"lesson"+File.separator+"l7"+File.separator+"serializable"
                +File.separator+"girl.txt";
        File file = new File(path);
        file.getParentFile().mkdirs();
        file.createNewFile();
        //girl - > 2132432 -> указаываю путь куда я сохраню
        ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(file));
        //girl <- 2132432 <- указаываю путь куда откуда я буду брать
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(file));
        objectOutput.writeObject(car);
        Car car1 = (Car) objectInput.readObject();
        System.out.println(car1);
    }
}
