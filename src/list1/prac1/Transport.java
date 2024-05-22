package list1.prac1;
abstract class Transport {
    private String name;
    public Transport(String name) {
        this.name = name;
    }
    public abstract double calculatePassengerTransportCost(int passengers);
    public abstract double calculateCargoTransportCost(double cargoWeight);
    public abstract double calculateTravelTime(double distance);
    public String getName() {
        return name;
    }
}
class Car extends Transport {
    private double fuelConsumption;
    public Car(String name, double fuelConsumption) {
        super(name);
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public double calculatePassengerTransportCost(int passengers) {
        return passengers * 10;
    }
    @Override
    public double calculateCargoTransportCost(double cargoWeight) {
        return cargoWeight * 5;
    }
    @Override
    public double calculateTravelTime(double distance) {
        double speed = 100;
        return distance / speed;
    }
}
class Airplane extends Transport {
    private double fuelConsumption;
    public Airplane(String name, double fuelConsumption) {
        super(name);
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public double calculatePassengerTransportCost(int passengers) {
        return passengers * 8;
    }
    @Override
    public double calculateCargoTransportCost(double cargoWeight) {
        return cargoWeight * 20;
    }
    @Override
    public double calculateTravelTime(double distance) {
        double speed = 700;
        return distance / speed;
    }
}
class Train extends Transport {
    private double fuelConsumption;
    public Train(String name, double fuelConsumption) {
        super(name);
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public double calculatePassengerTransportCost(int passengers) {
        return passengers * 20;
    }
    @Override
    public double calculateCargoTransportCost(double cargoWeight) {
        return cargoWeight * 12;
    }
    @Override
    public double calculateTravelTime(double distance) {
        double speed = 60;
        return distance / speed;
    }
}
class Ship extends Transport {
    private double fuelConsumption;
    public Ship(String name, double fuelConsumption) {
        super(name);
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public double calculatePassengerTransportCost(int passengers) {
        return passengers * 2;
    }
    @Override
    public double calculateCargoTransportCost(double cargoWeight) {
        return cargoWeight * 2;
    }
    @Override
    public double calculateTravelTime(double distance) {
        double speed = 20;
        return distance / speed;
    }
}