package com.learnJava.SeleniumExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeoutExceptionEx {

    /*🔹 TimeoutException (Selenium)

TimeoutException is thrown when Selenium waits for a condition to happen,
    but it does not occur within the specified time.

👉 Simple meaning:
Selenium waited… but the expected condition never became true.

📌 Hierarchy
RuntimeException
   └── WebDriverException
        └── TimeoutException*/

    @Test
    public void TimeoutException() throws InterruptedException {

/*Test case 5: TimeoutException
Open page
Click Add button
Wait for 3 seconds for the second input field to be displayed
Verify second input field is displayed
The second row shows up after about 5 seconds, so a 3-second timeout is not enough.
    That’s why we will get TimeoutException while executing steps in the above test case.*/

        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        driver.findElement(By.id("add_btn")).click();

        driver.findElement(By.xpath("//*[@id=\"row2\"]/input")).isDisplayed();
    }
}
