package stream.reduce;
// Задача 2. Проверка палиндрома
//Напишите метод, который принимает строку
// и проверяет, является ли она палиндромом, используя reduce.
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        String cleaned = input.replaceAll("\\s", "").toLowerCase(); // Убираем пробелы и приводим к нижнему регистру

        boolean isPalindrome = Stream.of(cleaned)
                .reduce((str1, str2) -> new StringBuilder(str1).reverse().toString())
                .map(reversed -> reversed.equals(cleaned)) // Сравниваем с оригиналом
                .orElse(false);

        System.out.println("Is palindrome: " + isPalindrome); // true
    }
}