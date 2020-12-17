package com.lesson.l7.task.serialization;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Метод main() считывает имя файла с консоли и заполняет runtimeStorage данными из файла.
 * В методах save() и load() реализуй логику записи в файл и чтения из файла для карты runtimeStorage.
 * Файл должен быть в формате .properties. Комментарии в файле можно игнорировать.
 * Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
 */
public class Main14 {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
    }

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
