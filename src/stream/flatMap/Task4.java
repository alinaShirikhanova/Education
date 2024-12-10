package stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// У вас есть список продуктов, каждый
// из которых имеет имя и список магазинов,
// в которых они продаются. Задача — вывести
// все продукты с магазинами, но без дублирования
// магазинов для одного продукта.
public class Task4 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", Arrays.asList("Store1", "Store2", "Store3")),
                new Product("Phone", Arrays.asList("Store2", "Store4")),
                new Product("Tablet", Arrays.asList("Store1", "Store5", "Store3"))
        );

        products.stream()
                .map(product -> product + " " + product.stores.stream().distinct().collect(Collectors.joining(", ")))
                .forEach(System.out::println);

        // Преобразование данных с использованием Stream API
        products.stream()
                .map(product -> product.name + ": " +
                        product.stores.stream()  // Преобразуем список магазинов в стрим
                                .distinct()             // Убираем дубликаты
                                .collect(Collectors.joining(", "))) // Собираем магазины в строку через запятую
                .forEach(System.out::println);  // Выводим результат
    }
}


class Product {
    String name;
    List<String> stores;

    public Product(String name, List<String> stores) {
        this.name = name;
        this.stores = stores;
    }

    @Override
    public String toString() {
        return name;
    }
}