package com.learnJava.SeleniumExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnhandledAlertExceptionEx {

    /*🔹 UnhandledAlertException (Selenium)

UnhandledAlertException is thrown when a JavaScript alert/popup appears and Selenium tries to perform another action without handling it first.

👉 Simple meaning:
An alert is blocking the browser… and you didn’t handle it.

📌 Hierarchy
RuntimeException
   └── WebDriverException
        └── UnhandledAlertException */
    @Test
    public void UnhandledAlertException() {
        System.setProperty("Webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml");

        driver.findElement(By.id("j_idt88:j_idt91")).click();

        driver.findElement(By.id("j_idt88:j_idt91")).click();
    }
}