package com.learnJava.Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WorkingWithWindowsHandle {

    /*Goal of Scripting: Working with Windows Handle
    1. Open Google Chrome
    2. Navigate to TestLeaf site
    3. Click and Confirm new Window Opens
    4. Find the number of opened tabs
    5. Close all windows except Primary
    6. Wait for 2 new tabs to open
    * */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/window.xhtml");

        String oldWindow = driver.getWindowHandle();
//      3. Click and Confirm new Window Opens
        WebElement firstWindowButton = driver.findElement(By.id("j_idt88:new"));
        firstWindowButton.click();
//        Thread.sleep(3000);
        Set<String> newWindows = driver.getWindowHandles();
        for(String allNewWindows: newWindows){
            if(!allNewWindows.equals(oldWindow)){
                driver.switchTo().window(allNewWindows);
                driver.close();
            }
        }

        driver.switchTo().window(oldWindow);

//      4. Find the number of opened tabs
        WebElement multipleWindowButton = driver.findElement(By.id("j_idt88:j_idt91"));
        multipleWindowButton.click();

        Set<String> newWindows1 = driver.getWindowHandles();
        int sizeOfNewlyOpenedWindow = newWindows1.size();
        System.out.println("No of Opened window: "+sizeOfNewlyOpenedWindow);

//      5. Close all windows except Primary
        for(String newWindow: newWindows1){
            if(!newWindow.equals(oldWindow)){
                driver.switchTo().window(newWindow);
                driver.close();
            }
        }
        driver.switchTo().window(oldWindow);

//      6. Wait for 2 new tabs to open
        WebElement delayWindow = driver.findElement(By.id("j_idt88:j_idt95"));
        delayWindow.click();

        Set<String> newWindows2 = driver.getWindowHandles();
        for(String newWindow: newWindows2){
            if(!driver.equals(oldWindow)){
                driver.switchTo().window(newWindow);
                driver.close();
            }
        }
        driver.quit();
    }
}
