package stream.concat;

import java.util.stream.Stream;

//Задача 3: Объединение потоков строк и фильтрация
//Объедините два потока строк и оставьте только те, длина которых больше 3 символов.
public class Task3 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Hi", "Java", "Stream");
        Stream<String> stream2 = Stream.of("API", "World", "Concat");
        Stream<String> stream3 = Stream.concat(stream1, stream2).filter(line -> line.length() > 3);
        stream3.forEach(System.out::println);
    }
}
