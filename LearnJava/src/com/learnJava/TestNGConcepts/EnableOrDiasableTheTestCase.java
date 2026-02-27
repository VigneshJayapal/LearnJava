package com.learnJava.TestNGConcepts;

import org.testng.annotations.Test;

public class EnableOrDiasableTheTestCase {

    /* Goal of Scripting : We can either Enable or Disable the Test cases using Enabled attribute */

    @Test(priority = 0, enabled = true)
    public void FirstTestCase(){
        System.out.println("This is the First Test Cases!");
    }

    @Test(priority = 1, enabled = true)
    public void SecondTestCase(){
        System.out.println("This is the Second Test Cases!");
    }

    @Test(priority = 2, enabled = true)
    public void ThirdTestCase(){
        System.out.println("This is the Third Test Cases!");
    }

    @Test(priority = 0, enabled = true)
    public void FourthTestCase(){
        System.out.println("This is the Fourth Test Cases!");
    }
}
