package com.learnJava.Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorkingWithHyperLinks {

    /* Goal of Scripting: Interacting with Hyper Links
    *       1. Open Google browser with Google Chrome
            2. Navigate to the HyperLink file practice homepage
            3. Click the HyperLink and navigate to other page
            4. Difference between driver.get() and driver.navigate().to()
            5. Find my destination
            6. Verify the HyperLink is broken
            7. How many links in this page?
            8. Remove Duplicate Link
            9. Occurrence of StaleElementException  */

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//      Difference between driver.get() and driver.navigate().to()
        /*  Both driver.get() and driver.navigate().to() are used to open a URL in Selenium, and functionally they achieve the same result — loading a webpage. The difference lies in intent and usage.
            driver.get() is mainly used for directly opening a webpage and waits until the page is fully loaded. It’s simple and commonly used when starting a test.
            driver.navigate().to() is part of Selenium’s navigation interface. It behaves like browser navigation and is typically used when you’re also performing actions like back, forward, or refresh during a test flow. */

//        driver.get("https://www.leafground.com/link.xhtml");
        driver.navigate().to("https://www.leafground.com/link.xhtml");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("j_idt13")));

//      3. Click the HyperLink and navigate to other page
        WebElement firstLink = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/a"));
        firstLink.click();

        driver.navigate().back();

//      5. Find my destination
        WebElement secondLink = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[2]/div/div/a"));
        String linkDestiny = secondLink.getAttribute("href");
        System.out.println("Here is the URL from the Link: "+linkDestiny);

//      6. Verify the HyperLink is broken
        WebElement thirdLink = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[3]/div/div/a"));
        thirdLink.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/h2")));

        WebElement brokenPage = driver.findElement(By.xpath("/html/body/h2"));
        if(brokenPage.getText().contains("404")){
            System.out.println("It's a broken link!!!");
        } else {
            System.out.println("It's a Valid link!!!");
        }

        driver.navigate().back();

//      7. How many links in this page?
        List<WebElement> listOfLink = driver.findElements(By.tagName("a"));
        int countOfLink = listOfLink.size();
        System.out.println("Total Count of Link: "+countOfLink);

//      8. Remove Duplicate Link
        Set<String> uniqueLink = new HashSet<>();
        Set<String> duplicateLink = new HashSet<>();
        for(WebElement link: listOfLink){
            String url = link.getAttribute("href");
            if(url!=null && !uniqueLink.add(url)){
                duplicateLink.add(url);
            }
            System.out.println("Duplicate Links Found!!!");
            duplicateLink.forEach(System.out::println);
        }

//      9. Occurrence of StaleElementException
/* ✅ What is StaleElementReferenceException in Selenium?
    A StaleElementReferenceException occurs when Selenium tries to interact with a web element that is no longer attached to the DOM.
    In simple words:
        👉 Selenium found the element earlier, but the page changed — so that reference is now invalid. */
        firstLink.click();
    }
}
