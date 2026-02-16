package com.lakshay.vehicle;

public abstract class VehicleFactory{

    public Vehicle orderVehicle() {
        return getVehicle();
    }
    protected abstract Vehicle getVehicle();
}