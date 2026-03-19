package com.learnJava.SeleniumExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoSuchWindowExceptionEx {

/*🔹 NoSuchWindowException (Selenium)

NoSuchWindowException is thrown when Selenium tries to switch to or interact with a browser window/tab that does not exist.

👉 Simple meaning:
You are trying to access a window that is already closed or never existed.

📌 Hierarchy
RuntimeException
   └── WebDriverException
        └── NotFoundException
             └── NoSuchWindowException*/

    @Test
    public void NoSuchWindowException(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/window.xhtml");

        String oldWindow = driver.getWindowHandle();
//      3. Click and Confirm new Window Opens
        WebElement firstWindowButton = driver.findElement(By.id("j_idt88:new"));
        firstWindowButton.click();

        driver.switchTo().window("google page");
    }
}
