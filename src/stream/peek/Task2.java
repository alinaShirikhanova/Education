package stream.peek;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

//Задача 3: Уникальные элементы
//Используя поток, удалите дубликаты и запишите
// оставшиеся элементы в внешний список.
// Используйте peek() для вывода обрабатываемых данных.
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        IntStream stream = random.ints(100, 1, 100);
        System.out.println(stream.boxed()
                .peek(System.out::println)
                .distinct()
                .peek(list::add).toList());
        System.out.println(list);
    }
}
