package com.learnJava.XpathConceptforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrecedingXpath {

    @Test
    public void PrecedingXpathEx(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

//      Now creating the dynamic relative xpath for identifying the webelement
        /* Syntax: //ElementName(TagName)[Known Xpath]/following::ElementName (or)
                   //*[Known Xpath]/following::*
         */
        //*[Known Xpath]/following::*
        String Value = driver.findElement(By.xpath("//*[contains(text(),'Use next credentials to execute Login:')]/preceding::*[2]")).getText();
        System.out.println(Value);

        //ElementName(TagName)[Known Xpath]/following::ElementName
        String value = driver.findElement(By.xpath("//li[contains(text(),'Use next credentials to execute Login:')]/preceding::link")).getAttribute("href");
        System.out.println(value);
    }
}
