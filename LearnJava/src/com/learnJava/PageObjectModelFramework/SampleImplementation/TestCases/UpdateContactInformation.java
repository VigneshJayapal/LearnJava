package com.learnJava.PageObjectModelFramework.SampleImplementation.TestCases;

import com.learnJava.PageObjectModelFramework.SampleImplementation.PageObjectClass.ApplicationLoginPageObjects;
import com.learnJava.PageObjectModelFramework.SampleImplementation.PageObjectClass.UpdateContactPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class UpdateContactInformation {
    public static WebDriver driver;

    @Test(priority = 0)
    public void loginPage(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

        //Login Credentials
        ApplicationLoginPageObjects.userNameTextBox(driver).sendKeys("student");
        ApplicationLoginPageObjects.passwordTextBox(driver).sendKeys("Password123");
        ApplicationLoginPageObjects.submitButton(driver).click();

        String successMsg = ApplicationLoginPageObjects.getSuccessText(driver).getText();
        System.out.println(successMsg);
    }

    @Test(priority = 1)
    public void updateContactInfo(){
        UpdateContactPageObjects.clickContactbutton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wpforms-161-field_0")));
        UpdateContactPageObjects.updateFirstName(driver).sendKeys("PRAVAN");
        UpdateContactPageObjects.updateLastName(driver).sendKeys("V");
        UpdateContactPageObjects.updateEmailAddress(driver).sendKeys("123@gmail.com");
        UpdateContactPageObjects.updateComment(driver).sendKeys("Hi Hello!");
        UpdateContactPageObjects.clickSubmitButton(driver).click();
    }
}
