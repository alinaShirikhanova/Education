package stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        list.stream().filter(elem -> elem > 5).forEach(System.out::println);
        List<Optional<String>> items = Arrays.asList(
                Optional.of("Apple"),
                Optional.empty(),
                Optional.of("Banana"),
                Optional.of("Orange"),
                Optional.empty()
        );


        List<String> filteredItems = items.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 1;  // Массив используется для изменения переменной

        // Применяем forEach для вычисления суммы чисел
//        numbers.stream()
//                .forEach(n -> sum += n);

        System.out.println("Sum of numbers: " + sum);


        Optional<Integer> emptyResult = Stream.<Integer>empty()
                .reduce((a, b) -> a + b);


    }
}



