package com.learnJava.TestNGConcepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/* Goal of Scripting: Introduce the annotation - Test => @Test
*        1. Before TestNG we use Main method for the execution, but once we integrated
*               with TestNG and configured their Plugin - we can use @Test annotation to
*               execute the TestCases*/

public class SampleTestNGTestCases {
    @Test
    public void FirstTestCase(){
        System.out.println("This is the First Test Cases!");
    }

    @Test
    public void SecondTestCase(){
        System.out.println("This is the Second Test Cases!");
    }

    @Test
    public void ThirdTestCase(){
        System.out.println("This is the Third Test Cases!");
    }

    @Test
    public void FourthTestCase(){
        System.out.println("This is the Fourth Test Cases!");
    }
}
