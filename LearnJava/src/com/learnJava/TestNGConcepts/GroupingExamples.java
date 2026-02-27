package com.learnJava.TestNGConcepts;

import org.testng.annotations.Test;

public class GroupingExamples {

    @Test(groups={"P1TestCases"})
    public void FirstTestCase(){
        System.out.println("This is the First Test Cases!");
    }

    @Test(groups={"P1TestCases"})
    public void SecondTestCase(){
        System.out.println("This is the Second Test Cases!");
    }

    @Test(groups={"P2TestCases"})
    public void ThirdTestCase(){
        System.out.println("This is the Third Test Cases!");
    }

    @Test(groups={"P2TestCases"})
    public void FourthTestCase(){
        System.out.println("This is the Fourth Test Cases!");
    }

}
