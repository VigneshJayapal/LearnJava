package com.learnJava.DataDrivenFramework.UsingParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class BothInvalidData {

    public WebDriver driver;

    @BeforeSuite
    public void loginToUrl(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterSuite
    public void closeTheBrowser(){
        driver.quit();
    }

    @Test(priority = 0)
    @Parameters({"userName3","password3"})
    public void PassingInValidUserNameAndPassword(String uName, String pWord){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("orangehrm-login-logo-mobile")));

        WebElement userNameEditBox = driver.findElement(By.name("username"));
        userNameEditBox.sendKeys(uName);

        WebElement passwordEditBox = driver.findElement(By.name("password"));
        passwordEditBox.sendKeys(pWord);

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        submitButton.click();

        driver.navigate().back();
    }
}
