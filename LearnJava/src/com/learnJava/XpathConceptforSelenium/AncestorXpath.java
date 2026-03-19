package com.learnJava.XpathConceptforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AncestorXpath {

    @Test
    public void AncestorXpathEx(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

//      Now creating the dynamic relative xpath for identifying the webelement
        /* Syntax: //ElementName(TagName)[Known Xpath]/ancestor::ElementName (or)
                   //*[Known Xpath]/ancestor::*
         */
        //ElementName(TagName)[Known Xpath]/ancestor::ElementName
        String Value = driver.findElement(By.xpath("//li[starts-with(text(),'This is a simple Login page.')]/ancestor::section[1]")).getAttribute("id");
        System.out.println(Value);

        //*[Known Xpath]/ancestor::*
        String value = driver.findElement(By.xpath("//*[starts-with(text(),'This is a simple Login page.')]/ancestor::*[2]")).getText();
        System.out.println(value);
    }
}
