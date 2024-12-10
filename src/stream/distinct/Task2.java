package stream.distinct;

import java.util.Arrays;
import java.util.stream.Stream;

// Задача 2: Найти сумму уникальных чисел
//Найдите сумму всех уникальных чисел из двух массивов.
public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 1, 2};
        int[] array2 = {3, 4, 5, 5};
        System.out.println(Stream.concat(Arrays.stream(array1).boxed(), Arrays.stream(array2).boxed()).distinct().reduce(0, Integer::sum));
    }
}
