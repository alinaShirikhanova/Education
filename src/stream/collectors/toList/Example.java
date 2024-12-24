package stream.collectors.toList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // Пример 1: Собираем строки в список
        List<String> list = Stream.of("apple", "banana", "cherry").collect(Collectors.toList());
        System.out.println(list); // [apple, banana, cherry]

// Пример 2: Собираем числа в список
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
        System.out.println(numbers); // [1, 2, 3, 4, 5]

// Пример 3: Собираем результаты в список, преобразуя элементы
        List<Integer> lengths = Stream.of("apple", "banana", "cherry")
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths); // [5, 6, 6]

// Пример 4: Собираем числа, фильтруя четные
        List<Integer> evenNumbers = Stream.of(1, 2, 3, 4, 5, 6)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // [2, 4, 6]

// Пример 5: Собираем имена студентов в список
        List<String> students =  Stream.of("John", "Alice", "Bob")
                .collect(Collectors.toList());
        System.out.println(students); // [John, Alice, Bob]

    }
}
