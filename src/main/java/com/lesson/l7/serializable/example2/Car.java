package com.lesson.l7.serializable.example2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Externalizable {
    private String name;
    private Engine engine;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
      //  out.writeObject(engine);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
       this.name= (String) in.readObject();
        this.engine = (Engine) in.readObject();
    }
}
