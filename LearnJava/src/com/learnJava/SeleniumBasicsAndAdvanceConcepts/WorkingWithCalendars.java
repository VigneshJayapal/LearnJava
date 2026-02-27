package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WorkingWithCalendars {

    /* Goal of Scripting: Interacting with Calendar's = https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html
    *       1. Open Google Browser
     *      2. Navigate to Selenium Practise site for Calendar interaction
     *      3. Using SendKeys to select the Date
     *      4. Using the Date picker to select Older date
     *      5. Using the Date picker to select Future date */

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

//      3. Using SendKeys to select the Date
        WebElement sendDate = driver.findElement(By.id("datepicker"));
        sendDate.sendKeys("02/02/2026"+ Keys.ENTER);

//      4. Using the Date picker to select Older date
        WebElement clickOlderDate = driver.findElement(By.id("datepicker"));
        clickOlderDate.click();
        WebElement previousDatePicker = driver.findElement(By.xpath("//a[@title='Prev']"));
        previousDatePicker.click();
        WebElement selectDate = driver.findElement(By.xpath("//a[contains(text(),12)]"));
        selectDate.click();

        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("datepicker")));

//      5. Using the Date picker to select Future date
        WebElement clickNewerDate = driver.findElement(By.id("datepicker"));
        clickNewerDate.click();
        WebElement newDatePicker = driver.findElement(By.xpath("//a[@title='Next']"));
        newDatePicker.click();
        WebElement selectDateNew = driver.findElement(By.xpath("//a[contains(text(),15)]"));
        selectDateNew.click();
    }
}
