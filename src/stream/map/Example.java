package stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog(), new Dog());

        dogs.stream()
                .map((Animal a) -> a.getClass()) // Преобразуем Dog в Animal, потом используем метод getClass
                .collect(Collectors.toList());

        List<Dog> list = new ArrayList<>(List.of(
                new Dog(),
                new Dog(),
                new Dog()
        ));
        System.out.println(list.stream().map(Dog::new).collect(Collectors.toList()));
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Stream<Dog> dogStream = Stream.of(dog1, dog2, dog3);
    }

}

class Animal {
    public String print(){
        return "Animal";
    }
}

class Dog extends Animal {

    public Dog(Dog dog) {
    }

    public Dog() {
    }
}