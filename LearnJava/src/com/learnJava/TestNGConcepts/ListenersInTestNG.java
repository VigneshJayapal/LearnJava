package com.learnJava.TestNGConcepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersInTestNG implements ITestListener {

    /*
    * In TestNG, listeners are interfaces that allow you to modify or monitor test execution behavior.
       They “listen” to events like test start, test success, failure, suite start, etc.,
         and let you execute custom code when those events occur.

        They are commonly used for:
            1.Logging
            2.Generating custom reports
            3.Taking screenshots on failure (Selenium)
            4.Modifying test execution
            5.Retrying failed tests

     * 🔹 Common TestNG Listeners
        1️⃣ ITestListener = Listens to test method events.

         Important methods:
               1. onTestStart(ITestResult result)
               2. onTestSuccess(ITestResult result)
               3. onTestFailure(ITestResult result)
               4. onTestSkipped(ITestResult result)
               5. onStart(ITestContext context)
               6. onFinish(ITestContext context)

        2️⃣ ISuiteListener = Listens to suite-level events.
         Important methods:
               1. onStart(ISuite suite)
               2. onFinish(ISuite suite)

        3️⃣ IInvokedMethodListener = Triggered before and after method invocation.
         Important Methods:
               1. beforeInvocation()
               2. afterInvocation()

         4️⃣ IRetryAnalyzer = Used to retry failed test cases.
          */

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart!");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure!");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped!");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage!");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout!");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart!");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish!");
    }

}
