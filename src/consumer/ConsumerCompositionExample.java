package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerCompositionExample {
    public void whenNamesPresentConsumeAll() {
        Consumer<String> printConsumer = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(printConsumer);
    }

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Sydney", "Dhaka", "London");

        Consumer<List<String>> upperCaseConsumer = list ->
            list.replaceAll(String::toUpperCase);
        upperCaseConsumer.accept(cities);


        Consumer<List<String>> printConsumer = list -> list
                .forEach(System.out::println);
        upperCaseConsumer.andThen(printConsumer).accept(cities);


        Consumer<List<String>> reverseConsumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                String reversed = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reversed);
            }
        };

        // Композиция из трех Consumer
        upperCaseConsumer
                .andThen(reverseConsumer)
                .andThen(printConsumer)
                .accept(cities);
    }
}
