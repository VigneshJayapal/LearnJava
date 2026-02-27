package com.learnJava.TestNGConcepts;

import org.testng.annotations.Test;

public class DependenciesOnMethodsTestCase {

    /* Goal of Scripting: Dependencies on Methods attributes helps in creating a dependencies that
    *                       execute the current method depends on previous method */
    @Test(priority = 0, enabled = true)
    public void FirstTestCase(){
        System.out.println("This is the First Test Cases!");
    }

    @Test(priority = 1, dependsOnMethods = "FirstTestCase")
    public void SecondTestCase(){
        System.out.println("This is the Second Test Cases!");
    }

    @Test(priority = 2, dependsOnMethods = "SecondTestCase")
    public void ThirdTestCase(){
        System.out.println("This is the Third Test Cases!");
    }

    @Test(priority = 3, dependsOnMethods = "ThirdTestCase")
    public void FourthTestCase(){
        System.out.println("This is the Fourth Test Cases!");
    }
}
