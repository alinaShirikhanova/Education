package stream.concat;

import java.util.List;
import java.util.stream.Stream;

//Комплексные задачи
//Задача 4: Найти сумму уникальных чисел
//Объедините два списка чисел, оставьте только
// уникальные элементы и найдите их сумму.
public class Task4 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);

        System.out.println(Stream.concat(list1.stream(), list2.stream()).distinct().reduce(0, (Integer::sum)));

    }
}
