package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchTheTerm {

    /*Goal of scripting:
    *   1. Open the Chrome browser
    *   2. Navigate to the Google Homepage
    *   3. Search the term in search box
    *   4. Enter to search the term
    *   5. Close th browser*/

    public static void main(String[] args){
        System.setProperty("weddriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        1. Open the Chrome browser
//        2. Navigate to the Google Homepage
        driver.get("https:\\www.google.co.in");
//        3. Search the term in search box
//        4. Enter to search the term
        driver.findElement(By.id("APjFqb")).sendKeys("India"+ Keys.ENTER);
//        5. Close th browser
        driver.quit();

    }
}
