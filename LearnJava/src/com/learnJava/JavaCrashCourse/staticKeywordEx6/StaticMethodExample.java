package com.learnJava.JavaCrashCourse.staticKeywordEx6;

public class StaticMethodExample {

//    Once a method declared as static, without creating a object we can able to access the method.
//    if its a non static method, then a object should create for it to access within main method.
    public static void staticMethod(){
        System.out.println("It is a static method!");
    }

    public void nonStaticMethod(){
        System.out.println("It is a non static method!");
    }

    public static void main(String [] args){
        staticMethod();
        StaticMethodExample method = new StaticMethodExample();
        method.nonStaticMethod();
    }
}
