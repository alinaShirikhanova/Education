package stream.flatMap;
// Расплющивание списка списков строк
//У вас есть список списков строк,
// и вам нужно получить один список всех строк из всех этих подсписков.


import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "grape"),
                Arrays.asList("kiwi", "pear"));
        System.out.println(listOfLists.stream().flatMap(List::stream).toList());
    }
}
