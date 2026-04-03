package com.learnJava.SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SeleniumWaits_FluentWait {

    public static WebDriver driver;

    public static void Login(){
        System.setProperty("webdriver.gecko.driver","A:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.testautomationpractice.blogspot.com/");
    }

    public static void SearchTheTerm(){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);
        WebElement homeButton = wait.until(driver1 -> driver1.findElement(By.linkText("Home")));
        homeButton.click();
    }

    public static void CloseBrowser(){
        driver.quit();
    }

    public static void main(String[]args){
        Login();
        SearchTheTerm();
        CloseBrowser();
    }
}
