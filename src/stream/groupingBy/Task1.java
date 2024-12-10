package stream.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Напишите программу, которая группирует строки по первой букве.
public class Task1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "peach", "cherry");
        Map<Character, List<String>> map = words.stream()
                .collect(Collectors.groupingBy(line-> line.charAt(0)));
        System.out.println(map);
//        Map<Character, String> map = words.stream()
//                .collect(Collectors.groupingBy(line-> line.charAt(0), Collectors.joining(", ")));
//        System.out.println(map);

    }
}
