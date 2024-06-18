package com.learnJava.JavaCrashCourse.superKeywordEx;

public class ChildClass extends ParentClass {

    public ChildClass() {
        super();
        System.out.println("Child class property!");
    }

    public static void main(String [] args){
        ChildClass childClass = new ChildClass();
    }
}
