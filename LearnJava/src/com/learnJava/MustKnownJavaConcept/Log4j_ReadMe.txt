What is Log4j in Java?

Apache Log4j is a popular logging framework for Java applications developed by the Apache Software Foundation.
It helps developers record application events, errors, and debugging information into different outputs like console, files, databases, etc.

Instead of using System.out.println(), professional Java applications use Log4j because it provides structured, configurable, and level-based logging.

1. Why Logging is Important

Logging helps developers:

Debug errors

Track application flow

Monitor production systems

Store error history

Audit user activities

Example without logging:

System.out.println("User logged in");

Problem:

Hard to manage

Cannot control levels

Cannot write to different outputs easily

With Log4j:

logger.info("User logged in");

Now you can control:

log level

output destination

log format

2. Versions of Log4j
Version	Description
Log4j 1.x	Old version (deprecated)
Log4j 2.x	Modern version with better performance
Log4j 3.x	Latest development

Most companies use Log4j2.

3. Core Components of Log4j

Log4j has three main components:

1️⃣ Logger

Responsible for capturing log messages.

Example:

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

    static Logger logger = LogManager.getLogger(Test.class);

    public static void main(String[] args) {

        logger.info("Application started");
        logger.error("Error occurred");
    }
}

2️⃣ Appender

Determines where logs are stored.

Examples:

Appender	        Output
ConsoleAppender	    Console
FileAppender	    File
RollingFileAppender	Rotating log files
JDBCAppender	    Database
SMTPAppender	    Email

Example:

Logs → Console
Logs → File
Logs → Database

3️⃣ Layout

Defines how the log message looks.

Example log:

2026-03-11 17:10:20 INFO Test - Application started

Layout controls:

Timestamp

Level

Class name

Message

4. Log Levels

Log4j provides different levels of logging.

Level	Purpose
OFF	    Disable logging
FATAL	Critical system failure
ERROR	Serious error
WARN	Warning
INFO	General information
DEBUG	Debugging information
TRACE	Detailed debugging
ALL	    Enable all logs

Example:

logger.fatal("System crash");
logger.error("Database error");
logger.warn("Low memory");
logger.info("Application started");
logger.debug("Variable value");
logger.trace("Method execution");

5. Log4j Architecture
Application Code
      ↓
    Logger
      ↓
   Log Level Check
      ↓
   Appender
      ↓
    Layout
      ↓
  Output (File / Console / DB)

Example Flow:

logger.info("User logged in")

↓ Logger checks level

↓ If allowed

↓ Appender sends log

↓ Layout formats log

↓ Console/File shows log

6. Log4j Configuration
Log4j works using configuration files.

Supported formats:
File Type
log4j.properties
log4j.xml
log4j2.xml
log4j2.json
log4j2.yaml

Most used:
log4j2.xml

7. Example Configuration (log4j2.xml)
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c - %m%n"/>
        </Console>
    </Appenders>
    <Loggers>
        <Root level="info">
            <AppenderRef ref="Console"/>
        </Root>
    </Loggers>
</Configuration>

Output:
2026-03-11 17:20:10 INFO Test - Application started

8. File Logging Example
<File name="FileLogger" fileName="logs/app.log">
    <PatternLayout>
        <pattern>%d %p %c{1.} [%t] %m%n</pattern>
    </PatternLayout>
</File>

Logs will be stored in:
logs/app.log

9. Rolling File Appender
Prevents log files from becoming too large.

Example:
<RollingFile name="RollingFile"
             fileName="logs/app.log"
             filePattern="logs/app-%d{yyyy-MM-dd}.log">
    <PatternLayout>
        <pattern>%d %p %c{1.} [%t] %m%n</pattern>
    </PatternLayout>
    <Policies>
        <TimeBasedTriggeringPolicy interval="1"/>
    </Policies>
</RollingFile>

Result:
app-2026-03-10.log
app-2026-03-11.log

10. Advantages of Log4j

✅ Flexible configuration
✅ Different logging levels
✅ Multiple output destinations
✅ Easy debugging
✅ Performance optimized
✅ Supports asynchronous logging

11. Log4j vs System.out.println()
Feature	            System.out.println	Log4j
Log Levels	            ❌	              ✅
File Logging	        ❌	              ✅
Configuration	        ❌                ✅
Production Ready	    ❌	              ✅
Performance	            ❌	              ✅

12. Real Industry Usage Example

In a Banking Application:
logger.info("User login successful");
logger.warn("Multiple failed login attempts");
logger.error("Database connection failed");

Production log file:
2026-03-11 INFO LoginService - User login successful
2026-03-11 WARN LoginService - Multiple failed login attempts
2026-03-11 ERROR DBService - Database connection failed
13. Log4j Maven Dependency

