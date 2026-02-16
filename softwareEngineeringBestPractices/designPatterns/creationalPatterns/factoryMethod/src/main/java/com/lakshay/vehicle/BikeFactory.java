package com.lakshay.vehicle;

public class BikeFactory extends VehicleFactory {
    @Override
    protected Vehicle getVehicle() {
        System.out.println("New Bike is Created.");
        return new Bike();
    }
}