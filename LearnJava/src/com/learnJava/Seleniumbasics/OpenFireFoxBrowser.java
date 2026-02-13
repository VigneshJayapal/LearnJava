package com.learnJava.Seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowser {

    public static void main(String[] args){
        /*Goal of scripting
         *   1. Open Firefox browser
         *   2. Navigate to the Google homepage */

        System.setProperty("weddriver.gecko.driver", "A:\\geckodriver-v0.36.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in");
    }
}
