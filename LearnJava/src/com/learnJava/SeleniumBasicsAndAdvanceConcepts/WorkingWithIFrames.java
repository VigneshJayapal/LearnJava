package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WorkingWithIFrames {

    /*Goal of Scripting: Working with IFrames
    1. Open Google Chrome
    2. Navigate to TestLeaf site
    3. Click Me (Inside frame)
    4. Click Me (Inside Nested frame)
    5. How many frames in this page? */

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/frame.xhtml");

//      3. Click Me (Inside frame)
        driver.switchTo().frame(0);
        WebElement button1 = driver.findElement(By.id("Click"));
        button1.click();
        String frameMsg = driver.findElement(By.id("Click")).getText();
        System.out.println("Frame Message: "+frameMsg);
        driver.switchTo().defaultContent();

//      4. Click Me (Inside Nested frame)
        driver.switchTo().frame(2);
        driver.switchTo().frame("frame2");
        WebElement nestedFrameButton = driver.findElement(By.id("Click"));
        nestedFrameButton.click();
        String nestedFrameMsg = driver.findElement(By.id("Click")).getText();
        System.out.println("Nested Frame Message: "+nestedFrameMsg);
        driver.switchTo().defaultContent();

//      5. How many frames in this page?
        List<WebElement> countOfFrame = driver.findElements(By.tagName("iframe"));
        int totalCount = countOfFrame.size();
        System.out.println("Total Frame present in the DOM is: "+totalCount);

        driver.quit();
    }
}
