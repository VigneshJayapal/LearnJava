package com.learnJava.TestNGConcepts;

import org.testng.annotations.*;

public class AnnotationsInTestNG {
    /*
    * In TestNG, annotations control the flow of test execution
       (setup, teardown, grouping, parameterization, etc.).

✅ Total Core TestNG Annotations (Most Common)

There are 9 primary execution annotations used in real projects.

🔥 Test Configuration Annotations (Execution Flow)
🔹 1) @BeforeSuite

Runs once before the entire suite starts.

✔ DB connection
✔ Global setup

🔹 2) @AfterSuite

Runs once after the entire suite finishes

✔ Close DB
✔ Cleanup

🔹 3) @BeforeTest

Runs before each <test> tag in testng.xml

✔ Environment setup

🔹 4) @AfterTest

Runs after each <test> tag

🔹 5) @BeforeClass

Runs once before the first test method in a class

✔ Launch browser (common use)

🔹 6) @AfterClass

Runs once after all test methods in the class

✔ Close browser

🔹 7) @BeforeMethod

Runs before each test method

✔ Login
✔ Pre-condition setup

🔹 8) @AfterMethod

Runs after each test method

✔ Logout
✔ Screenshot on failure

🧪 Test Annotation
🔹 9) @Test

Marks a method as a test case.

Supports:

✔ Priority
✔ Groups
✔ Dependencies
✔ DataProvider
✔ Timeouts
✔ Expected exceptions

⭐ Execution Order (Top → Bottom)
BeforeSuite
  BeforeTest
    BeforeClass
      BeforeMethod
        @Test
      AfterMethod
    AfterClass
  AfterTest
AfterSuite
🚀 Additional Useful TestNG Annotations

Beyond the core 9, TestNG provides several advanced annotations.

🔹 10) @Parameters

Pass values from testng.xml

🔹 11) @DataProvider

Run test with multiple data sets
* ✅ @DataProvider in TestNG
@DataProvider is used to run the same test method multiple times with different sets of data.
✔ Supports data-driven testing
✔ Eliminates duplicate test methods
✔ Data comes from Java method (not XML)

🔹 12) @Factory

Create multiple instances of a test class

🔹 13) @Listeners

Attach listeners for reporting/logging

🔹 14) @Optional

Provide default value for parameters

🔹 15) @BeforeGroups / @AfterGroups

Run before/after specific test groups

🏆 Interview-Ready Answer

TestNG has 9 primary execution annotations for controlling test flow,
 along with additional annotations like DataProvider, Parameters, Factory, and Listeners for advanced testing
    */

    @BeforeSuite
    public void BeforeSuiteEx(){
        System.out.println("BeforeSuiteExample!");
    }
    @AfterSuite
    public void AfterSuiteEx(){
        System.out.println("AfterSuiteExample!");
    }

    @BeforeTest
    public void BeforeTestEx(){
        System.out.println("BeforeTestExample!");
    }

    @AfterTest
    public void AfterTestEx(){
        System.out.println("AfterTestExample!");
    }

    @BeforeClass
    public void BeforeClassEx(){
        System.out.println("BeforeClassExample!");
    }

    @AfterClass
    public void AfterClassEx(){
        System.out.println("AfterClassExample!");
    }

    @BeforeMethod
    public void BeforeMethodEx(){
        System.out.println("BeforeMethodExample!");
    }

    @AfterMethod
    public void AfterMethodEx(){
        System.out.println("AfterMethodExample!");
    }

    @Test
    public void TestEx(){
        System.out.println("TestExamples!");
    }
}
