package stream.concat;

import java.util.stream.Stream;

// Задача 5: Объединить потоки объектов
//Есть два потока объектов Person. Объедините их, исключив дубликаты по имени.
public class Task5 {
    public static void main(String[] args) {
        Stream<Person> stream1 = Stream.of(new Person("Alice"), new Person("Bob"));
        Stream<Person> stream2 = Stream.of(new Person("Bob"), new Person("Charlie"));

       Stream.concat(stream1, stream2).distinct().forEach(System.out::println);
    }

}


class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
