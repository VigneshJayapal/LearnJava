package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDraggableElement {

    /*Goal of Scripting: Working with Draggable Element
    1. Open Google Chrome
    2. Navigate to TestLeaf site
    3. Drag and Drop using X&Y coordinates
    4. Drag and Drop using Mouse functions
    5. Drag and Drop using inbuild functions */

    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/drag.xhtml");

//      3. Drag and Drop using X&Y coordinates
        WebElement fromElement = driver.findElement(By.id("form:conpnl"));
        Point point = driver.findElement(By.id("form:conpnl")).getLocation();
        int xValue = point.getX();
        int xValueFinal = xValue+10;
        int yValue = point.getY();
        int yValueFinal = yValue+10;

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(fromElement, xValueFinal, yValueFinal).build().perform();

//      4. Drag and Drop using Mouse functions
        WebElement fromElement1 = driver.findElement(By.id("form:drag"));
        WebElement toElement1 = driver.findElement(By.id("form:drop"));
        actions.clickAndHold(fromElement1).moveToElement(toElement1).release().build().perform();

//      5. Drag and Drop using inbuild functions
        actions.dragAndDrop(toElement1, fromElement1).build().perform();
//        driver.quit();
    }
}
