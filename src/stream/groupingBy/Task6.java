package stream.groupingBy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Группировка продуктов по категориям
//Условие:
//
//У вас есть список продуктов, содержащий поля: name и category.
//Требуется сгруппировать продукты по категориям.
//Для каждой категории продукты должны быть отсортированы по названию.
public class Task6 {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Milk", "Dairy"),
                new Product("Cheese", "Dairy"),
                new Product("Apple", "Fruits"),
                new Product("Banana", "Fruits"),
                new Product("Bread", "Bakery"),
                new Product("Croissant", "Bakery")
        );
        System.out.println(products.stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory, Collectors.collectingAndThen(
                Collectors.toList(), list-> list.stream().sorted(Comparator.comparing(Product::getName)).toList()
        ))));

    }
}

// public class Main {
//    public static void main(String[] args) {
//        List<Product> products = List.of(
//            new Product("Milk", "Dairy"),
//            new Product("Cheese", "Dairy"),
//            new Product("Apple", "Fruits"),
//            new Product("Banana", "Fruits"),
//            new Product("Bread", "Bakery"),
//            new Product("Croissant", "Bakery")
//        );
//
//        // Группировка продуктов по категории с сортировкой по названию
//        Map<String, List<Product>> productsByCategory = products.stream()
//            .collect(Collectors.groupingBy(
//                Product::getCategory,
//                Collectors.collectingAndThen(
//                    Collectors.toList(),
//                    list -> list.stream()
//                                .sorted(Comparator.comparing(Product::getName))
//                                .collect(Collectors.toList())
//                )
//            ));
//
//        // Вывод результата
//        productsByCategory.forEach((category, productList) -> {
//            System.out.println("Category: " + category);
//            productList.forEach(product -> System.out.println("  " + product.getName()));
//        });
//    }
//}


class Product {
    private final String name;
    private final String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name;
    }
}