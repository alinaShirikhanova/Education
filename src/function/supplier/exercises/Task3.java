package function.supplier.exercises;

import java.util.function.Supplier;

//Задача 3: Фабрика объектов
//Условие: Создайте фабрику, которая с помощью
// Supplier создаёт экземпляры класса
public class Task3 {
    public static void main(String[] args) {
        Supplier<Car> getCar = () -> new Car("BMW");
        System.out.println(getCar.get());
    }
}

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
