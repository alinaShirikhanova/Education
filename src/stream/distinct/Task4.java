package stream.distinct;

import java.util.List;
import java.util.stream.Stream;

// Объедините три списка чисел,
// удалите дубликаты и найдите минимальное значение среди уникальных чисел.
public class Task4 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(100, 20, 30, 40);
        List<Integer> list2 = List.of(30, 40, 50, 60);
        List<Integer> list3 = List.of(35, 45, 55, 66);
//        System.out.println(Stream.concat(Stream.concat(list1.stream(), list2.stream()), list3.stream()).distinct().reduce(Integer.MAX_VALUE, Integer::min));
        System.out.println(Stream.concat(Stream.concat(list1.stream(), list2.stream()), list3.stream()).distinct().min(Integer::compareTo).orElseThrow());
    }
}
