package week03.oop.principles.inheritance.ornek03;

public class Truck extends Vehicle {
    double cargoCapacity;

    public Truck(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Truck(String brand, String model, int year, double cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    void start() {
        System.out.println("Truck is Starting");
    }

    @Override
    void stop() {
        System.out.println("Truck is Stopping");
    }

}
