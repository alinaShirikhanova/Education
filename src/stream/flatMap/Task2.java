package stream.flatMap;

import java.util.List;

//  Преобразование строк в их символы
//У вас есть список строк, и вам нужно
// получить список всех символов этих строк.
public class Task2 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "orange");
        System.out.println(words.stream().flatMap(line -> line.chars().mapToObj(c -> (char) c)).sorted().toList());
    }
}
