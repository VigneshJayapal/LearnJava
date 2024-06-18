package com.learnJava.JavaCrashCourse.staticKeywordEx;

public class StaticBlockEx {

    static {
        System.out.println("method 1");
    }

    static {
        System.out.println("method 2");
    }

    public static void main(String [] args){
        System.out.println("Main Method!");
    }

    /*output:
//    Here static block holds the additional privilege than main method, so the memory allocation will store static
        before main method block
//    Also it maintain insertion order on how we declare as below

    method 1
    method 2
    Main Method!*/
}
