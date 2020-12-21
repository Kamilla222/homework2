package com.lesson.l8.reflection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Builder
public class Roman {
  private String name;
  private int age;
  private int weight;

    public Roman() {
    }
}