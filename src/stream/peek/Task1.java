package stream.peek;

import java.util.stream.Stream;

// Задача 1: Логирование промежуточных результатов
//Создайте поток строк, отфильтруйте строки длиной менее 4 символов,
// преобразуйте оставшиеся строки в верхний регистр и соберите их в список.
// Используйте peek() для логирования на каждом этапе.
public class Task1 {
    public static void main(String[] args) {
        System.out.println(Stream.of("Sydney", "Dhaka", "London", "Syd", "Dha", "Lon")
                .filter(line -> line.length() < 4)
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .toList());

    }
}
