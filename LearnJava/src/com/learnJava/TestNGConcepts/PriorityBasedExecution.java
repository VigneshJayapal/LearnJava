package com.learnJava.TestNGConcepts;

import org.testng.annotations.Test;

public class PriorityBasedExecution {

    /*Goal of Scripting: We can control the Order of execution with @Test annotations */
    @Test(priority=0)
    public void FirstTestCase(){
        System.out.println("This is the First Test Cases!");
    }

    @Test(priority=1)
    public void SecondTestCase(){
        System.out.println("This is the Second Test Cases!");
    }

    @Test(priority=2)
    public void ThirdTestCase(){
        System.out.println("This is the Third Test Cases!");
    }

    @Test(priority=3)
    public void FourthTestCase(){
        System.out.println("This is the Fourth Test Cases!");
    }
}
