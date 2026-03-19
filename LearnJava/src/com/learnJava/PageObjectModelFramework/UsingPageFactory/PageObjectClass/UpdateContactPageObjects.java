package com.learnJava.PageObjectModelFramework.UsingPageFactory.PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UpdateContactPageObjects {

    @FindAll( @FindBy(how= How.XPATH, using = "//*[@id=\"menu-item-18\"]"))
    public static WebElement clickContactbutton;

    @FindAll({@FindBy(how=How.ID, using = "wpforms-161-field_0"),
            @FindBy(how =How.NAME, using = "wpforms[fields][0][first]")})
    public static WebElement updateFirstName;

    @FindBy(id = "wpforms-161-field_0-last")
    public static WebElement updateLastName;

    @FindBy(id = "wpforms-161-field_1")
    public static WebElement updateEmailAddress;

    @FindBy(id = "wpforms-161-field_2")
    public static WebElement updateComment;

    @FindBy(id = "wpforms-submit-161")
    public static WebElement clickSubmitButton;


/*
    public static WebElement clickContactbutton(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"menu-item-18\"]/a"));
    }

    public static WebElement updateFirstName(WebDriver driver){
        return driver.findElement(By.id("wpforms-161-field_0"));
    }

    public static WebElement updateLastName(WebDriver driver){
        return driver.findElement(By.id("wpforms-161-field_0-last"));
    }

    public static WebElement updateEmailAddress(WebDriver driver){
        return driver.findElement(By.id("wpforms-161-field_1"));
    }

    public static WebElement updateComment(WebDriver driver) {
        return driver.findElement(By.id("wpforms-161-field_2"));
    }

    public static WebElement clickSubmitButton(WebDriver driver) {
        return driver.findElement(By.id("wpforms-submit-161"));
    }*/
}

