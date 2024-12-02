package function.supplier.exercises;

import java.util.function.Supplier;

//Задача 2: Ленивое вычисление
//Условие: Реализуйте ленивое вычисление значения PI
// с точностью до 10 знаков после запятой с помощью Supplier.
public class Task2 {
    public static void main(String[] args) {
        Supplier<String> getPi = () -> String.format("%.10f", Math.PI);
        System.out.println(getPi.get());
    }
}
