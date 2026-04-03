package com.learnJava.ExtendReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ReportingViaExtendReport {
    public WebDriver driver;
    public ExtentReports extentReports;
    public ExtentSparkReporter sparkReporter;
    public ExtentTest extentTest;

    @BeforeSuite
    public void LaunchBrowser(){
        extentReports = new ExtentReports() ;
        sparkReporter = new ExtentSparkReporter("ExtentReport.html");
        extentReports.attachReporter(sparkReporter);
        System.setProperty("webdriver.gecko.driver", "A:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 0,enabled = true)
    public void OpenGoogle() throws IOException {
        extentTest = extentReports.createTest("Verify Open Google Test Case");
        driver.get("https://www.google.com");
        extentTest.log(Status.INFO,"Navigate to Google");
        String title = driver.getTitle();
        extentTest.log(Status.INFO, "Actual title is :"+ title);
        extentTest.log(Status.INFO, "Expected title is : Google");
        if(title.equals("Google")){
            extentTest.log(Status.PASS, "Google launched successfully");
        } else {
            extentTest.fail("Google launch failed");
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File("GoogleScreenshot.png");
            FileUtils.copyFile(source, destination);
            extentTest.addScreenCaptureFromPath("GoogleScreenshot.png");
        }
    }

    @Test(priority = 1,enabled = true)
    public void OpenBing() throws IOException {
        extentTest = extentReports.createTest("Verify Open Bing Test Case");
        driver.get("https://www.bing.com");
        extentTest.log(Status.INFO,"Navigate to Bing");
        String title = driver.getTitle();
        extentTest.log(Status.INFO, "Actual title is :"+ title);
        extentTest.log(Status.INFO, "Expected title is : Bing");
        if(title.equals("Bing")){
            extentTest.pass("Bing launched successfully");
        } else {
            extentTest.fail("Bing launch failed");
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File("BingScreenshot.png");
            FileUtils.copyFile(source, destination);
            extentTest.addScreenCaptureFromPath("BingScreenshot.png");
        }
    }

    @Test(priority = 2,enabled = true)
    public void OpenYoutube() throws IOException {
        extentTest = extentReports.createTest("Verify Open Youtube Test Case");
        driver.get("https://www.youtube.com");
        extentTest.log(Status.INFO,"Navigate to YouTube");
        String title = driver.getTitle();
        extentTest.log(Status.INFO, "Actual title is :"+ title);
        extentTest.log(Status.INFO, "Expected title is : YouTube");
        if(title.equals("YouTube")){
            extentTest.pass("YouTube launched successfully");
        } else {
            extentTest.fail("YouTube launch failed");
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File("YouTubeScreenshot.png");
            FileUtils.copyFile(source, destination);
            extentTest.addScreenCaptureFromPath("YouTubeScreenshot.png");
        }
    }

    @AfterSuite
    public void CloseBrowser(){
        driver.quit();
        extentReports.flush();
    }
}
