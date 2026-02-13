package com.learnJava.JavaCrashCourse.inheritanceEx7;

//  Interface cannot be achieved thru extends, which supported by implements keyword
//public class BMWCarManufacture extends CarSpecification{
//}

public class BMWCarManufacture implements CarSpecification{

//    Below were the unimplemented methods from Inheritance class which gives the mandatory specification needs to be implemented for its child class
//    Removing anyone method will not be permitted
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

    public static void main (String [] args){
        BMWCarManufacture cars = new BMWCarManufacture();
        cars.carEngineDetails();
        cars.carMarketValue();
    }
}
