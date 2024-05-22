package list1.prac4;
enum ComputerBrand {
    ACER,
    HP,
    DELL,
    ASUS,
    LENOVO
}
class Processor {
    private String brand;
    private String model;
    private double clockSpeed;
    public Processor(String brand, String model, double clockSpeed) {
        this.brand = brand;
        this.model = model;
        this.clockSpeed = clockSpeed;
    }
    @Override
    public String toString() {
        return brand + " " + model + " (" + clockSpeed + " GHz)";
    }
}
class Memory {
    private int capacity;
    private String memoryType;
    public Memory(int capacity, String memoryType) {
        this.capacity = capacity;
        this.memoryType = memoryType;
    }
    @Override
    public String toString() {
        return capacity + " GB " + memoryType + " RAM";
    }
}
class Monitor {
    private String brand;
    private double size;
    public Monitor(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }
    @Override
    public String toString() {
        return brand + " " + size + " inch monitor";
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
    @Override
    public String toString() {
        return "Computer: " + brand + "\nProcessor: " + processor + "\nMemory: " + memory + "\nMonitor: " + monitor;
    }
}



