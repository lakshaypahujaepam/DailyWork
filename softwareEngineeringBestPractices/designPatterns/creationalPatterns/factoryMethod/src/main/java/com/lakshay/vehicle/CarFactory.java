package com.lakshay.vehicle;

public class CarFactory extends VehicleFactory{
    @Override
    protected Vehicle getVehicle() {
        System.out.println("New Car is Created.");
        return new Car();
    }
}