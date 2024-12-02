package function.predicate.example;

import java.util.function.Predicate;

public class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class TestUser {
    public static void main(String[] args) {
        Predicate<User> isAdult = user -> user.age >= 18;

        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 15);

        System.out.println(isAdult.test(user1)); // true
        System.out.println(isAdult.test(user2)); // false
    }
}

