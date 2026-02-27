package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadTheFiles {

    /* Goal of Scripting: Uploading a file in website
    *       1. Open Google browser with Google Chrome
            2. Navigate to the Upload file practice homepage
            3. Uploading a file in website using Toolkit, StringSelection and Robot Class */

    public static void main(String[]args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
        Thread.sleep(4000); //TODO: Best practice to implement Implicit/Explicit wait

        WebElement uploadButton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div/label"));
        uploadButton.click();
        Thread.sleep(4000); //TODO: Best practice to implement Implicit/Explicit wait
//      Uploading a file in website using Toolkit, StringSelection and Robot Class

        String filePath = "C:\\Users\\Admin\\Downloads\\sampleFile.jpeg";
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(4000); //TODO: Best practice to implement Implicit/Explicit wait
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        driver.quit();
    }
}
