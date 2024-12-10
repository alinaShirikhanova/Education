package stream.flatMap;

import java.util.Arrays;
import java.util.List;

// Преобразование коллекций объектов и их "расплющивание"
//У вас есть список объектов Person, каждый из которых имеет
// имя и список PhoneNumber (номера телефонов). Нужно собрать
// все номера телефонов для всех людей и вернуть их в одном списке,
// где каждый номер телефона будет ассоциирован с именем человека.
//
//Структуры данных:
//class Person {
//    String name;
//    List<PhoneNumber> phoneNumbers;
//
//    public Person(String name, List<PhoneNumber> phoneNumbers) {
//        this.name = name;
//        this.phoneNumbers = phoneNumbers;
//    }
//}
//
//class PhoneNumber {
//    String number;
//
//    public PhoneNumber(String number) {
//        this.number = number;
//    }
//
//    @Override
//    public String toString() {
//        return number;
//    }
//}
//Пример данных:
//List<Person> people = Arrays.asList(
//    new Person("John", Arrays.asList(new PhoneNumber("1234"), new PhoneNumber("5678"))),
//    new Person("Jane", Arrays.asList(new PhoneNumber("9876"), new PhoneNumber("5432"))),
//    new Person("Tom", Arrays.asList(new PhoneNumber("1111")))
//);
//Задача:
//Создать поток, который вернёт все номера телефонов для каждого человека в формате: Имя: номер_телефона.
public class Task3 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", Arrays.asList(new PhoneNumber("1234"), new PhoneNumber("5678"))),
                new Person("Jane", Arrays.asList(new PhoneNumber("9876"), new PhoneNumber("5432"))),
                new Person("Tom", Arrays.asList(new PhoneNumber("1111")))
        );
        System.out.println(people.stream()
                .flatMap(person -> person.getPhoneNumbers().stream()
                        .map(phone -> person.getName() + " " + phone)).toList());

    }

}


class Person {
    private String name;
    private List<PhoneNumber> phoneNumbers;

    public Person(String name, List<PhoneNumber> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}

class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }
}