package com.learnJava.Seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlertBox {

    /*Goal of Scripting: Interacting with AlertBox
     * 1. Open Google Browser
     * 2. Navigate to TestLeaf site
     * 3. Displays a normal Alert Box, Only Ok button will be there.
     * 4. Displays a Confirm Alert Box, it had Ok or Cancel button
     * 5. Displays a prompt box, Text box with same comments
     * 6. Check whether the line breaks exist in the alert box */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml");

//      3. Displays a normal Alert Box, Only Ok button will be there.
        WebElement alertBox1 = driver.findElement(By.id("j_idt88:j_idt91"));
        alertBox1.click();
        Thread.sleep(5000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

//     4. Displays a Confirm Alert Box, it had Ok or Cancel button
        WebElement alertBox2 = driver.findElement(By.id("j_idt88:j_idt93"));
        alertBox2.click();
        Thread.sleep(5000);
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();

//  5. Displays a prompt box, Text box with same comments
        WebElement promptBoxEx = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
        promptBoxEx.click();
        Thread.sleep(5000);
        Alert alertBox3 = driver.switchTo().alert();
        alertBox3.sendKeys("MyLife,MyRules!!!");
        alertBox3.accept();
        driver.switchTo().defaultContent();
        WebElement confirmMsg = driver.findElement(By.xpath("//*[@id=\"confirm_result\"]"));
        String finalMsg = confirmMsg.getText();
        System.out.println("Confirmation Message: "+finalMsg);

//  6. Check whether the line breaks exist in the alert box
        WebElement alertBox4 = driver.findElement(By.id("j_idt88:j_idt91"));
        alertBox4.click();
        Thread.sleep(5000);
        Alert alert4 = driver.switchTo().alert();
        String alertMsg = alert4.getText();
        alert4.accept();
        System.out.println("Alert Message: "+alertMsg);
        if(alertMsg.contains("\n")){
            System.out.println("Line break exists in the alert message.");
        } else {
            System.out.println("No line break found in the alert message.");
        }
    }
}
