package com.lesson.l7.serializable.example2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Engine implements Serializable {
    private String engine;
}
