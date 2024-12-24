package stream.groupingBy.task6;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", "Java", "Love");
        System.out.println(stringList.stream().collect(Collectors.groupingBy(
                s -> s.charAt(0), Collectors.summingInt(String::length)
        )));


    }
}
