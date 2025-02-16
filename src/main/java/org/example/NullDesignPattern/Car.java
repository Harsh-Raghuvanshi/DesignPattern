package org.example.NullDesignPattern;


public class Car implements Vehicle {
    int fuelCapacity;
    int seatingCapacity;

    Car(int fuelCapacity,int seatingCapacity){
        this.fuelCapacity=fuelCapacity;
        this.seatingCapacity=seatingCapacity;
    }

    @Override
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
}
