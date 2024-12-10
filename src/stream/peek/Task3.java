package stream.peek;

import java.util.stream.IntStream;

// Задача 2: Подсчет количества элементов
//Дан поток чисел. Подсчитайте количество элементов,
// которые больше 10, используя peek() для вывода промежуточных данных.
public class Task3 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 20)
                .boxed()
                .filter(num -> num > 10).peek(System.out::println)
                .count());
    }
}
