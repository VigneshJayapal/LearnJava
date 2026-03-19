📘 Page Object Model (POM) – Detailed Explanation

Since you're working with Selenium and TestNG, POM is one of the most important design patterns
    you must master for interviews and real-time projects.

🔹 1️⃣ What is Page Object Model (POM)?

Page Object Model (POM) is a design pattern in Selenium automation where:
        Each web page is represented as a separate Java class
        Web elements are stored as locators inside that class
        User actions are written as reusable methods
        Test classes only call page methods (no direct locators)

👉 In simple words:
One class = One page

🔹 2️⃣ Why Do We Need POM?
❌ Without POM (Bad Practice)

    Problems:
        Repeated code
        Hard to maintain
        If locator changes → update everywhere
        Poor readability

✅ With POM (Professional Approach)
    Clean. Reusable. Maintainable.

🔹 3️⃣ Core Principles of POM
        1.Separate locators from test logic
        2.Encapsulate page actions
        3.Improve reusability
        4.Reduce duplication
        5.Improve maintainability

🔹 4️⃣ Basic Structure of POM
Project
│
├── base
│     └── BaseTest.java
│
├── pages
│     ├── LoginPage.java
│     ├── HomePage.java
│
├── tests
│     └── LoginTest.java
│
└── testng.xml

8️⃣ POM Variations

There are 2 major types:
POM using By locators (recommended in Selenium 4)
POM using PageFactory (annotations)
Most modern frameworks prefer plain POM without heavy PageFactory usage.

🔹 9️⃣ Advantages of POM

✅ Clean architecture
✅ Easy maintenance
✅ Scalable framework
✅ Code reusability
✅ Better readability
✅ Industry standard

🔹 🔟 Disadvantages of POM

❌ More classes to manage
❌ Initial setup takes time
❌ Requires proper design

🔹 Real-Time Industry Structure
framework
│
├── base
├── pages
├── tests
├── utilities
├── listeners
├── reports
├── config
└── testdata

🔥 Interview Answer (Strong Version)

Page Object Model is a design pattern in Selenium where each web page is represented as a separate class containing locators and page actions.
    It separates test logic from page interaction logic, improving maintainability, reusability, and scalability of automation frameworks.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

📘 Page Factory in Selenium (Detailed Explanation with Examples)
Since you're working with Selenium and TestNG, understanding Page Factory is very important for building a proper automation framework.

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

    🔹 4️⃣ Step-by-Step Implementation
    ✅ Step 1: Create LoginPage Class

    🔹 5️⃣ Step 2: Create Test Class (TestNG)

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

🔥 Best Practice Structure (Automation Framework)
src
 ├── pages
 │     └── LoginPage.java
 ├── tests
 │     └── LoginTest.java
 ├── base
 │     └── BaseTest.java

 🆚 Page Object Model vs Page Factory
 Feature	        POM	    Page Factory
 Uses classes	    ✅	        ✅
 Uses @FindBy	    ❌	        ✅
 Uses initElements	❌	        ✅
 Lazy loading	    ❌	        ✅

 Interview Question Answer (Short Version)
 Page Factory is an implementation of Page Object Model that uses @FindBy annotations and PageFactory.initElements()
    to initialize web elements and improve code maintainability.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

✅ What Is POM Without PageFactory?

Instead of:
@FindBy
PageFactory.initElements()

We use:
    By locators
    driver.findElement()
    Clean page methods

This gives:
    Better control
    Better debugging
    More flexibility for dynamic elements

📌 Example Scenario (Login Page)

Elements:
Username → id = username
Password → id = password
Login button → id = login
Success message → tag = strong

✅ Step 1: Create LoginPage Class (Without PageFactory)

✅ Step 2: Test Class Using TestNG

🔥 Why This Approach Is Better in Selenium 4

Selenium 4 team recommends:
✔ Using By locators
✔ Avoid heavy use of PageFactory
✔ Use explicit waits
✔ Keep page methods clean

📂 Recommended Framework Structure
src
 ├── base
 │     └── BaseTest.java
 ├── pages
 │     └── LoginPage.java
 ├── tests
 │     └── LoginTest.java

 🆚 PageFactory vs This Approach
 Feature	                        PageFactory	    POM (By Locators)
 Uses annotations	                    ✅	                ❌
 Easy debugging	                        ❌	                ✅
 Handles dynamic elements well	        ❌	                ✅
 Recommended in Selenium 4	            ⚠️ Less	            ✅ Yes

 🎯 Interview Answer (Short & Smart)

 Page Object Model without PageFactory uses By locators and driver methods directly instead of @FindBy annotations.
    It gives better control, easier debugging, and is more aligned with Selenium 4 best practices.


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
