package stream.flatMap;

import java.util.*;
import java.util.stream.*;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange");

        List<Character> characters = words.stream()
                .flatMap(word -> word.chars()   // превращаем слово в поток чисел (char)
                        .mapToObj(c -> (char) c))      // преобразуем int в Character
                .collect(Collectors.toList());

        System.out.println(characters);  // [a, p, p, l, e, b, a, n, a, n, a, o, r, a, n, g, e]

        Integer i = 5;
        System.out.println((Character) (char) i.intValue());
        String n1ame$ = "hello";
        System.out.println(n1ame$);



        byte a = 10 + 5;
//        byte b = 100 + 50;
//        byte c = 127 + 0;
        byte d = 50 * 2;

    }
}