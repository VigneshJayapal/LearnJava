package com.learnJava.Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCheckBoxes {

    /* Goal of Scripting: Working with CheckBoxes
     * 1. Open Google browser
     * 2. Navigate to the Test site with Checkbox interaction
     * 3. Check the Checkbox
     * 4. Verify the Checkbox is checked or not
     * 5. Select the unchecked checkbox and deselect the checked checkbox
     * 6. Verify the Checkbox is enabled or not
    * */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/checkbox.xhtml");

//      3. Check the Checkbox
        WebElement firstCheckBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
        firstCheckBox.click();

//      4. Verify the Checkbox is checked or not
        WebElement secondCheckBox = driver.findElement
                (By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]"));
        secondCheckBox.click();
        boolean resultCheckBox = secondCheckBox.isSelected();
        if(resultCheckBox){
            System.out.println("Checkbox is checked!");
        } else {
            System.out.println("Checkbox is unchecked!");
        }

//      5. Select the unchecked checkbox and deselect the checked checkbox
        WebElement thirdCheckBox = driver.findElement
                (By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
        boolean resultCheckBox1 = thirdCheckBox.isSelected();
        if(resultCheckBox1){
            thirdCheckBox.click();
            System.out.println("CheckBox is Checked!");
        } else {
            thirdCheckBox.click();
            System.out.println("CheckBox is Unchecked!");
        }

//      6. Verify the Checkbox is enabled or not
        WebElement fourthCheckBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]/div[2]"));
        boolean resultCheckBox2 = fourthCheckBox.isSelected();
        if(resultCheckBox2){
            System.out.println("Checkbox is enabled!");
        } else{
            System.out.println("Checkbox is disabled!");
        }
    }
}
