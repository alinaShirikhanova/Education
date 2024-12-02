package function.predicate.exerscises.task1;

import java.util.function.Predicate;

//Напишите программу, которая проверяет, является ли число либо положительным,
// либо четным. Для этого используйте метод or() для объединения двух предикатов.
public class Test {
    public static void main(String[] args) {
        System.out.println(check(10));

    }
    public static boolean check(int number){
        Predicate<Integer> isPositive = num -> num > 0;
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isPositiveOrEven = isPositive.or(isEven);
        return isPositiveOrEven.test(number);
//        return isPositive.or(isEven).test(number);




    }
}
