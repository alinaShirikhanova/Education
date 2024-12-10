package stream.count;

import java.util.Arrays;
import java.util.List;

// Подсчитайте количество строк в списке, которые содержат букву a.
public class Task1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "grape");

        System.out.println(words.stream().filter(line -> line.contains("a")).count());
    }
}
