package com.learnJava.XpathConceptforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleAttributesEx {

    @Test
    public void MultipleAttributesForXpath(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");

//      Now creating the dynamic relative xpath for identifying the webelement
        /* Syntax: //ElementName(TagName)[@AttributeName1 = 'Value1'][@AttributeName2 = 'Value2'][@AttributeName3 = 'Value3']
         */

        driver.findElement(By.xpath("//textarea[@name='q'][@title='Search'][@id='APjFqb']")).sendKeys("India");
    }
}
