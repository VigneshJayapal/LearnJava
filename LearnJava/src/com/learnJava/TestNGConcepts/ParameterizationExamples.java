package com.learnJava.TestNGConcepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExamples {
    @Test
    @Parameters({"Status", "Condition"})
    public void FirstTestCase(String name, String condition){
        System.out.println("This is the First Test Cases! "+name+ "and the condition is "+condition);
    }

    @Test
    @Parameters({"Status", "Condition"})
    public void SecondTestCase(String name, String condition){
        System.out.println("This is the Second Test Cases!"+name+ "and the condition is "+condition);
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
