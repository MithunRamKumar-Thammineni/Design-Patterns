package FactoryPattern;

public class Car extends Vehicle {
    @Override
    void createVehicle() {
        System.out.println("Creating Car");
    }
}
