package FactoryPattern;

public class VehicleFactory {
    static Vehicle get_vehicle(String VehicleType){
        Vehicle vehicle;
        if(VehicleType.equals("car"))
            vehicle=new Car();
        else if(VehicleType.equals("bike"))
            vehicle=new Bike();
        else
            vehicle=null;
       return vehicle;
    }
}
