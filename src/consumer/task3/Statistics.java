package consumer.task3;

import java.util.List;
import java.util.function.Consumer;

//Задача 3. Вычисление и вывод статистики
//Создайте класс Statistics с методом,
// который принимает список чисел и выводит
// их минимальное, максимальное и среднее значение.
// Используйте Consumer для вывода значений на экран.
// Метод должен принимать один Consumer<Integer>,
// который будет вызываться для вывода каждого из статистических значений.
public class Statistics {
    public static void printStatistics(List<Integer> numbers, Consumer<List<Integer>> combinedConsumer) {
        combinedConsumer.accept(numbers);
    }

    public static void main(String[] args) {
        Consumer<List<Integer>> c1 = list -> System.out.println(list.stream().max(Integer::compareTo).get());
        Consumer<List<Integer>> c2 = list -> System.out.println(list.stream().min(Integer::compareTo).orElseThrow());
        Consumer<List<Integer>> c3 = list -> System.out.println(list.stream().mapToInt(Integer::intValue).average().orElse(0));
        Consumer<List<Integer>> combined = c1.andThen(c2.andThen(c3));
        printStatistics(List.of(1, 2, 3), combined);

        Consumer<List<Integer>> consumer = list -> {
            System.out.println(list.stream().max(Integer::compareTo).orElseThrow());
            System.out.println(list.stream().min(Integer::compareTo).orElseThrow());
            System.out.println(list.stream().mapToInt(Integer::intValue).average().orElse(0));
        };
        printStatistics(List.of(1, 2, 3), consumer);
    }
}
