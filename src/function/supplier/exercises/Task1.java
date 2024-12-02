package function.supplier.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

//Задача 1: Сгенерировать список случайных чисел
//Условие: Напишите программу, которая с помощью
// Supplier генерирует список из 10 случайных чисел.
public class Task1 {
    public static void main(String[] args) {
        System.out.println(generateNumbers(10));
    }

    public static List<Integer> generateNumbers(int times) {
        Supplier<Integer> generateNumber = () -> new Random().nextInt(100);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            list.add(generateNumber.get());
        }
        return list;
    }
}
