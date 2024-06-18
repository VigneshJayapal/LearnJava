package com.learnJava.JavaCrashCourse.exceptionHandlingInJava;

public class UncheckedExceptionExample {
//    Exception which will happen during the execution of the program were Unchecked or Run time exceptions
    public static String name;

    public static void main(String []args){
        System.out.println(name.length());
    }
}
/*
output:
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because
            "com.learnJava.JavaCrashCourse.exceptionHandlingInJava.UncheckedExceptionExample.name" is null
        at com.learnJava.JavaCrashCourse.exceptionHandlingInJava.UncheckedExceptionExample.main
            (UncheckedExceptionExample.java:8)
*/

