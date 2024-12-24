package stream.groupingBy.task5;
// Группировка студентов по возрасту
//Условие:
//
//У вас есть список студентов, содержащий поля: name, age, и course.
//Требуется сгруппировать студентов по возрасту.
//Для каждой группы определить количество студентов.
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Anton", 20, 1),
                new Student("Alex", 21, 1),
                new Student("Alina", 20, 1),
                new Student("Anton", 21, 1),
                new Student("Anton", 23, 1),
                new Student("Anton", 23, 1)
        );
        Map<Integer, Long> studentsByAge = students.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.counting()));
        studentsByAge.forEach((age, count) -> System.out.println(age + " " + count));
    }
}
