package com.learnJava.JavaCrashCourse.abstractionEx;


//   Here we are going to extend the abstract parent class and implement its declarations
public class AbstractionExChildWithUnimplementedMethods extends AbstractionExParent{

//   Below is  the unimplemented method extracted from its parent class, either we need to declare the implementation here or we can change the Child class to Abstract class
//    It is a Overriding concept from Inheritance
    @Override
    public void getSalaryDetails() {
        System.out.println("declaring the unimplemented methods here!");
    }

//    here we are using dynamic polymorphism concept to create a object for Parent Child relationship class
//    Parent class with Object reference = new keyword then Child class declaration - Dynamic polymorphism
    AbstractionExParent example = new AbstractionExChildWithUnimplementedMethods();
//    Below script will not able to make use of any property or methods from parent class, bcoz it is a Abstract class
//        example.getEmployeeData();


}
