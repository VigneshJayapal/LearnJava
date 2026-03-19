🚀 Hybrid Framework (POM + Data-Driven) in Selenium

A Hybrid Framework combines:
    Page Object Model (POM) → For better structure & maintainability
    Data-Driven Testing → For running the same test with multiple data sets
    It is widely used with Selenium and TestNG in real-time automation projects.

🎯 Why Hybrid Framework?

Instead of:
    Hardcoding test data
    Writing duplicate test cases

We:
    Keep UI logic in Page classes (POM)
    Keep test data in Excel / CSV / JSON
    Use TestNG @DataProvider to inject data
👉 Result: Clean, scalable, maintainable automation framework.

🏗 Framework Structure
Project
│
├── base
│     └── BaseTest.java
│
├── pages
│     ├── LoginPage.java
│     └── HomePage.java
│
├── utils
│     └── ExcelUtils.java
│
├── testdata
│     └── LoginData.xlsx
│
└── tests
      └── LoginTest.java

🔄 Execution Flow

    TestNG runs test
    DataProvider sends first row → Test runs
    Sends second row → Test runs
    Sends third row → Test runs
👉 Same test executed multiple times with different data.

🧠 What Makes It “Hybrid”?

Because it combines:

POM	                    Data Driven
Page classes	        External test data
Reusable methods	    Multiple test inputs
Clean structure	        Scalable execution

🏢 Real-Time Enhancements in Companies

Enterprise Hybrid Framework usually includes:
    Maven / Gradle build
    Logging (Log4j)
    Reporting (Extent Reports)
    Screenshot on failure
    Retry mechanism
    Config file (environment URL)
    Parallel execution
    CI/CD integration (Jenkins)

🆚 Pure POM vs Hybrid

Pure POM	            Hybrid
Test data hardcoded	    Test data external
Limited scalability	    Highly scalable
Less flexible	        More flexible

🎯 Interview Explanation (Short Version)

“Hybrid framework combines Page Object Model for UI structure and Data-Driven approach for handling test data.
    Page classes contain elements and actions, test classes use DataProvider to fetch data from
        external sources like Excel, making the framework scalable and maintainable.”

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~