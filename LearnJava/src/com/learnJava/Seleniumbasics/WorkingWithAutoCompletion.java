package com.learnJava.Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WorkingWithAutoCompletion {

    /* Goal of scripting: Interacting with Auto Completion component in UI
            1. Open Google browser with Google Chrome
            2. Navigate to the Auto-complete practice homepage
            3. Interact with Auto-Completion component
            4. Close the browser
    * */
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/auto-complete.php");

//      3. Interact with Auto-Completion component
        WebElement sendValues = driver.findElement(By.id("tags"));
        sendValues.sendKeys("a");
        Thread.sleep(4000); //TODO: Best practice to implement Implicit/Explicit wait
        List<WebElement> autoCompletionList = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
        int listSize = autoCompletionList.size();
        System.out.println(listSize);

        for(WebElement webElement:autoCompletionList){
            if(webElement.getText().equals("Java")){
                System.out.println("Selecting: "+webElement.getText());
                webElement.click();
                break;
            }
        }
//     4. Close the browser
//        driver.quit();
    }
}
