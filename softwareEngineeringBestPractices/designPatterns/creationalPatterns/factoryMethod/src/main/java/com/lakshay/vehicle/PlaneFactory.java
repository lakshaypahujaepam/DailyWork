package com.lakshay.vehicle;

public class PlaneFactory extends VehicleFactory{
    @Override
    protected Vehicle getVehicle() {
        System.out.println("New Plane is Created.");
        return new Plane();
    }
}