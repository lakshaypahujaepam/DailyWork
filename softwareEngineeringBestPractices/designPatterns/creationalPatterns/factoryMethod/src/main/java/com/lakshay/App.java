package com.lakshay;

import com.lakshay.vehicle.*;

public class App {
    public static void main(String[] args)
    {
        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.orderVehicle();

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.orderVehicle();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.orderVehicle();

        VehicleFactory planeFactory = new PlaneFactory();
        Vehicle plane = planeFactory.orderVehicle();
    }
}