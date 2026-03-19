package com.learnJava.XpathConceptforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FollowingSiblingsXpath {

    @Test
    public void FollowingSiblingsXpathEx(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

//      Now creating the dynamic relative xpath for identifying the webelement
        /* Syntax: //ElementName(TagName)[Known Xpath]/following-sibling::ElementName (or)
                   //*[Known Xpath]/following-sibling::*
         */

        //ElementName(TagName)[Known Xpath]/following-sibling::ElementName
        String Value = driver.findElement(By.xpath("//h5[contains(text(),'Test case 1: Positive LogIn test')]/following-sibling::h5[1]")).getText();
        System.out.println(Value);

        //*[Known Xpath]/following-sibling::*
        String value = driver.findElement(By.xpath("//*[contains(text(),'Test case 1: Positive LogIn test')]/following-sibling::*[6]")).getText();
        System.out.println(value);
    }
}
