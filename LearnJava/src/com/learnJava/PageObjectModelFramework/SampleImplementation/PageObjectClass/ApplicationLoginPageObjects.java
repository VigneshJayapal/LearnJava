package com.learnJava.PageObjectModelFramework.SampleImplementation.PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
*  🔹 1️⃣ What is Page Factory?
            Page Factory is a design pattern in Selenium that:
                Implements the Page Object Model (POM)
                Uses annotations like @FindBy
                Initializes elements using PageFactory.initElements()
        It helps:
                Separate test logic from page elements
                Improve code readability
                Improve maintainability
                Reduce code duplication

   🔹 2️⃣ Why Do We Need It?
   Without Page Factory:
   Problems:
        Repeated findElement
        Hard to maintain if locator changes
        Poor structure

   🔹 3️⃣ With Page Factory (Clean & Professional)
    We create a separate class for each page.

    🔹 6️⃣ How PageFactory Works Internally
    When this line runs:
        PageFactory.initElements(driver, this);
    It:
        Scans all @FindBy annotations
        Creates proxy objects
        Locates element only when used (lazy loading)

    🔹 7️⃣ @FindBy Variations
        @FindBy(id = "username")
        @FindBy(name = "username")
        @FindBy(className = "input")
        @FindBy(tagName = "input")
        @FindBy(linkText = "Login")
        @FindBy(partialLinkText = "Log")
        @FindBy(css = "#username")
        @FindBy(xpath = "//input[@id='username']")

        🔹 8️⃣ Using Multiple Locators
           🔹 @FindAll → OR condition
                    It finds elements that match any one of the given locators.
                    Works like a logical OR.
                    Returns elements matching at least one locator.
        @FindAll({
            @FindBy(id="username"),
            @FindBy(name="username")
        })
        WebElement username;

        * OR

           🔹 @FindBys → AND condition (chain of locators)
                    It applies locators sequentially (nested search).
                    Works like a logical AND.
                    The second locator searches inside the result of the first locator.
        @FindBys({
        @FindBy(tagName="form"),
        @FindBy(id="username")
        })
        WebElement username;

        * 🧠 Simple Way to Remember
                FindAll → Find any
                FindBys → Find step-by-step

🔹 9️⃣ Advantages of Page Factory
✅ Clean structure
✅ Reusable code
✅ Easy maintenance
✅ Better readability
✅ Supports lazy initialization

🔹 🔟 Disadvantages
❌ Harder debugging sometimes
❌ Not ideal for highly dynamic elements
❌ Selenium 4 recommends standard Page Object without heavy PageFactory use
Modern frameworks often use plain POM without PageFactory.

 */

public class ApplicationLoginPageObjects {

    public static WebElement userNameTextBox(WebDriver driver){
        return driver.findElement(By.id("username"));
    }

    public static WebElement passwordTextBox(WebDriver driver){
        return driver.findElement(By.id("password"));
    }

    public static WebElement submitButton(WebDriver driver){
        return driver.findElement(By.id("submit"));
    }

    public static WebElement getSuccessText(WebDriver driver){
        return driver.findElement(By.tagName("strong"));
    }
}
