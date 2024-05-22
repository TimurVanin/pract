package list1.prac6;
interface Nameable {
    String getName();
}
class Planet implements Nameable {
    private String name;
    public Planet(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
class Car implements Nameable {
    private String brand;
    public Car(String brand) {
        this.brand = brand;
    }
    @Override
    public String getName() {
        return brand;
    }
}
class Animal implements Nameable {
    private String species;
    public Animal(String species) {
        this.species = species;
    }
    @Override
    public String getName() {
        return species;
    }
}
public class NameableExample {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        Car bmw = new Car("BMW");
        Animal cat = new Animal("Cat");
        System.out.println("Имя планеты: " + earth.getName());
        System.out.println("Имя машины: " + bmw.getName());
        System.out.println("Имя животного: " + cat.getName());
    }
}