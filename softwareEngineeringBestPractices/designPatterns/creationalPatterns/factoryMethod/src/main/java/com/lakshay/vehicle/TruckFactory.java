package com.lakshay.vehicle;

public class TruckFactory extends VehicleFactory{
    @Override
    protected Vehicle getVehicle() {
        System.out.println("New Truck is Created.");
        return new Truck();
    }
}