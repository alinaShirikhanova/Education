package stream.reduce;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<List<Integer>> nestedLists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8, 9),
                List.of()
        );

        int maxLength = nestedLists.parallelStream()
                .map(List::size) // Преобразуем в длины списков
                .reduce(0, Integer::max); // Находим максимум

        System.out.println("Max length: " + maxLength); // 4
    }
}
