package org.example.NullDesignPattern;

public class Main {
    public static Vehicle factoryMethod(String s){
        return switch (s){
            case "Car" -> new Car(40,5);
            default -> new NullVehicle();
        };
    }

    public static void main(String[] args){
        // This Design pattern is used to avoid null checks which we have to apply manually at every place
        System.out.println("Hello world");
        Vehicle vehicle=factoryMethod("Car");
        System.out.println(vehicle.getFuelCapacity()+" "+ vehicle.getSeatingCapacity());
        Vehicle vehicle1=factoryMethod("Bike");
        System.out.println(vehicle1.getFuelCapacity()+" "+vehicle1.getSeatingCapacity());
    }
}
