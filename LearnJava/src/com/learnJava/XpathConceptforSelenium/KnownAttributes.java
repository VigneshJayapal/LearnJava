package com.learnJava.XpathConceptforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KnownAttributes {

    @Test
    public void KnownAttributesOfXpath(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");

//      Now creating the dynamic relative xpath for identifying the webelement
        /* Syntax: //*[AttributeName=AttributeValue] - here * is a unknown Element Name
        */
        WebElement searchBox = driver.findElement(By.xpath("//*[@name='q']"));
        searchBox.sendKeys("India");
    }
}
