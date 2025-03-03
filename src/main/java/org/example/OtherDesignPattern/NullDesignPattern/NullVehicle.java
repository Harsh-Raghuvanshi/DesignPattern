package org.example.OtherDesignPattern.NullDesignPattern;

public class NullVehicle implements Vehicle{
    int fuelCapacity;
    int seatingCapacity;

    NullVehicle(){
        fuelCapacity=0;
        seatingCapacity=0;
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
