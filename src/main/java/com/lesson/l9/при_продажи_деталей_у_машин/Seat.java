package com.lesson.l9.при_продажи_деталей_у_машин;

import com.lesson.l9.при_проектировании_машины.TeslaCar;
import lombok.Data;

@Data
public class Seat {
    public void say() {
        System.out.println("С подогревом");
    }

    public static void main(String[] args) {
        Seat seat = new Seat();
        seat.say();
        TeslaCar.Seat seat1 = new TeslaCar().new Seat();
        seat1.say();

    }
}