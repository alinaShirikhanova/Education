package stream.count;

import java.util.Arrays;

//Найдите количество уникальных чисел в массиве.
public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2};
        System.out.println(Arrays.stream(array).distinct().count());
    }
}
