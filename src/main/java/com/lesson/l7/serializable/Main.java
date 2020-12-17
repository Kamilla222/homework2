package com.lesson.l7.serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Girl girl = new Girl("Maria",1);
        String path = "C:"+File.separator+"Users"+File.separator+"roman.boloban"+File.separator+"Desktop"
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
        objectOutput.writeObject(girl);
        Girl.setAge(23);
        Girl girl1 = (Girl) objectInput.readObject();
        System.out.println(girl1);
    }
}
