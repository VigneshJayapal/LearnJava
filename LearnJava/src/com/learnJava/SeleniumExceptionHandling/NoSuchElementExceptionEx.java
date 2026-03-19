package com.learnJava.SeleniumExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoSuchElementExceptionEx {

    /*🔹 NoSuchElementException (Selenium)

NoSuchElementException is one of the most common exceptions in Selenium.
It is thrown when WebDriver is unable to locate an element on the webpage using the given locator.

📌 Hierarchy
RuntimeException
   └── WebDriverException
        └── NotFoundException
             └── NoSuchElementException */

    @Test
    public void NoSuchElementException(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");

        driver.findElement(By.name("qb")).sendKeys("India");
    }
}
