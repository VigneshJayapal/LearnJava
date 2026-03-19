package com.learnJava.SeleniumExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class StaleElementReferenceExceptionEx {

/*🔹 StaleElementReferenceException (Selenium)

StaleElementReferenceException occurs when a previously located
    WebElement is no longer attached to the DOM (Document Object Model).

👉 In simple words:
You found the element earlier… but now the page has changed.

📌 Hierarchy
RuntimeException
   └── WebDriverException
        └── StaleElementReferenceException  */
    @Test
    public void staleElementReferenceException(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("India"+ Keys.ENTER);
        searchBox.clear();
       /* Result: org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
  (Session info: chrome=145.0.7632.159)*/
    }

}
