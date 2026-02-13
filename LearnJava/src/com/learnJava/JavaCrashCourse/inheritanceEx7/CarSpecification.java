package com.learnJava.JavaCrashCourse.inheritanceEx7;

public interface CarSpecification {

//    Inheritance is a class, but not a class. Why?
//    Because Inheritance is just like a class which holds properties and methods, but those where should be public static and final in nature.
//    It is 100% abstraction with unimplemented methods inside the class
//    This inheritance will gives only the specification details but no the implementation
//    Then what is the use of inheritance?
//          To achieve absolute abstraction and multiple inheritance
//    How a class can use an Interface?
//          By using 'Implements' Keyword
//    Tag or Marker Interface definition - An empty interface is a marker interface, example - Serializable, Clonable.

// Inheritance is just like a class which holds properties and methods, but those where should be public static and final in nature.
    public static final Integer carEngine = 1;
//    Declaring without public static final for the property will consider as it exist in nature
    Integer carValue = 1000000;

//    Below two methods with or without abstract keyword with unimplemented method can be supported in Interface
    public void carEngineDetails();
    public abstract void  carMarketValue();

//    Below method should not be allowed by interface, so commenting those for study purpose
//    public void dummmyMethod(){
//        System.out.println("dummmyMethod");
//    }

}
