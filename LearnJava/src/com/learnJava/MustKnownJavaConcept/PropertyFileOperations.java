package com.learnJava.MustKnownJavaConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileOperations {
    public WebDriver driver;

    @Test
    public void UsingPropertyFileAsInput() throws IOException {
        String path = System.getProperty("user.dir")+"/config.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        String BrowserToRun = properties.getProperty("Browser");
        String BrowserLocation = properties.getProperty("BrowserLocation");
        String DriverSelection = properties.getProperty("DriverSelection");
        System.setProperty(DriverSelection,BrowserLocation);
        switch (BrowserToRun.toUpperCase()){
            case "CHROME":
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://google.co.in");
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get("https://google.co.in");
                break;
            default:
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://google.co.in");
                break;
        }
        driver.quit();
    }
}
