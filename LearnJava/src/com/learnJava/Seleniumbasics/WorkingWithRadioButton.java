package com.learnJava.Seleniumbasics;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WorkingWithRadioButton {

//    https://www.leafground.com/radio.xhtml
    /* Goal of Scripting: Interacting with AlertBox
     * 1. Open Google Browser
     * 2. Navigate to TestLeaf site
     * 3. Finding the default Radio button selection in DOM
     * 4. Changing the Radio Button selection
     * 5. validate the Radio Button is enabled or not */

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.leafground.com/radio.xhtml");

//      3. Finding the default Radio button selection in DOM
        WebElement radioButton1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/div/div[2]"));
        WebElement radioButtonLabel1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]"));
        String radioValue1 = radioButton1.getAttribute("class");
        assert radioValue1 != null;
        String endResult1 = findTheDefaultSelection(radioValue1);
        String value1 = radioButtonLabel1.getText();
        System.out.println(value1+" is "+endResult1);

        WebElement radioButton2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]"));
        WebElement radioButtonLabel2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/label"));
        String radioValue2 = radioButton2.getAttribute("class");
        assert radioValue2 != null;
        String endResult2 = findTheDefaultSelection(radioValue2);
        String value2 = radioButtonLabel2.getText();
        System.out.println(value2+" is "+endResult2);

//    4. Changing the Radio Button selection
        radioButton1.click();

//    5. validate the Radio Button is enabled or not
        if(radioButton2.isEnabled()){
            System.out.println("RadioButton is enabled!");
        } else {
            System.out.println("Radio Button is Disabled!");
        }


        /* Below script need to revisit later */
//        List<WebElement> listOfRadioButton = driver.findElements(
//                By.xpath("//div[contains(@class,'ui-radiobutton-box')]"));
//        String defaultRadioButton = null;
//        for(WebElement webElement:listOfRadioButton){
//            if(webElement.getAttribute("class").contains("ui-icon-bullet")){
//                 defaultRadioButton = webElement.getText();
//            }
//        }
//        System.out.println("Radio Button name: "+defaultRadioButton);
    }

    public static String findTheDefaultSelection(String radioValue){
        if(radioValue.contains("active")){
            return "Default Selection";
        } else {
            return "No Default Selection";
        }
    }

}
