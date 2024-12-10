package stream.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Используйте partitioningBy,
// чтобы разделить сотрудников на старше и младше 30 лет.
public class Task1 {
    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("Name1", "IT", 20),
                new Employee("Name2", "IT", 31),
                new Employee("Name3", "IT", 35),
                new Employee("Name4", "IT", 40),
                new Employee("Name5", "IT", 21)
        );
        Map<Boolean, List<Employee>> map = list.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getAge() > 30));
        System.out.println(map);
    }
}

class Employee {
    private String name;
    private String department;
    private int age;


    public Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

