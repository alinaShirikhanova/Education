package stream.collectors.toMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // Тут будет ошибка ри дублировании ключей. Ниже привожу решения проблемы
//        Map<Integer, String> map = Stream.of("apple", "banana", "cherry")
//                .collect(Collectors.toMap(String::length, line-> line));
//        System.out.println(map);
        //1 вариант решенияИспользование Collectors.toMap с функцией для объединения значений:

        //Если вы хотите объединить строки с одинаковой длиной в одно значение (например, объединить их в строку), вы можете использовать третью функцию в toMap:
        Map<Integer, String> map1 = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.toMap(
                        String::length,   // Ключ — длина строки
                        line -> line,     // Значение — сама строка
                        (existing, replacement) -> existing + ", " + replacement));  // Объединение строк

        System.out.println(map1);


        // 2. Преобразование в список строк для одинаковых ключей
        //Если вы хотите сохранить все строки с одинаковой длиной в виде списка, можно изменить структуру данных, чтобы в качестве значения был список строк:
        //

        Map<Integer, List<String>> map = Stream.of("apple", "banana", "cherry")
            .collect(Collectors.groupingBy(String::length));  // Группировка по длине строк

        System.out.println(map);

        // Использование третьего аргумента в Collectors.toMap(), чтобы разрешить конфликт
        //Вы можете передать функцию, которая определяет, что делать, если два элемента имеют одинаковый ключ. Например, выбрать первое или последнее значение:
        //

        //Map<Integer, String> map = Stream.of("apple", "banana", "cherry")
        //    .collect(Collectors.toMap(
        //        String::length,   // Ключ — длина строки
        //        line -> line,     // Значение — сама строка
        //        (existing, replacement) -> existing));  // Если ключи одинаковые, выбрать первое значение
        //
        //System.out.println(map);
    }
}
