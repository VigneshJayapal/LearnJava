✅ What Is a Data Driven Framework?

A Data Driven Framework is an automation framework where:
    Test logic is separated from test data.
    Test data is stored externally (Excel, CSV, JSON, etc.)
    Same test runs multiple times with different data

Example:
Instead of hardcoding:
login("student", "Password123");

We read:
Username    Password
student     Password123
admin       admin123
user1       pass1

from Excel and execute test multiple times.

🎯 Core Components of Data Driven Framework

Test Scripts:
    Page Object Classes
    Test Data (Excel/CSV)
    Utility Classes (Excel reader)
    Base Class (Driver setup)
    TestNG XML
    Reports & Logs

📂 Recommended Folder Structure

ProjectName
│
├── src/test/java
│   │
│   ├── base
│   │     └── BaseTest.java
│   │
│   ├── pages
│   │     └── LoginPage.java
│   │
│   ├── tests
│   │     └── LoginTest.java
│   │
│   ├── utilities
│   │     └── ExcelUtils.java
│
├── src/test/resources
│   └── testdata
│         └── LoginData.xlsx
│
├── testng.xml
└── pom.xml

🔹 Explanation of Each Layer
1️⃣ Base Class

Responsible for:
    Initializing WebDriver
    Opening browser
    Closing browser
    Common setup/teardown

2️⃣ Page Layer (POM Without PageFactory)
Example: LoginPage.java

3️⃣ Test Layer
Uses @DataProvider from TestNG.

4️⃣ Data Provider Layer
Reads data from Excel using:
    Apache POI

5️⃣ Excel Utility Class
Handles:
    Reading Excel file
    Converting data into Object[][]

🔥 Data Flow in Framework

Excel File
   ↓
ExcelUtils
   ↓
@DataProvider
   ↓
Test Class
   ↓
Page Class
   ↓
Browser Execution

🎯 Real-Time Enhancements

A professional Data Driven framework also includes:
    Logging (Log4j)
    Reporting (Extent Reports)
    Screenshot utility
    Config file (browser, URL)
    Reusable utilities
    CI/CD support

🆚 Hardcoded vs Data Driven

Hardcoded	        Data Driven
One test	        Multiple data sets
Not scalable	    Highly scalable
Data inside code	Data external
Not reusable	    Reusable

💡 Interview Answer (Short Version)
A Data Driven Framework is an automation framework where test scripts are separated from test data.
    Test data is stored externally (Excel/CSV/Database), and TestNG DataProvider is used to execute
        the same test multiple times with different data inputs.

🚀 Advanced Structure (Industry Level)
framework
│
├── base
├── pages
├── tests
├── utilities
├── listeners
├── reports
├── config
├── testdata
└── testng.xml

