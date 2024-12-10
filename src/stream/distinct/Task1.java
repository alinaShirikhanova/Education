package stream.distinct;

import java.util.List;
import java.util.stream.Stream;

// Объедините два списка строк,
// удалите дубликаты и отсортируйте их в алфавитном порядке.
public class Task1 {
    public static void main(String[] args) {
        List<String> list1 = List.of("Banana", "Apple", "Cherry");
        List<String> list2 = List.of("Apple", "Date", "Cherry");
        Stream.concat(list1.stream(), list2.stream()).distinct().sorted().forEach(System.out::println);
    }
}
