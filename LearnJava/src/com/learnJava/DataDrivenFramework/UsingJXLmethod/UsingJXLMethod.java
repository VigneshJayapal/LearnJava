package com.learnJava.DataDrivenFramework.UsingJXLmethod;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class UsingJXLMethod {

    /* Note: Using this JXL JAR method we need to use excel version as "97-2003" with extension as .xls
    *           This won't work for .xlsx extension file  */
    WebDriver driver;
    public Object[][] readExcelData() throws IOException, BiffException {
        FileInputStream inputStream = new FileInputStream("A:\\Github Code\\LearnJava\\LearnJava\\src\\com\\learnJava\\DataDrivenFramework\\UsingJXLmethod\\TestData.xls");
        Workbook workbook = Workbook.getWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(0);
//  or we can use sheet name to get the sheet details as below:
//  Sheet sheet = workbook.getSheet("Sheet1");
        int rowsCount = sheet.getRows();
        int columnCount = sheet.getColumns();
        Object [][] testData = new Object[rowsCount-1][columnCount];

        for(int i=1;i<rowsCount;i++){
            for(int j=0;j<columnCount;j++){
                testData[i-1][j] = sheet.getCell(j,i).getContents();
            }
        }
        return testData;
    }

    @DataProvider(name = "LoginCredentials")
    public Object[][] dataProviderValueSet() throws BiffException, IOException {
        return readExcelData();
    }

    @BeforeTest
    public void loginToUrl(){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterTest
    public void closeTheBrowser(){
        driver.quit();
    }

    @Test(dataProvider = "LoginCredentials")
    public void PassingPreDefinedUserNameAndPassword(String uName, String pWord){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("orangehrm-login-logo-mobile")));

        WebElement userNameEditBox = driver.findElement(By.name("username"));
        userNameEditBox.sendKeys(uName);

        WebElement passwordEditBox = driver.findElement(By.name("password"));
        passwordEditBox.sendKeys(pWord);

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        submitButton.click();

        driver.navigate().back();
    }
}
