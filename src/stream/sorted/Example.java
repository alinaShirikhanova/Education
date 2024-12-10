package stream.sorted;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
//        System.out.println(Stream.of(1, 2, 3).sorted((o1, o2) -> o2 - o1).toList());
        Stream<Integer> st1 = Stream.of(1,2,3,4,5).filter(elem-> elem % 2 == 0);
        Stream<Integer> st2 = Stream.of(1,2,3,4,5);
        Stream<Integer> st3 = Stream.concat(st1, st2);
        st3.forEach(System.out::println);

    }
}
