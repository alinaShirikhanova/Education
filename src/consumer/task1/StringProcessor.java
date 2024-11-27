package consumer.task1;

import java.util.function.Consumer;

//Задача 1. Обработка строк
//Создайте класс StringProcessor, который использует функциональный интерфейс Consumer для выполнения нескольких операций над строками. Напишите метод, который:
//
//Принимает строку и выводит ее в верхнем регистре.
//Принимает строку и выводит ее длину.
//Пример использования:
//
//public static void processString(String input, Consumer<String> action) {
//    action.accept(input);
//}
public class StringProcessor{
    public static void processString(String input, Consumer<String> action){
        action.accept(input);
    }
}