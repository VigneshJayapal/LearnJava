package com.learnJava.JavaCrashCourse.constructorEx;

public class NoArgumentConstructorExamples {

    int employeeId;
    String employeeName;

//  When we override existing default constructor value with No arg cons, the class value will be initialized here.
//  This is not a default constructor, when we introduced our own logic to initializes our class variables
    NoArgumentConstructorExamples(){
        employeeId = 12345;
        employeeName = "PRANAV";
        System.out.println("No Arg Constructor created!");
    }

    public static void main(String [] args){
        NoArgumentConstructorExamples noArgumentConstructorExamples = new NoArgumentConstructorExamples();
        int id = noArgumentConstructorExamples.employeeId;
        System.out.println("Employee id is :"+id);
        String name = noArgumentConstructorExamples.employeeName;
        System.out.println("Employee name is :"+name);
    }
}
