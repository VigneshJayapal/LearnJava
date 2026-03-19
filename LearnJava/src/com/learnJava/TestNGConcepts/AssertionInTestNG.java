package com.learnJava.TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashSet;
import java.util.Set;

public class AssertionInTestNG {

    @Test
    public void validateAssertion(){
        String actualValue = "PRANAV";
        String expectedValue = "PRANAV";

        Set<String> value1 = new HashSet<>();
        value1.add("String 1");
        value1.add("String 2");

        Set<String> value2 = new HashSet<>();
        value2.add("String 3");
        value2.add("String 4");

        Boolean value3 = true;

        String value4 = null;

        Integer [] value5 = {1,2,3,4,5};
        Integer [] value6 = {6,5,4,3,2,1};

//      assertEquals() — Checks equality
//        Assert.assertEquals(actualValue, expectedValue, "Value not matching as expected!");

//      assertNotEquals() — Checks inequality
//        Assert.assertNotEquals(actualValue, expectedValue, "Value should not match!");

//      assertTrue() — Condition must be true
//        Assert.assertTrue(value3, "Expecting True Value!");

//      assertFalse() — Condition must be false
//        Assert.assertFalse(value3, "Expecting False Value!");

//      assertNull() — Object should be null
//        Assert.assertNull(value4, "Object should be null!");

//      assertNotNull() — Object should NOT be null
//        Assert.assertNotNull(value4, "Object should NOT be null!");

//      assertSame() — Same object reference
//        Assert.assertSame(value1, value2, "Expecting Same object reference!");

//      assertNotSame() — Different references
//        Assert.assertNotSame(value1, value2, "Different references!");

//      fail() — Force test failure
//        Assert.fail("Force test failure!");

//      assertNotEqualsDeep - If you want deep comparison (e.g., arrays, objects, nested structures), you must handle it manually.
//        Assert.assertNotEqualsDeep(value1, value2, "Value is matching!");

//      AssertEqualsDeep - If you want deep comparison (e.g., arrays, objects, nested structures), you must handle it manually.
//        Assert.assertEqualsDeep(value1, value2,"Value is not matching!");

//      assertEqualsNoOrder() verifies that two arrays contain the same elements regardless of order.
//        Assert.assertEqualsNoOrder(value5, value6, "verifies that two arrays contain the same elements regardless of order!");

/*      Soft Assertion */
        SoftAssert softAssert = new SoftAssert();
/*      TestNG provides two types of assertions: Hard Assertions that stop execution on failure,
        and Soft Assertions that continue execution and report all failures at the end using
        assertAll().*/

//      assertNull() — Object should be null
//        softAssert.assertNull(value4, "Object should be null!");

//      assertNotNull() — Object should NOT be null
//        softAssert.assertNotNull(value4, "Object should not be null!");

//      assertEquals() — Checks equality - Verifies that actual and expected values are equal.
//        softAssert.assertEquals(expectedValue, actualValue, "Value not matching as expected!");

//      assertNotEquals() — Checks inequality - Verifies that actual and expected values are not equal.
//        softAssert.assertNotEquals(expectedValue, actualValue, "Checks inequality");

//      assertSame - Same object reference
//        softAssert.assertSame(value1, value2, "Same object reference|");

//      assertNotSame - Verifies that two references do NOT point to the same object.
        softAssert.assertNotSame(value1, value2, "Verifies that two references do NOT point to the same object!");

//      assertTrue() - Verifies that a condition is TRUE.
//        softAssert.assertTrue(value3, "Verifies that a condition is TRUE!");

//      assertFalse() - Verifies that a condition is FALSE.
//        softAssert.assertFalse(value3, "Verifies that a condition is FALSE!");

//      fail() - Forces the test to fail deliberately while continuing execution.
        softAssert.fail("Forces the test to fail deliberately while continuing execution!");

//      Soft Assertions in TestNG are non-blocking validations provided by the SoftAssert
//          class that allow a test to continue execution after failures and report all failures
//              at once using assertAll().
        softAssert.assertAll();
    }

//      assertThrows() is used to verify that a specific exception is thrown during test execution.
    @Test(expectedExceptions = ArithmeticException.class)
    public void testException() {
        int x = 10 / 0;
    }

//    TODO: Need to cover other additional annotation here!
/*
* 🔹 1️⃣ @Parameters

Used to pass parameters from testng.xml to test methods.

📌 testng.xml
👉 Used for cross-browser testing.

🔹 2️⃣ @Factory
Used for dynamic test case creation.
👉 Creates multiple test class instances dynamically.

🔹 3️⃣ @Listeners
Used to attach listener classes (for reporting, logging, screenshots).
Commonly used with:
    ITestListener
    ISuiteListener
👉 Helps capture screenshots on failure.

🔹 4️⃣ @Ignore (Less common in TestNG)
TestNG typically uses:
Instead of @Ignore (more common in JUnit).

🔹 5️⃣ @ExpectedExceptions
Used inside @Test to validate exceptions.

🔹 6️⃣ @Test(description = "...")
Adds description to test case (visible in reports).

🔹 7️⃣ @Test(alwaysRun = true)
Forces execution even if dependency fails.

🔹 8️⃣ @Test(threadPoolSize = , invocationCount = )
Used for parallel execution of same test.
👉 Used in performance/load simulation.

🔹 9️⃣ @Guice
Used for dependency injection (advanced usage).
Used when integrating TestNG with Google Guice.

🔹 🔟 @Optional
Used with @Parameters to provide default value.
If parameter not passed → default used.

📊 Summary Table
Annotation	            Purpose
@Parameters	            Pass values from XML
@Factory	            Dynamic test creation
@Listeners	            Attach listeners
@ExpectedExceptions	    Validate exception
@Optional	            Default parameter value
alwaysRun	            Force execution
threadPoolSize	        Parallel execution

🎯 Interview Tip

If asked “Are there any advanced TestNG annotations?”
Say:
Yes, apart from lifecycle annotations, TestNG supports @Parameters, @Factory, @Listeners,
     expectedExceptions, invocationCount, threadPoolSize, and dependency-related attributes
       for advanced test control and parallel execution.

 */
}
