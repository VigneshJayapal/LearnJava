package com.learnJava.SeleniumExceptionHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoSuchSessionExceptionEx {

    /*🔹 NoSuchSessionException (Selenium)

NoSuchSessionException is thrown when WebDriver tries to perform an operation on a session
    that does not exist or has already been closed.

In simple words 👉
You are trying to use the driver after the browser session is gone.

📌 Hierarchy
RuntimeException
   └── WebDriverException
        └── NoSuchSessionException */
    @Test
    public void NoSuchSessionException(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");
        driver.quit();
        driver.navigate().refresh();
    }
}
