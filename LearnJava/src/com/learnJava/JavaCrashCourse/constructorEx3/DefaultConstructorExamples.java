package com.learnJava.JavaCrashCourse.constructorEx3;

public class DefaultConstructorExamples {

    //Default Constructor declaration
    //when the user doesn't provide any value to the variable, the constructor
        // that automatically provide its default value
    public String defaultConstructorStrValue;
    public int defaultConstructorIntValue;
    public Integer defaultConstructorIntegerVal;

    public static void main(String[]args){
        DefaultConstructorExamples constructorExamples = new DefaultConstructorExamples();

        //Verify Default Constructor values
        System.out.println(constructorExamples.defaultConstructorStrValue);
        System.out.println(constructorExamples.defaultConstructorIntValue);
        System.out.println(constructorExamples.defaultConstructorIntegerVal);
    }
}
