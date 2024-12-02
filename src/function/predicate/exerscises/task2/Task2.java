package function.predicate.exerscises.task2;
//Напишите программу, которая проверяет, что строка не пустая и ее длина больше 3.
// Используйте метод and() для объединения двух предикатов.
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        Predicate<String> isGreater3 = s -> s.length() > 3;
        System.out.println(isNotEmpty.and(isGreater3).test("Hello"));
    }
}
