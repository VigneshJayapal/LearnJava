package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithSortables {

    /* Goal of Scripting: Interacting with sortable webelement
    *       1. Open Google Browser
     *      2. Navigate to Selenium Practise site for Sortable interaction
     *      3. Sort the row with descending order using Actions class */

    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/sortable.php");

        List<WebElement> totalRow = driver.findElements(By.xpath("//td[1]"));
        int totalRowCount = totalRow.size();
        System.out.println("Total Row Count is: "+totalRowCount);

        List<Integer> rowNumberList = new ArrayList<Integer>();
        int rowValue;
        for(WebElement element: totalRow){
            rowValue = Integer.parseInt(element.getText());
            rowNumberList.add(rowValue);
        }
        System.out.println("List of rows: "+rowNumberList);

        Thread.sleep(5000);
        Collections.reverse(rowNumberList);
        System.out.println("Descending Ordered list: "+rowNumberList);
        int value1 = rowNumberList.get(0);
        int value2 = rowNumberList.get(1);
        int value3 = rowNumberList.get(2);

        String xpath1 = "//td[contains(text(),'"+value1+"')]";
        WebElement element1 = driver.findElement(By.xpath(xpath1));
        String xpath2 = "//td[contains(text(),'"+value2+"')]";
        WebElement element2 = driver.findElement(By.xpath(xpath2));
        String xpath3 = "//td[contains(text(),'"+value3+"')]";
        WebElement element3 = driver.findElement(By.xpath(xpath3));

        Actions actions = new Actions(driver);
        actions.clickAndHold(element3).moveToElement(element1).release().build().perform();
        actions.clickAndHold(element2).moveToElement(element2).release().build().perform();
        actions.clickAndHold(element1).moveToElement(element3).release().build().perform();
    }
}
