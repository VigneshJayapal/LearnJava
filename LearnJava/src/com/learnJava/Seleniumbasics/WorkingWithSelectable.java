package com.learnJava.Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class WorkingWithSelectable {

    /* Goal of Scripting: Working with Selectable
     * 1. Open Google with Chrome Browser
     * 2. Navigate to the TestLeaf site to interact with Selectable List Options
     * 3. Select the list of options with Actions class using Keys options
     * 4. Select the list of options with Actions class using inbuilt functions */

    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/list.xhtml");
        List<WebElement> selectMultiOptions = driver.findElements(By.xpath("//*[@id=\"j_idt111\"]/div/div[2]/ul/li"));
        int listSize = selectMultiOptions.size();
        System.out.println("Size of List is "+listSize);

//      3. Select the list of options with Actions class using Keys options
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(selectMultiOptions.get(0))
                .click(selectMultiOptions.get(1))
                .click(selectMultiOptions.get(2)).build().perform();

//      4. Select the list of options with Actions class using inbuilt functions
        Actions actions1 = new Actions(driver);
        actions1.keyDown(Keys.CONTROL)
                .click(selectMultiOptions.get(3))
                .click(selectMultiOptions.get(4))
                .click(selectMultiOptions.get(5))
                .click(selectMultiOptions.get(6))
                .keyUp(Keys.CONTROL).build().perform();

    }
}
