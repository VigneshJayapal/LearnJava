package com.learnJava.DataDrivenFramework.UsingJavaFunctions;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingJavaFunctions {

    public static List<Object> userNameValueList = new ArrayList<Object>();
    public static List<Object> passwordValueList = new ArrayList<Object>();
    public static WebDriver driver;

    public void readExcelData() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("A:\\Github Code\\LearnJava\\LearnJava\\src\\com\\learnJava\\DataDrivenFramework\\UsingJavaFunctions\\TestData.xlsx");
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
//  or we can use sheet name to get the sheet details as below:
//        Sheet sheet = workbook.getSheet("Sheet1");
        Iterator<Row> rowIterator = sheet.iterator();

        while (rowIterator.hasNext()){
            Row rowValue = rowIterator.next();
           Iterator<Cell> cellIterator = rowValue.iterator();
           /* Below i=2 -> This initialization helps us to differentiate the even numbers value with
           *    Username and Odd numbers value with password segregation */
           int i=2;
           while (cellIterator.hasNext()){
               if(i%2==0) {
                   Cell cell = cellIterator.next();
                   String cellValue = UsingJavaFunctions.getCellValue(cell);
                   userNameValueList.add(cellValue);
               } else {
                   Cell cell = cellIterator.next();
                   String cellValue = UsingJavaFunctions.getCellValue(cell);
                   passwordValueList.add(cellValue);
               }
               i++;
           }
        }
    }

    private static String getCellValue(Cell cell) {
        if(cell==null){
            Assert.fail("Cell Value is empty!");
        }

        switch(cell.getCellType()){
            case NUMERIC:
                if(DateUtil.isCellDateFormatted(cell)){
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf(cell.getNumericCellValue());
                }
            case STRING:
                return cell.getStringCellValue();
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case BLANK:
                return "";
            case FORMULA:
                return String.valueOf(cell.getCellFormula());
            default:
                return null;
        }
    }

    public void executeTheTest(){
        for(int i=0; i<userNameValueList.size();i++){
            login(userNameValueList.get(i), passwordValueList.get(i));
        }
    }

    public void login(Object userName, Object password){
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("orangehrm-login-logo-mobile")));

        WebElement userNameEditBox = driver.findElement(By.name("username"));
        userNameEditBox.sendKeys(userName.toString());

        WebElement passwordEditBox = driver.findElement(By.name("password"));
        passwordEditBox.sendKeys(password.toString());

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        submitButton.click();

        driver.quit();
    }

    public static void main(String[]args) throws Throwable {
        UsingJavaFunctions usingJavaFunctions = new UsingJavaFunctions();
        usingJavaFunctions.readExcelData();
        System.out.println("UserName List Value: "+ userNameValueList.toString());
        System.out.println("Password List Value: "+ passwordValueList.toString());
        usingJavaFunctions.executeTheTest();
    }
}
