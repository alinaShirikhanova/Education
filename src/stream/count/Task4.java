package stream.count;

public class Task4 {
    public static void main(String[] args) {
//        Напишите программу, которая подсчитывает количество уникальных символов в строке
        String text = "apple banana apple orange banana orange apple";
        System.out.println(text.chars().boxed().distinct().count());
    }
}
