package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class WorkingWithImages {

    /* Goal of Scripting: Interacting with images and verify the image is broken or not
            1. Open Google browser with Google Chrome
            2. Navigate to the image practice homepage
            3. Interacting with images and verify the image is broken or not  */

    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/broken-links.php");

        /*🧠 Why naturalWidth works
                naturalWidth = 0 → image failed to load (404 / server error)
                naturalWidth > 0 → image rendered successfully
                This is faster and cleaner than checking HTTP status codes for UI tests.*/

        Thread.sleep(4000); //TODO: Best practice to implement Implicit/Explicit wait
//      3. Interacting with images and verify the image is broken or not
        WebElement image1 =  driver.findElement(By.className("logo-desktop"));
        if(Objects.equals(image1.getAttribute("naturalWidth"), "0")) {
            System.out.println("Image is broken!");
        } else {
            System.out.println("Its a valid image!");
        }

        WebElement brokenImage = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/p[1]/img"));
        if(Objects.equals(brokenImage.getAttribute("naturalWidth"), "0")){
            System.out.println("Image is broken!");
        } else {
            System.out.println("Its a valid image!");
        }
    }


}

/* ✅ Improved & Clean Version (Best Practice)
   🔹 Using Explicit Wait + Looping through images */
//package com.learnJava.Seleniumbasics;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.List;
//
//public class WorkingWithImages {
//
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver",
//                "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://www.tutorialspoint.com/selenium/practice/broken-links.php");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("img")));
//
//        List<WebElement> images = driver.findElements(By.tagName("img"));
//
//        for (WebElement image : images) {
//            String naturalWidth = image.getAttribute("naturalWidth");
//
//            if ("0".equals(naturalWidth)) {
//                System.out.println("❌ Broken image found → " + image.getAttribute("src"));
//            } else {
//                System.out.println("✅ Valid image → " + image.getAttribute("src"));
//            }
//        }
//
//        driver.quit();
//    }
//}
