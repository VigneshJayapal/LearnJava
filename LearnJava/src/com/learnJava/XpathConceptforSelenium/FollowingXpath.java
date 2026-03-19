package com.learnJava.XpathConceptforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FollowingXpath {

    @Test
    public void FollowingXpathEx(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

//      Now creating the dynamic relative xpath for identifying the webelement
        /* Syntax: //ElementName(TagName)[Known Xpath]/following::ElementName (or)
                   //*[Known Xpath]/following::*
         */

        //ElementName(TagName)[Known Xpath]/following::ElementName
        String Value = driver.findElement(By.xpath("//li[contains(text(),'Use next credentials to execute Login:')]/following::b[3]")).getText();
        System.out.println(Value);

        //*[Known Xpath]/following::*
        String value = driver.findElement(By.xpath("//*[contains(text(),'Use next credentials to execute Login:')]/following::*[3]")).getText();
        System.out.println(value);
    }
}
