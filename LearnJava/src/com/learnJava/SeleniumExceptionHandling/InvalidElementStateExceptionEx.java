package com.learnJava.SeleniumExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvalidElementStateExceptionEx {

    /*🔹 InvalidElementStateException (Selenium)

InvalidElementStateException is thrown when an element is present in the DOM but its current state does not allow the requested operation.

👉 Simple meaning:
Element exists… but you cannot perform that action on it.

📌 Hierarchy
RuntimeException
   └── WebDriverException
        └── InvalidElementStateException
             ├── ElementNotInteractableException
             │     └── ElementClickInterceptedException
             ├── ElementNotSelectableException
             └── ElementNotVisibleException (Deprecated)*/
    @Test
    public void InvalidElementStateException(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        driver.findElement(By.className("input-field")).clear();
    }
}
