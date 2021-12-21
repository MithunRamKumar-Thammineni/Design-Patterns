package FactoryPattern;

public class Bike extends Vehicle{
    @Override
    void createVehicle() {
        System.out.println("Creating Bike");
    }
}
