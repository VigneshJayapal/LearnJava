package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DownloadingTheFile {

    /* Goal of Scripting: Download a file and verify in the file explorer
    *   1. Open Google browser with Google Chrome
        2. Navigate to the Download file practice homepage
        3. Download a file and verify in the file explorer */

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");

//      3. Download a file and verify in the file explorer
        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();

        File fileLocation = new File("C:\\Users\\Admin\\Downloads");
        File[] totalFiles = fileLocation.listFiles();

        assert totalFiles != null;
        for(File findFile: totalFiles){
            if(findFile.getName().equals("sampleFile.jpeg")){
                System.out.println("File is downloaded!");
                break;
            } else {
                System.out.println("File does not exist in Downloads!");
            }
        }
    }
}
