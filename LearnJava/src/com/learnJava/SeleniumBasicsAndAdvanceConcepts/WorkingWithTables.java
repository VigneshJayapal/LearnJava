package com.learnJava.SeleniumBasicsAndAdvanceConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithTables {

    /* Goal of Scripting: Interacting with Tables
    * 1. Get the Count of number of Columns
    * 2. Get the Count of number of Rows
    * 3. Get the Count of number of cells in the table
    * 4. Get the Level of the Course name - "Selenium with Java"
    * 5. Click the Link of corresponding row which is having the least Enrollments number */

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-table/");

//      1. Get the Count of number of Columns
        List<WebElement> columnCount = driver.findElements(By.tagName("th"));
        int totalColumnCount = columnCount.size();
        System.out.println("Total Column Count: "+totalColumnCount);

//      2. Get the Count of number of Rows
        List<WebElement> rowCount = driver.findElements(By.tagName("tr"));
        int totalRowCount = rowCount.size();
        System.out.println("Total Row Count is "+totalRowCount);

//      3. Get the Count of number of cells in the table
        List<WebElement> cellCount = driver.findElements(By.tagName("td"));
        int totalCellCount = cellCount.size();
        System.out.println("Total Cell Count in the table :"+totalCellCount);

//      4. Get the Level of the Course name - "Selenium with Java"
        String xpathValue = "Selenium with Java";
        WebElement element = driver.findElement(By.xpath("//td[normalize-space()='"+xpathValue+"']//following-sibling::td[2]"));
        String value = element.getText();
        System.out.println("Get the Level of the Course name - "+value);

//      5. Click the Link of corresponding row which is having the least Enrollments number
        List<WebElement> element1 = driver.findElements(By.xpath("//td[5]"));

        List<Integer> enrollmentsDataList = new ArrayList<Integer>();
        for(WebElement element2: element1){
            enrollmentsDataList.add(Integer.parseInt(element2.getText()));
        }

        System.out.println("Lowest enrollment value is : "+Collections.min(enrollmentsDataList));

        Integer leastValue = Collections.min(enrollmentsDataList);
        String xPathLeastValue = "//td[normalize-space()='"+leastValue+"']//following-sibling::td[1]";

        WebElement clickTheLink = driver.findElement(By.xpath(xPathLeastValue));
        clickTheLink.click();
    }
}


/* Below is the refined code from ChatGPT
*
* package com.learnJava.Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithTablesRefined {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {

            driver.get("https://practicetestautomation.com/practice-test-table/");

            // Table locator (scoped reference)
            WebElement table = driver.findElement(By.xpath("//table"));

            // ---------------------------------------------------
            // 1️⃣ Column count
            // ---------------------------------------------------
            int columnCount = table.findElements(By.xpath(".//th")).size();
            System.out.println("Total Columns: " + columnCount);

            // ---------------------------------------------------
            // 2️⃣ Row count (excluding header)
            // ---------------------------------------------------
            List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
            System.out.println("Total Rows: " + rows.size());

            // ---------------------------------------------------
            // 3️⃣ Cell count
            // ---------------------------------------------------
            int cellCount = table.findElements(By.xpath(".//td")).size();
            System.out.println("Total Cells: " + cellCount);

            // ---------------------------------------------------
            // 4️⃣ Get Level of "Selenium with Java"
            // ---------------------------------------------------
            String courseName = "Selenium with Java";

            String levelXpath =
                    ".//td[normalize-space()='" + courseName + "']/following-sibling::td[2]";

            String level =
                    table.findElement(By.xpath(levelXpath)).getText();

            System.out.println("Course Level: " + level);

            // ---------------------------------------------------
            // 5️⃣ Click link of row with least enrollment
            // ---------------------------------------------------
            List<Integer> enrollmentValues = new ArrayList<>();

            for (WebElement row : rows) {

                int enroll = Integer.parseInt(
                        row.findElement(By.xpath("./td[5]")).getText()
                );

                enrollmentValues.add(enroll);
            }

            int leastEnrollment = Collections.min(enrollmentValues);
            System.out.println("Least Enrollment: " + leastEnrollment);

            // Find row and click corresponding link
            for (WebElement row : rows) {

                int enroll = Integer.parseInt(
                        row.findElement(By.xpath("./td[5]")).getText()
                );

                if (enroll == leastEnrollment) {

                    row.findElement(By.xpath("./td[6]/a")).click();
                    break;
                }
            }

        } finally {
            driver.quit();
        }
    }
}
*/