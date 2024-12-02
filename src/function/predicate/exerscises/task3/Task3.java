package function.predicate.exerscises.task3;

import java.util.function.Predicate;

// Напишите программу, которая проверяет, что число не является отрицательным.
// Используйте метод negate() для инвертирования предиката.
public class Task3 {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num < 0;
        System.out.println(isPositive.negate().test(-34));


//        Predicate<Integer> isEven = x -> x % 2 == 0;
//        System.out.println(isEven.test(4)); // true
//        System.out.println(isEven.test(5)); // false
    }
}
