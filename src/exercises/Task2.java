package exercises;

public class Task2 {
    public static void main(String[] args) {
//        String text = "123321";
//        StringBuilder sb = new StringBuilder();
//        text.chars().filter(Character::isLetterOrDigit).map(Character::toLowerCase)
//                .peek(sb::append);
//
//        System.out.println(sb);
//        StringBuilder sbReversed = new StringBuilder(sb.reverse());
//        System.out.println(sb.equals(sbReversed.toString()));


//        Исправленный вариант
        String text = "123321";
        StringBuilder sb = new StringBuilder();

        // Запуск цепочки с терминальной операцией
        text.chars()
                .filter(Character::isLetterOrDigit) // Оставляем только буквы и цифры
                .map(Character::toLowerCase)       // Приводим к нижнему регистру
                .forEach(c -> sb.append((char) c)); // Собираем символы в StringBuilder

        System.out.println(sb);

        // Проверяем, является ли текст палиндромом
        StringBuilder sbReversed = new StringBuilder(sb).reverse();
        System.out.println(sb.toString().equals(sbReversed.toString()));
    }
}
