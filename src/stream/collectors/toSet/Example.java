package stream.collectors.toSet;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // Пример 1: Собираем уникальные элементы в множество
        Set<String> set = Stream.of("apple", "banana", "apple", "cherry").collect(Collectors.toSet());
        System.out.println(set); // [banana, cherry, apple]


        Set<Character> charSet1 = Stream.of("apple", "banana", "cherry")
                .flatMap(line -> line.chars().mapToObj(s -> (char) s)).collect(Collectors.toSet());


// Пример 2: Собираем уникальные числа
        Set<Integer> numbersSet = Stream.of(1, 2, 3, 1, 2).collect(Collectors.toSet());
        System.out.println(numbersSet); // [1, 2, 3]

// Пример 3: Собираем уникальные длины строк
        Set<Integer> lengthsSet = Stream.of("apple", "banana", "cherry")
                .map(String::length)
                .collect(Collectors.toSet());
        System.out.println(lengthsSet); // [5, 6]

// Пример 4: Собираем уникальные символы из строк
        Set<Character> charSet = Stream.of("apple", "banana", "cherry")
                .flatMap(str -> str.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());
        System.out.println(charSet); // [a, b, c, e, h, l, n, p, r, y]

// Пример 5: Собираем уникальные студенческие ID
        Set<Integer> studentIds = Stream.of(101, 102, 103, 101, 104)
                .collect(Collectors.toSet());
        System.out.println(studentIds); // [101, 102, 103, 104]
    }
}
