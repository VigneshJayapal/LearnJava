package com.learnJava.TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecutionExamples {

    /* Goal of Scripting: Parallel execution in TestNG lets you run multiple tests
                            at the same time instead of sequentially, which dramatically
                            reduces execution time—especially useful for large suites,
                            Selenium tests, or CI pipelines.
            1) Parallel by Methods = Runs test methods concurrently.
            2) Parallel by Classes = Runs all methods of different classes in parallel.
            3) Parallel by Tests = Runs <test> tags in parallel.
            4) Parallel by Instances = Runs different instances of the same class in parallel. */

/*     1) Parallel by Methods */
    @Test(priority = 0, enabled = true)
    public void OpenChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
    }

    @Test(priority = 1, enabled = true)
    public void OpenFireFox(){
        System.setProperty("webdriver.gecko.driver", "A:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
    }

    @Test(priority = 2, enabled = true)
    public void OpenMicrosoftEdge(){
        System.setProperty("Webdriver.edge.driver", "A:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
    }
}
