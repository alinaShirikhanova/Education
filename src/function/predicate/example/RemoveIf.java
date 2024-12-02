package function.predicate.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(List.of(
                new Student("H", 20),
                new Student("Kate", 21),
                new Student("H", 12)));
//        list.removeIf(s -> s.getName().equals("H"));
//        Predicate<Student> pr = s -> s.getName().equals("H") && s.getAge() > 20;
//        list.removeIf(pr);
  Predicate<Student> pr1 = s -> s.getName().equals("H");
  Predicate<Student> pr2 =  s -> s.getAge() > 20;
//  list.removeIf(pr1.and(pr2));
  list.removeIf(pr1.negate());
        System.out.println(list);

    }
}
