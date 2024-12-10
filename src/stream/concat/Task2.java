package stream.concat;

import java.util.List;
import java.util.stream.Stream;

// Есть два списка чисел. Объедините их, исключив
// повторяющиеся элементы, и выведите результат.
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(100, 20, 30, 40);
        List<Integer> list2 = List.of(30, 40, 50, 60);

        Stream<Integer> list3 = Stream.concat(list1.stream(), list2.stream()).distinct();
       list3.forEach(System.out::println);
    }
}
