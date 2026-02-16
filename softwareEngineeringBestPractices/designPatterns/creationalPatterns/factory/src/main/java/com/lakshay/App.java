package com.lakshay;

import com.lakshay.vehicle.Vehicle;
import com.lakshay.vehicle.VehicleFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.drive();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.drive();

        Vehicle vehicle = VehicleFactory.getVehicle("evhci");
        bike.drive();

    }
}
