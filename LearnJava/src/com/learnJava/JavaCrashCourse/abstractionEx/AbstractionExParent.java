package com.learnJava.JavaCrashCourse.abstractionEx;

public abstract class AbstractionExParent {

//    Definition: Hiding the implementation details
//    Rules for Abstraction:
//      1. If a class is having unimplemented method then the method should be declared as Abstract
//      2. If a class is having one Abstract method then the class should be declared as Abstract
//      3. Abstract may have or may not have implemented methods in the class
//      4. Can we create object for Abstract class? - Nooooooooooooo!!!!!!!!!!!!!!!!,
//              If a user have one requirement to hiding the implementation details along with don't use property of this class - he or she uses Abstraction
//      5. If a Child class extends its Parent class, then it should implement its all abstract method or the child class itself should declared as Abstract class.

//    This is the Parent class:

//    Below is the implemented method with its body having some declaration
    public void getEmployeeData(){
        System.out.println("It is a implemented method!");
    }

//    Whereas below is the unimplemented method without having any body and its declaration
    public abstract void getSalaryDetails();

}
