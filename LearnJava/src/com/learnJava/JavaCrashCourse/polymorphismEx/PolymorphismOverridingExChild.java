package com.learnJava.JavaCrashCourse.polymorphismEx;

public class PolymorphismOverridingExChild extends PolymorphismOverridingExParent {

//    Dynamic/Run time/Late binding - Overriding polymorphism
//    Aspects of Overriding (which always applies on method level):
//    1. Method name should be same and it should be in parent/child class
//    2. Method should be same with passed in parameters
//    3. Return type should be same or any covariant return type
//    4. Access modifier should be same or higher visibility modifiers
//    5. Throwing exception should be same or higher handling exception
//    6. Private method can't be Overridden
    @Override
    public void familyProperty(Integer age, String condtion){
        System.out.println("I done marriage with my life and my rules!");
    }

    public static void main(String [] args){
//   Dynamic Polymorphism syntax: Parent class and Object reference with new keyword and then Child class declaration
        PolymorphismOverridingExParent example = new PolymorphismOverridingExChild();
        example.familyProperty();
        example.familyProperty("I need family property!");
        example.familyProperty(27, "I need family property with my condition!");
    }

}
