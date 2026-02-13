package com.learnJava.Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WorkingWithButtons {

/*Goal of Scripting: Working with Buttons
* 1. Open Google browser
* 2. Navigate to the Test site with Button interaction
* 3. Click and confirm the title
* 4. Find the position of the button
* 5. Verify either the button is enabled or not
* 6. Find the Height and Width of the button
* 7. Find the color of the button
* 8. How many rounded buttons are there? */

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml");

//      4. Find the position of the button
        WebElement buttonPosition = driver.findElement(By.id("j_idt88:j_idt94"));
        Point xPoint = buttonPosition.getLocation();
        int xPointValue = xPoint.getX();
        Point yPoint = buttonPosition.getLocation();
        int yPointValue = yPoint.getY();
        System.out.println("X value is: "+xPointValue+" and "+"Y value is: "+yPointValue);

//      5. Verify either the button is enabled or not
        WebElement isButtonEnabled = driver.findElement(By.id("j_idt88:j_idt92"));
        if(isButtonEnabled.isEnabled()){
            System.out.println("Button is enabled!");
        } else{
            System.out.println("Button is disabled!");
        }

//      6. Find the Height and Width of the button
        WebElement sizeOfTheButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
        int buttonHeight = sizeOfTheButton.getSize().getHeight();
        int buttonWidth = sizeOfTheButton.getSize().getWidth();
        System.out.println("Heigh of the Button: "+buttonHeight+" and "+ "Width of the Button: "+buttonWidth);

//      7. Find the color of the button
        WebElement buttonColor = driver.findElement(By.id("j_idt88:j_idt100"));
        String buttonColorValue = buttonColor.getCssValue("background-color");
        System.out.println("Color of the Button: "+buttonColorValue);

//      8. How many rounded buttons are there? - Important topic
        /* Below is the regular expression used to find the buttons in the DOM - "//button | //a[contains(@class,'btn')]" */
        List<WebElement> listOfButtons = driver.findElements(By.xpath("//button | //a[contains(@class,'btn')]"));

        int roundedButtonCount = 0;
        for(WebElement buttons: listOfButtons){
            String buttonValue = buttons.getAttribute("class");
            if(buttonValue.contains("rounded-button")){
                roundedButtonCount++;
                System.out.println("Name of the button: "+buttons.getText());
            }
        }
        System.out.println("Total Count of the Round shaped button is: "+ roundedButtonCount);

//      3. Click and confirm the title
        WebElement clickButton = driver.findElement(By.id("j_idt88:j_idt90"));
        clickButton.click();
        WebElement expectedElement = driver.findElement(By.id("j_idt15"));
        if(expectedElement.isDisplayed()){
            System.out.println("Success: Expected Element exist!");
        } else{
            System.out.println("Failure: Expected Element not exist!");
        }
    }

}
