package com.learnJava.SeleniumExceptionHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoSuchFrameExceptionEx {

    /*🔹 NoSuchFrameException (Selenium)

NoSuchFrameException is thrown when Selenium tries to switch to a frame
    that does not exist on the page.

📌 Hierarchy
RuntimeException
   └── WebDriverException
        └── NotFoundException
             └── NoSuchFrameException*/
    @Test
    public void NoSuchFrameException(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");

        driver.switchTo().frame(5);
    }
}
