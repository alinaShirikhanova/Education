package stream.concat;

import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Stream<Integer> st1 = Stream.of(1,2,3,4,5).filter(elem-> elem % 2 == 0);
        Stream<Integer> st2 = Stream.of(1,2,3,4,5);
        Stream<Integer> st3 = Stream.concat(st1, st2);
        st3.forEach(System.out::println);

        // Объединение двух списков
        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("D", "E", "F");

        Stream<String> combinedStream = Stream.concat(list1.stream(), list2.stream());
        combinedStream.forEach(System.out::println);



    }
}
