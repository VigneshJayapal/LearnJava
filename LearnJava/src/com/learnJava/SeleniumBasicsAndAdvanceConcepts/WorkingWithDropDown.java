package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDown {

    /*Goal of Scripting: Interacting with Dropdowns
     * 1. Open Google Browser
     * 2. Navigate to TestLeaf site
     * 3. Using Select Class we can create an object and do the interaction with drop
     *      down by using the inbuild option - 1. Select By Index
     *                                         2. Select By value
     *                                         3. Select By VisibleText
     * 4. How many List of options exist in the dropdown
     * 5. Select the options by using SendKeys
     * 6. Multi Select drop down to choose multiple options */

    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.leafground.com/select.xhtml");
//      interaction with drop down by using the inbuild option - 1. Select By Index
        WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
        Select select = new Select(dropdown1);
        select.selectByIndex(1);

//      interaction with drop down by using the inbuild option - 2. Select By Value
//        select.selectByValue("3");

//      interaction with drop down by using the inbuild option - 2. Select By VisibleText
        select.selectByVisibleText("Selenium");

//      4. How many List of options exist in the dropdown
        int listSize = select.getOptions().size();
        System.out.println("Size of the dropdown: "+listSize);

//      5. Select the options by using SendKeys
        dropdown1.sendKeys("Cypress");

        /*Need to revisit scenario 6!!!!!!!!!!!!!!!!!!!!!!!!!*/
//      6. Multi Select drop down to choose multiple options
        WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button"));
        dropdown2.sendKeys("PostMan"+ Keys.ENTER);
        dropdown2.sendKeys("AWS"+ Keys.ENTER);
        dropdown2.sendKeys("JMeter"+ Keys.ENTER);

    }
}
