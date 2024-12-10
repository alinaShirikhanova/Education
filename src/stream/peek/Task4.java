package stream.peek;

import java.util.stream.IntStream;

// Задача 5: Подготовка данных
//Вам нужно подготовить данные для аналитики:
// отфильтровать отрицательные числа,
// умножить оставшиеся на 2 и сохранить их в списке. Логируйте результаты с помощью peek().
public class Task4 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(-10, 20)
                .peek(System.out::println)
                .boxed()
                .filter(num -> num > 0)
                .peek(System.out::println)
                .map(num -> num * 2)
                .peek(System.out::println)
                .toList());
    }
}
