package stream.distinct;

import java.util.Arrays;

// Дан текст. Найдите количество уникальных слов в нём.
//
//Решение:
public class Task3 {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana orange apple";
        System.out.println(Arrays.stream(text.split(" ")).distinct().count());
    }
}
