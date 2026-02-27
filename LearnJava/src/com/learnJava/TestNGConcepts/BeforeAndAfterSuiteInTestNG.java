package com.learnJava.TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAndAfterSuiteInTestNG {
    WebDriver driver;

    /* Goal of Scripting:
    *       1. Open Google Chrome
    *       2. Navigate to Google HomePage
    *       3. Navigate to Bing HomePage
    *       4. Navigate to Yahoo HomePage
    *       5. Quit the browser */

    @BeforeSuite
    public void LaunchBrowser(){
        System.setProperty("webdriver.gecko.driver", "A:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        long startTime = System.currentTimeMillis();
        System.out.println("Start Time: "+startTime);
    }

    @Test(priority = 0)
    public void OpenGoogle(){
        driver.navigate().to("https://www.google.co.in");
        driver.navigate().back();
    }

    @Test(priority = 1)
    public void OpenBing(){
        driver.navigate().to("https://www.bing.com");
        driver.navigate().back();
    }

    @Test(priority = 2)
    public void OpenWikipedia(){
        driver.navigate().to("https://www.wikipedia.com");
    }

    @AfterSuite
    public void CloseBrowser(){
        driver.quit();
        long endTime = System.currentTimeMillis();
        System.out.println("EndTime: "+endTime);
    }

}
