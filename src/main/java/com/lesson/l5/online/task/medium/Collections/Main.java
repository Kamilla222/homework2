package com.lesson.l5.online.task.medium.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

/*
  Усложним задачу.
  Реши эту задачу одной или двумя строчками используя Java 8.
  (Если сможешь :D)
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("bat");
        list.add("owl");
        list.add("rat");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
            

        }

    }
}
