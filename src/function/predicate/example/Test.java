package function.predicate.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> isEven = x -> x % 2 == 0;

        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // [2, 4, 6, 8]


        Predicate<Integer> isEqualToHello = Predicate.isEqual(9);

        System.out.println(isEqualToHello.test(9)); // true
        System.out.println(isEqualToHello.test(2)); // false


//        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isOdd = isEven.negate();

        System.out.println(isOdd.test(4)); // false
        System.out.println(isOdd.test(5)); // true


//        Predicate<Integer> isEven = x -> x % 2 == 0;
//        Predicate<Integer> isNegative = x -> x < 0;
//        Predicate<Integer> combined = isEven.or(isNegative);
//
//        System.out.println(combined.test(-2)); // true (отрицательное)
//        System.out.println(combined.test(4));  // true (четное)
//        System.out.println(combined.test(5));  // false (нечетное и неотрицательное)

//
//        Predicate<Integer> isEven = x -> x % 2 == 0;
//        Predicate<Integer> isGreaterThanTen = x -> x > 10;
//        Predicate<Integer> combined = isEven.and(isGreaterThanTen);
//
//        System.out.println(combined.test(12)); // true (четное и > 10)
//        System.out.println(combined.test(8));  // false (четное, но <= 10)

        Predicate<Student> pr = st -> st.getAge() > 20;
        System.out.println(filter(List.of(
                new Student("H", 20),
                new Student("H", 21),
                new Student("H", 12)
                ), pr));


        Predicate<Integer> isPositive = x -> x > 0;
        Predicate<Integer> isMultipleOfThree = x -> x % 3 == 0;

        Predicate<Integer> complexCondition = isPositive.and(isMultipleOfThree);

        System.out.println(complexCondition.test(6));  // true
        System.out.println(complexCondition.test(-3)); // false
        System.out.println(complexCondition.test(2));  // false

    }
    public static List<Student> filter(List<Student> students, Predicate<Student> pr) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student st : students){
            if (pr.test(st)){
                filteredStudents.add(st);
            }
        }
        return filteredStudents;
    }
}
