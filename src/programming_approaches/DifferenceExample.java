package programming_approaches;

import java.util.Arrays;
import java.util.List;

public class DifferenceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .forEach(System.out::println); // Вывод на консоль (побочный эффект)
    }
}



