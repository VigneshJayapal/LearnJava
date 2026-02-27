package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithToolTips {

    /*
    * Goal of Scripting: Working with Tooltips
    * 1. Open Google Chrome
    * 2. Navigate to the globalsqa site for the tool tip interaction
    * 3. Get the Tooltip context using inbuild functions
    * 4. Get the Tooltip context using actions class */

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");

//      3. Get the Tooltip context using inbuild functions
        WebElement toolTipElement = driver.findElement(By.id("firstname"));
        String toolTipFirstName = toolTipElement.getAttribute("title");
        System.out.println("Tool Tip context: "+toolTipFirstName);

//      4. Get the Tooltip context using actions class
        WebElement toolTipLastElement = driver.findElement(By.id("lastname"));
        Actions actions = new Actions(driver);
        actions.moveToElement(toolTipLastElement).click();
        String toolTipLastName = toolTipLastElement.getAttribute("title");
        System.out.println("Tool tip context: "+toolTipLastName);

        driver.quit();

    }
}
