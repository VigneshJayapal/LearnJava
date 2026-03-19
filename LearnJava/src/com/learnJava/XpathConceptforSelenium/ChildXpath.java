package com.learnJava.XpathConceptforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChildXpath {

    @Test
public void ChildXpathEx(){
    System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

//      Now creating the dynamic relative xpath for identifying the webelement
        /* Syntax: //ElementName(TagName)[Known Xpath]/child::ElementName (or)
                   //*[Known Xpath]/child::*
         */

        //ElementName(TagName)[Known Xpath]/child::ElementName
    String Value = driver.findElement(By.xpath("//li[contains(text(),'Use next credentials to execute Login:')]/child::b")).getText();
    System.out.println(Value);

        //*[Known Xpath]/child::*
    String value = driver.findElement(By.xpath("//*[contains(text(),'Use next credentials to execute Login:')]/child::*[4]")).getText();
    System.out.println(value);

}
}
