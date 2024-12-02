package programming_approaches;

import java.util.Arrays;
import java.util.List;

public class Declarative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum(); // Просто описываем, что мы хотим получить
        System.out.println("Сумма: " + sum);
    }
}

