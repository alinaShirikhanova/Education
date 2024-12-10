package stream.concat;

import java.util.stream.Stream;
// Задача 1: Объединить и отсортировать
// Объедините два потока строк и отсортируйте результат в алфавитном порядке.

public class Task1 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Banana", "Apple", "Cherry");
        Stream<String> stream2 = Stream.of("Date", "Fig", "Grape");

        System.out.println(Stream.concat(stream1, stream2).sorted().toList());

    }
}
