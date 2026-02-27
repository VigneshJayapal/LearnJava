package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithLinks {

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/link.xhtml");

        /*Link interaction
        * 1. Click the Link Text Locators*/
          driver.findElement(By.linkText("Go to Dashboard")).click();

//        2. Click the Partial Link Text Locators
            driver.findElement(By.partialLinkText("clicking me.")).click();

//        3. Verify the Partial Link Text locators
          boolean validateTheLinks = driver.findElement(By.partialLinkText("Broken")).isEnabled();
          System.out.println("Is this link enable: True or False? - " + validateTheLinks);
    }
}
