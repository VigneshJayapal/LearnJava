package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextBoxes {

    /*Goal of scripting: Working with Text Box
    * 1. Open Google Browser
    * 2. Navigate to TestLeaf site
    * 3. Edit the text box
    * 4. Append new context with the existing content in the text
    * 5. Verify whether the text box is enabled or not
    * 6. Clear the existing text
    * 7. Get the value from the text box
    * 8. Type the text and press tab key for moving control to next element */

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");

//      3. Edit the text box
        WebElement textBox = driver.findElement(By.id("j_idt88:name"));
        textBox.sendKeys("PRANAV");

//      4. Append new context with the existing content in the text
        /* SendKey functionality is to append the text whatever we provide, it will never
        *  remove or clear the existing text in the text box */
        WebElement appendValueInTextBox = driver.findElement(By.id("j_idt88:j_idt91"));
        appendValueInTextBox.sendKeys(" City Gangster!");

//      5. Verify whether the text box is enabled or not
        boolean textBoxCondition = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is the text box enabled - true or false: "+ textBoxCondition);

//      6. Clear the existing text
        WebElement clearTextBox = driver.findElement(By.id("j_idt88:j_idt95"));
        clearTextBox.clear();

//      7. Get the value from the text box
        WebElement getTextboxValue = driver.findElement(By.id("j_idt88:j_idt97"));
        String textValue = getTextboxValue.getAttribute("value");
        System.out.println("The Value is :"+ textValue);

//      8. Type the text and press tab key for moving control to next element
        WebElement emailBox = driver.findElement(By.id("j_idt88:j_idt99"));
        emailBox.sendKeys("123@gmail.com"+ Keys.TAB);
        WebElement nextActiveElement = driver.switchTo().activeElement();

        WebElement expectedActiveElement = driver.findElement(By.id("j_idt88:j_idt101"));

        if(nextActiveElement.equals(expectedActiveElement)){
            System.out.println("Success: Control moved to the expected Active elements!");
        } else {
            System.out.println("Failure: Control not moved to the expected Active elements!");
        }
    }
}
