package programming_approaches;

import java.util.Arrays;
import java.util.List;

public class Imperative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int number : numbers) {
            sum += number; // Изменяем значение переменной sum
        }
        System.out.println("Сумма: " + sum);
    }
}
