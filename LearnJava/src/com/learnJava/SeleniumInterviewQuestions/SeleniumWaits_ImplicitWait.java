package com.learnJava.SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class SeleniumWaits_ImplicitWait {

    public static WebDriver driver;

    public static void Login(){
        System.setProperty("webdriver.gecko.driver","A:\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.testautomationpractice.blogspot.com/");
    }

    public static void SearchTheTerm(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Home")).click();
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
