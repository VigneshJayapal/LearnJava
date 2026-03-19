package com.learnJava.SeleniumExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ElementNotInteractableExceptionEx {

    /*🔹 ElementNotInteractableException (Selenium)

ElementNotInteractableException is thrown when the element is present in the DOM but cannot be interacted with.

👉 Simple meaning:
Element exists… but Selenium cannot click/type on it.

📌 Hierarchy
RuntimeException
   └── WebDriverException
        └── InvalidElementStateException
             └── ElementNotInteractableException
                  └── ElementClickInterceptedException  */
    @Test
    public void ElementNotInteractableException(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        driver.findElement(By.className("input-field")).sendKeys("Burger");
    }
}
