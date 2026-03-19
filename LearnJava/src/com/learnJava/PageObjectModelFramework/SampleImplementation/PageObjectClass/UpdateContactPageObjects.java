package com.learnJava.PageObjectModelFramework.SampleImplementation.PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateContactPageObjects {

    public static WebElement clickContactbutton(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"menu-item-18\"]"));
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
    }
}
