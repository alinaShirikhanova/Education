package stream.map;

import java.util.List;

public class TaskExamples {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list.stream().map(elem-> elem * elem).toList());


        List<String> lines = List.of("Hello", "Java");
        System.out.println(lines.stream().map(String::toString));

        List<Person> personList = List.of(
                new Person("Alex1"),
                new Person("Alex2"),
                new Person("Alex3")
        );
        System.out.println(personList.stream().map(Person::getName).toList());
    }
}



class Person{
    private String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
