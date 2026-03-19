package com.learnJava.SeleniumExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SessionNotCreatedExceptionEx {

    /*🔹 SessionNotCreatedException (Selenium)

SessionNotCreatedException is thrown when WebDriver fails to create a new browser session.

👉 Simple meaning:
Selenium tried to start the browser… but couldn’t create a session.

📌 Hierarchy
RuntimeException
   └── WebDriverException
        └── SessionNotCreatedException*/

    @Test
    public void SessionNotCreatedException(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//      Manually close the browser to get this exception
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        driver.findElement(By.className("input-field")).clear();
    }
}
