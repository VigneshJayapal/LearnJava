package com.learnJava.XpathConceptforSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KnownStartWithTerm {
    @Test
    public void KnownStartWithTermForXpath(){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");

//      Now creating the dynamic relative xpath for identifying the webelement
        /* Syntax: //elementname[starts-with(text(),'StartingTextValue')]
         */
        /* Syntax: //elementname[starts-with(text(),'StartingTextValue')] */
        String value1 = driver.findElement(By.xpath("//a[starts-with(text(),'Ab')]")).getText();
        System.out.println("Value1 is: "+value1);

    }
}
