🔹 Selenium Exception Hierarchy (Java)

All Selenium exceptions mainly extend from:

java.lang.RuntimeException
   └── org.openqa.selenium.WebDriverException

Most Selenium exceptions are unchecked exceptions (Runtime exceptions).

🔹 Main Parent Class
WebDriverException

Base class for most Selenium exceptions.

All other specific exceptions inherit from this.

🔹 Important Child Exceptions (From Your Screenshot)
1️⃣ InvalidArgumentException

Thrown when invalid arguments are passed to WebDriver methods.

2️⃣ InvalidCookieDomainException

Occurs when adding a cookie under a different domain.

3️⃣ InvalidElementStateException

Thrown when element state doesn't allow interaction.

Child exceptions:

ElementNotInteractableException

ElementClickInterceptedException

ElementNotVisibleException (older Selenium)

ElementNotSelectableException

4️⃣ JavascriptException

Thrown when JavaScript execution fails.

5️⃣ NoSuchSessionException

Occurs when WebDriver session does not exist or already quit.

6️⃣ NotFoundException

Parent for element/location-related exceptions.

Child exceptions:

NoAlertPresentException

NoSuchContextException

NoSuchCookieException

NoSuchElementException

InvalidSelectorException

NoSuchFrameException

NoSuchWindowException

7️⃣ ScriptTimeoutException

Thrown when async JavaScript execution exceeds time limit.

8️⃣ SessionNotCreatedException

Occurs when WebDriver fails to create a new browser session.

Common reason:

Driver & browser version mismatch

9️⃣ StaleElementReferenceException

Element is no longer attached to the DOM.

🔟 TimeoutException

Thrown when wait condition fails within given time.

1️⃣1️⃣ UnableToSetCookieException

Thrown when setting cookie fails.

1️⃣2️⃣ UnhandledAlertException

Occurs when an alert blocks WebDriver execution.

1️⃣3️⃣ UnsupportedCommandException

Thrown when a driver does not support a specific command.

🔹 Important Interview Points

✅ All Selenium exceptions are unchecked (RuntimeException)
✅ WebDriverException is the parent class
✅ NotFoundException is parent of element-related exceptions
✅ InvalidElementStateException handles interaction-related issues
✅ SessionNotCreatedException → mostly driver mismatch issue

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Complete hierarchy diagram (easy to memorize)

Here is the complete Selenium Exception Hierarchy (Java) — simplified & easy to memorize.

This is based on the official org.openqa.selenium package structure.

🌳 Selenium Exception Hierarchy Diagram
java.lang.Object
 └── java.lang.Throwable
      └── java.lang.Exception
           └── java.lang.RuntimeException
                └── org.openqa.selenium.WebDriverException
🔷 Level 1: WebDriverException (Main Parent)
WebDriverException
│
├── ImeActivationFailedException
├── ImeNotAvailableException
├── InvalidArgumentException
├── InvalidCookieDomainException
├── InvalidElementStateException
│    ├── ElementNotInteractableException
│    │     └── ElementClickInterceptedException
│    ├── ElementNotSelectableException
│    └── ElementNotVisibleException (Deprecated)
│
├── JavascriptException
├── MoveTargetOutOfBoundsException
├── NoSuchSessionException
│
├── NotFoundException
│    ├── NoAlertPresentException
│    ├── NoSuchContextException
│    ├── NoSuchCookieException
│    ├── NoSuchElementException
│    │     └── InvalidSelectorException
│    ├── NoSuchFrameException
│    └── NoSuchWindowException
│
├── ScriptTimeoutException
├── SessionNotCreatedException
├── StaleElementReferenceException
├── TimeoutException
├── UnableToSetCookieException
├── UnhandledAlertException
└── UnsupportedCommandException
🧠 Easy Trick to Memorize
🔹 Step 1: Remember the Root
RuntimeException → WebDriverException
🔹 Step 2: Divide into 5 Logical Groups
1️⃣ Element State Issues

InvalidElementStateException

ElementNotInteractableException

ElementClickInterceptedException

ElementNotSelectableException

2️⃣ Not Found Issues

Under NotFoundException:

NoSuchElementException

NoSuchFrameException

NoSuchWindowException

NoAlertPresentException

NoSuchCookieException

InvalidSelectorException

3️⃣ Session Issues

NoSuchSessionException

SessionNotCreatedException

4️⃣ Timeout Issues

TimeoutException

ScriptTimeoutException

5️⃣ Miscellaneous

StaleElementReferenceException

JavascriptException

UnsupportedCommandException

UnhandledAlertException

🎯 Most Important Exceptions (Interview Focus)

If you memorize only these 8, you're safe:

NoSuchElementException

StaleElementReferenceException

TimeoutException

ElementNotInteractableException

ElementClickInterceptedException

NoSuchFrameException

NoSuchWindowException

SessionNotCreatedException
