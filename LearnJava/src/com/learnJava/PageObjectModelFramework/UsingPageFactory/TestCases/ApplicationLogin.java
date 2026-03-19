package com.learnJava.PageObjectModelFramework.UsingPageFactory.TestCases;

import com.learnJava.PageObjectModelFramework.UsingPageFactory.PageObjectClass.ApplicationLoginPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ApplicationLogin {

    @Test
    public void loginPage(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

//      Using Page Factory
        PageFactory.initElements(driver, ApplicationLoginPageObjects.class);

        //Login Credentials
        ApplicationLoginPageObjects.userNameTextBox.sendKeys("student");
        ApplicationLoginPageObjects.passwordTextBox.sendKeys("Password123");
        ApplicationLoginPageObjects.submitButton.click();
        String successMsg = ApplicationLoginPageObjects.getSuccessText.getText();
        System.out.println(successMsg);

    /*//Login Credentials
        ApplicationLoginPageObjects.userNameTextBox(driver).sendKeys("student");
        ApplicationLoginPageObjects.passwordTextBox(driver).sendKeys("Password123");
        ApplicationLoginPageObjects.submitButton(driver).click();

        String successMsg = ApplicationLoginPageObjects.getSuccessText(driver).getText();
        System.out.println(successMsg);
*/
}
}

