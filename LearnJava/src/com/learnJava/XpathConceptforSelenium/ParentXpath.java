package com.learnJava.XpathConceptforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParentXpath {

    @Test
    public void ParentXpathEX(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");

//      Now creating the dynamic relative xpath for identifying the webelement
        /* Syntax: //ElementName(TagName)[Known Xpath]/parent::ElementName (or)
                   //*[Known Xpath]/parent::*
         */
        //ElementName(TagName)[Known Xpath]/parent::ElementName
        String Value = driver.findElement(By.xpath("//div[@id='SIvCob']/parent::div")).getText();
        System.out.println(Value);

        //*[Known Xpath]/parent::*
        String value = driver.findElement(By.xpath("//*[contains(text(),'Gmail')]/parent::*")).getAttribute("class");
        System.out.println(value);
    }
}
