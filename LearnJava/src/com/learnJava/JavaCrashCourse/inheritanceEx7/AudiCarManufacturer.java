package com.learnJava.JavaCrashCourse.inheritanceEx7;

//In this class will show Multiple inheritance
//below class can implements both interface and its unimplemented details
public class AudiCarManufacturer implements CarSpecification,CarImplementationDetails {
    @Override
    public void carwheeldetails() {
        Integer carWheels1 = carWheels;
        System.out.println("Car should hold "+carWheels1+" Wheels!" );
    }

    @Override
    public void carSteeringDetails() {
        Integer carSteering1 = carSteering;
        System.out.println("Car should hold "+carSteering1+" Steering!" );
    }

    @Override
    public void carTopSpeedDetails() {
        String carTopSpeed1 = carTopSpeed;
        System.out.println(carTopSpeed1+" Speed!" );
    }

    @Override
    public void carEngineDetails() {
        Integer carEngine1 = carEngine;
        System.out.println("Car should hold "+carEngine1+" Engine!" );
    }

    @Override
    public void carMarketValue() {
        Integer carMarketValue1 = carValue;
        System.out.println("Car market value should be greater than "+carMarketValue1+" value!");
    }

    public static void main(String [] args){
        AudiCarManufacturer cars = new AudiCarManufacturer();
        cars.carEngineDetails();
        cars.carMarketValue();
        cars.carSteeringDetails();
        cars.carwheeldetails();
        cars.carTopSpeedDetails();
    }
}
