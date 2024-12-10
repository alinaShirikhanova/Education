package stream.count;

import java.util.stream.IntStream;

// Подсчитайте, сколько чисел в диапазоне от 1 до 100 являются простыми.
public class Task3 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(2, 101).filter(Task3::isPrime).count());
    }

    private static boolean isPrime(int num) {
       return IntStream.range(2, (int) Math.sqrt(num) + 1).allMatch(div -> num % div != 0);
    }
}
