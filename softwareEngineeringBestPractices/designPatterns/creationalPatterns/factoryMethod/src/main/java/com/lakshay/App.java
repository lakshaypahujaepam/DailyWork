package com.lakshay;

import com.lakshay.documentExporter.DocumentExporter;
import com.lakshay.documentExporter.ExporterFactory;
import com.lakshay.vehicle.*;

public class App {
    public static void main(String[] args)
    {
//        Vehicle
        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.orderVehicle();

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.orderVehicle();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.orderVehicle();

        VehicleFactory planeFactory = new PlaneFactory();
        Vehicle plane = planeFactory.orderVehicle();

//        Document Exporter
        DocumentExporter pdfExporter = new ExporterFactory().getExporter("PdF");
        pdfExporter.export();

        DocumentExporter htmlExporter = new ExporterFactory().getExporter("HTMl");
        htmlExporter.export();

        DocumentExporter wordExporter = new ExporterFactory().getExporter("WORD");
        wordExporter.export();
    }
}