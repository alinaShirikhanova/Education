package function.supplier.example;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello, Supplier!";
        System.out.println(supplier.get());


        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);
        System.out.println("Random Number: " + randomNumberSupplier.get());


        Supplier<Double> expensiveComputation = () -> {
            System.out.println("Performing expensive computation...");
            return Math.random() * 1000;
        };

        System.out.println("Computation not yet triggered.");
        System.out.println("Result: " + expensiveComputation.get());
    }

    public static void supplierWithOptional() {
        Supplier<Double> doubleSupplier = () -> Math.random();
        Optional<Double> optionalDouble = Optional.empty();
        System.out.println(optionalDouble.orElseGet(doubleSupplier));
    }
}

