package function.function;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Supplier<Integer> randomIntSupplier = () -> new Random().nextInt(100) + 1;
        List<String> names = Arrays.asList("Smith", "Gourav", "John", "Catania");
        Function<String, Integer> nameMappingFunction = String::length;
        List<Integer> nameLength = names.stream()
                .map(nameMappingFunction).collect(Collectors.toList());
        System.out.println(nameLength);
        Map<String, Integer> map = new HashMap<>();
        Integer value = map.computeIfAbsent("Hello", String::length);
        map.putIfAbsent("Hello", 0);


        Function<Integer, String> intToString = Object::toString;
        Function<String, String> quote = s -> "'" + s + "'";

        Function<Integer, String> quoteIntToString = quote.compose(intToString);
    }
}
