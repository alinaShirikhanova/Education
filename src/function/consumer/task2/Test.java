package function.consumer.task2;
//Задача 2. Обработка списка объектов
//Напишите класс Product, содержащий два поля:
// name (название продукта) и price (цена).
// Реализуйте метод, который принимает список
// продуктов и выводит информацию о каждом продукте,
// используя Consumer. Пример:
//
//Продукт с именем и ценой выводится в формате:
// "Продукт: <name>, Цена: <price>".

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<Product> printConsumer = product -> System.out.printf("Продукт: %s, Цена: %s%n", product.getName(), product.getPrice());
        printProductsList(List.of(
                new Product("Торт", new BigDecimal("300.99")),
                new Product("Шоколадка", new BigDecimal("100.99"))
        ), printConsumer);
    }

    public static void printProductsList(List<Product> products, Consumer<Product> printConsumer) {
        products.forEach(printConsumer);
    }
}
