package com.learnJava.JavaCrashCourse.exceptionHandlingInJava;

public class SingleTryCatchExample {

    public static int a = 0;
    public static int b = 10;

    public static void main(String []args){

//      Single try catch block examples
        try{
            int result = b/a;
            System.out.println(result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

/*
output:
        java.lang.ArithmeticException: / by zero
        at com.learnJava.JavaCrashCourse.exceptionHandlingInJava.SingleTryCatchExample.main
            (SingleTryCatchExample.java:12)
*/

