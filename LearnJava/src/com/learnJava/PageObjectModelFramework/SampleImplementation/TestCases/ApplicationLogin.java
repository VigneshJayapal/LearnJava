package com.learnJava.PageObjectModelFramework.SampleImplementation.TestCases;

import com.learnJava.PageObjectModelFramework.SampleImplementation.PageObjectClass.ApplicationLoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApplicationLogin {

    @Test
    public void loginPage(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

        //Login Credentials
        ApplicationLoginPageObjects.userNameTextBox(driver).sendKeys("student");
        ApplicationLoginPageObjects.passwordTextBox(driver).sendKeys("Password123");
        ApplicationLoginPageObjects.submitButton(driver).click();

        String successMsg = ApplicationLoginPageObjects.getSuccessText(driver).getText();
        System.out.println(successMsg);

    }
}
