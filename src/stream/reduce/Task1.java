package stream.reduce;
// Задача 1. Сумма квадратов четных чисел
//Напишите метод, который принимает список целых чисел и вычисляет сумму квадратов только четных чисел с помощью reduce.
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(calculateSquaresOfOdds1(List.of(1, 2, 3, 4, 5)));
        System.out.println(calculateSquaresOfOdds2(List.of(1, 2, 3, 4, 5)));

    }

    public static int calculateSquaresOfOdds1(List<Integer> numbers) {
        return numbers.stream().reduce(0, (accumulator, elem) -> accumulator + (elem % 2 == 0 ? elem * elem : 0));
    }
    public static int calculateSquaresOfOdds2(List<Integer> numbers) {
        return numbers.stream().filter(elem -> elem % 2 == 0)
                .map(elem -> elem * elem)
                .reduce(0, Integer::sum);
    }
}
