package list1.prac6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
enum ComputerBrand {
    HP, Dell, Lenovo, Asus, Acer
}
class Processor {
    private String model;
    public Processor(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
}
class Memory {
    private int sizeGB;
    public Memory(int sizeGB) {
        this.sizeGB = sizeGB;
    }
    public int getSizeGB() {
        return sizeGB;
    }
}
class Monitor {
    private double screenSize;
    public Monitor(double screenSize) {
        this.screenSize = screenSize;
    }
    public double getScreenSize() {
        return screenSize;
    }
}
class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }
    public ComputerBrand getBrand() {
        return brand;
    }
    @Override
    public String toString() {
        return "Марка: " + brand + ", Процессор: " + processor.getModel() +
                ", Память: " + memory.getSizeGB() + " ГБ, Монитор: " + monitor.getScreenSize() + " дюймов";
    }
}
class Shop {
    private List<Computer> computers = new ArrayList<>();
    public void addComputer(Computer computer) {
        computers.add(computer);
    }
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }
    public List<Computer> findComputersByBrand(ComputerBrand brand) {
        List<Computer> foundComputers = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }
}
public class ComputerShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.print("Введите количество компьютеров для добавления в магазин: ");
        int numberOfComputers = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        for (int i = 0; i < numberOfComputers; i++) {
            System.out.println("Введите данные для компьютера " + (i + 1) + ":");
            System.out.print("Марка (HP, Dell, Lenovo, Asus, Acer): ");
            ComputerBrand brand = ComputerBrand.valueOf(scanner.nextLine());
            System.out.print("Модель процессора: ");
            String processorModel = scanner.nextLine();
            System.out.print("Объем памяти (в ГБ): ");
            int memorySizeGB = scanner.nextInt();
            System.out.print("Размер монитора (в дюймах): ");
            double monitorSize = scanner.nextDouble();
            Processor processor = new Processor(processorModel);
            Memory memory = new Memory(memorySizeGB);
            Monitor monitor = new Monitor(monitorSize);
            Computer computer = new Computer(brand, processor, memory, monitor);
            shop.addComputer(computer);
        }
        System.out.println("Компьютеры в магазине:");
        for (Computer computer : shop.findComputersByBrand(ComputerBrand.HP)) {
            System.out.println(computer);
        }
        scanner.close();
    }
}
