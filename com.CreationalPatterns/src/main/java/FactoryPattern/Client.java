package FactoryPattern;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Vehicle Type");
        String VehicleType=scn.next();
        Vehicle vehicle=VehicleFactory.get_vehicle(VehicleType);
        vehicle.createVehicle();

    }

}
