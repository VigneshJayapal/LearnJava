package com.learnJava.PageObjectModelFramework.UsingPageFactory.PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ApplicationLoginPageObjects {

    @FindBy(how=How.ID, using = "username")
    public static WebElement userNameTextBox;

    @FindBy(how=How.ID, using = "password")
    public static WebElement passwordTextBox;

    @FindBy(how=How.ID, using = "submit")
    public static WebElement submitButton;

    @FindBy(how=How.TAG_NAME, using = "strong")
    public static WebElement getSuccessText;

  /*  public static WebElement userNameTextBox(WebDriver driver){
        return driver.findElement(By.id("username"));
    }

    public static WebElement passwordTextBox(WebDriver driver){
        return driver.findElement(By.id("password"));
    }

    public static WebElement submitButton(WebDriver driver){
        return driver.findElement(By.id("submit"));
    }

    public static WebElement getSuccessText(WebDriver driver){
        return driver.findElement(By.tagName("strong"));
    }*/
}

