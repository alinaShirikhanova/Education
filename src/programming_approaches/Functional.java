package programming_approaches;

import java.util.Arrays;
import java.util.List;

public class Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum); // Функциональный способ суммирования
        System.out.println("Сумма: " + sum);
    }
}


