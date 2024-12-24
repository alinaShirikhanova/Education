package exercises;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = List.of("Alina", "Anton", "Alina");
        System.out.println(list.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting())));
    }

}