If you use Maven:
<dependency>
 <groupId>org.apache.logging.log4j</groupId>
 <artifactId>log4j-core</artifactId>
 <version>2.22.1</version>
</dependency>

14. Best Practices
✔ Use INFO for important events
✔ Use DEBUG for developer debugging
✔ Use ERROR only for failures
✔ Never log passwords or sensitive data
✔ Use RollingFileAppender

15. Simple Working Example
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

    private static final Logger logger =
            LogManager.getLogger(Demo.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        int a = 10;
        int b = 0;

        try {
            int c = a / b;
        }
        catch(Exception e) {
            logger.error("Exception occurred", e);
        }

        logger.info("Application Finished");
    }
}

16. Log4j in Selenium Automation

Used for automation test logging:

Example:
logger.info("Launching browser");
logger.info("Entering username");
logger.info("Clicking login button");
logger.error("Login failed");

Test report logs become easier to analyze.

✅ Short Definition for Interviews

Log4j is a Java-based logging framework developed by the Apache Software Foundation used to record application logs with different levels and store them in various outputs like console, files, or databases.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
JDBC Appender Setup in Apache Log4j

A JDBC Appender in Log4j allows you to store log messages directly into a database table using JDBC (Java Database Connectivity) instead of writing logs to files or console.

This is useful when you want:

Centralized log storage 📊

Easy querying of logs using SQL

Log monitoring through database tools

1️⃣ Architecture of JDBC Appender
Java Application
       │
       ▼
     Log4j
       │
       ▼
  JDBC Appender
       │
       ▼
   JDBC Driver
       │
       ▼
   Database Table

2️⃣ Step 1: Create Database Table

Example table in MySQL / SQL Server.

CREATE TABLE LOGS (
    ID INT IDENTITY(1,1) PRIMARY KEY,
    LOG_DATE DATETIME,
    LOGGER VARCHAR(100),
    LEVEL VARCHAR(10),
    MESSAGE VARCHAR(4000)
);

3️⃣ Step 2: Add JDBC Driver Dependency

Example for MySQL

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>

Example for SQL Server

<dependency>
    <groupId>com.microsoft.sqlserver</groupId>
    <artifactId>mssql-jdbc</artifactId>
    <version>12.4.1.jre11</version>
</dependency>

4️⃣ Step 3: Configure JDBC Appender (log4j.properties)
log4j.rootLogger=DEBUG, DB

# JDBC Appender
log4j.appender.DB=org.apache.log4j.jdbc.JDBCAppender
log4j.appender.DB.URL=jdbc:mysql://localhost:3306/testdb
log4j.appender.DB.driver=com.mysql.cj.jdbc.Driver
log4j.appender.DB.user=root
log4j.appender.DB.password=root

log4j.appender.DB.sql=INSERT INTO LOGS(LOG_DATE, LOGGER, LEVEL, MESSAGE) \
VALUES('%d{yyyy-MM-dd HH:mm:ss}','%c','%p','%m')

log4j.appender.DB.layout=org.apache.log4j.PatternLayout

5️⃣ Java Program Example
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class JDBCAppenderExample {

    static Logger logger = Logger.getLogger(JDBCAppenderExample.class);

    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");

        logger.info("Application started");
        logger.warn("This is warning message");
        logger.error("Database error occurred");

    }
}

6️⃣ Output in Database Table
ID	LOG_DATE	        LOGGER	            LEVEL	MESSAGE
1	2026-03-13 10:20:01	JDBCAppenderExample	INFO	Application started
2	2026-03-13 10:20:02	JDBCAppenderExample	WARN	This is warning message
3	2026-03-13 10:20:03	JDBCAppenderExample	ERROR	Database error occurred

7️⃣ Important JDBCAppender Pattern Keywords
Pattern	Meaning
%d	Date
%p	Log level
%c	Logger class name
%m	Log message
%t	Thread name

Example SQL pattern:

INSERT INTO LOGS VALUES('%d','%p','%c','%m')
8️⃣ Advantages of JDBC Appender

✅ Logs stored in database
✅ Easy SQL filtering
✅ Centralized monitoring
✅ Useful for enterprise systems

9️⃣ Disadvantages

❌ Slower than file logging
❌ Database dependency
❌ Can affect application performance if used heavily

🔟 Best Practice

Use Async Appender + JDBC Appender

Application
   │
   ▼
Async Appender
   │
   ▼
JDBC Appender
   │
   ▼
Database

This prevents performance slowdown.

✅ Interview Tip

JDBC Appender in Log4j is used to persist logging events into a database table using JDBC connectivity.
