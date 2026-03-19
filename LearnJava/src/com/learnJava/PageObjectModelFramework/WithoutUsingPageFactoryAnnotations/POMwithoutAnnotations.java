package com.learnJava.PageObjectModelFramework.WithoutUsingPageFactoryAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMwithoutAnnotations {

    /* Below mentioned variable names were WebElement ID's were directly passing here
            to execute the POM without annotations   */
    public static WebElement username; //driver.findElement(By.id("username"));
    public static WebElement password; //driver.findElement(By.id("password"));
    public static WebElement submit;   //driver.findElement(By.id("submit"));

    @Test(priority = 0)
    public void loginWithoutAnnotations(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

//      Using Page Factory
        PageFactory.initElements(driver, POMwithoutAnnotations.class);

        //Login Credentials
        /*
        Without using Find elements and Annotation in the Page Factory, the below scripts run on the basis of Page Factory initialization done
            on the above line will consider the variable name with ID name of the WebElement and it tries to match in the web page. */
        username.sendKeys("student");
        password.sendKeys("Password123");
        submit.click();
    }
}
