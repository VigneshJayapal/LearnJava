package com.learnJava.MustKnownJavaConcept;

import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import java.io.IOException;


public class Log4jFullConcepts {
// It is simply a factory method used to obtain a Logger instance.
/*  Purpose
        Creates a Logger instance for this class.

    Why we use this?
        So every log message knows which class generated it.
           */
    Logger logger = Logger.getLogger(Log4jFullConcepts.class);

    /*  In Log4j, configuration can be done in three ways:
           1. Using programmatic configuration in Java code - Console Appender
           2. Using log4j.xml file - Xml Configurator
           3. Using log4j.properties file - Property Configurator   */

//  1. Using programmatic configuration in Java code - Programmatic Configurator
    /* Short Interview Answer
            Programmatic configuration in Log4j means configuring logging components such as Logger, Appender, and Layout directly in Java code
                instead of using configuration files like log4j.properties. It allows dynamic control over logging behavior at runtime */

    @Test(priority = 0, enabled = false)
    public void ProgrammaticConfiguratorExamples() throws IOException {
//  PatternLayout
/*  What is Layout?
        Layout defines how log messages appear.

Pattern Breakdown:
        Pattern	                Meaning
        %d{yyyy-MM-dd HH:mm:ss}	Date and time
        %-5p	                Log level
        %c{1}	                Class name
        %L	                    Line number
        %m	                    Log message
        %n	                    New line    */

        PatternLayout patternLayout = new PatternLayout("%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m %n");

//      ConsoleAppender
/*      What is an Appender?
            An Appender decides where logs are written.
Examples:
        Appender	        Output
        ConsoleAppender	    Console
        FileAppender	    File
        RollingFileAppender	Rotating files
        SMTPAppender	    Email
Here:
ConsoleAppender = Prints logs to IDE console/terminal.  */

        ConsoleAppender consoleAppender = new ConsoleAppender(patternLayout);
        consoleAppender.activateOptions();
//      File Appender
/*  This writes logs to a file.
        File created:
            application.log */
        FileAppender fileAppender = new FileAppender(patternLayout, "application.log");
        Logger rootlogger = Logger.getRootLogger();
/*  What is Root Logger?
        It is the main logger in Log4j.
        All loggers inherit configuration from the root logger.     */

        rootlogger.addAppender(consoleAppender);
        rootlogger.addAppender(fileAppender);
/*Log Level Hierarchy
TRACE
DEBUG
INFO
WARN
ERROR
FATAL

If level is DEBUG, logs allowed:
DEBUG
INFO
WARN
ERROR
FATAL

TRACE may not appear depending on configuration.*/
        rootlogger.setLevel(Level.DEBUG);

//        Logging Messages
        logger.info("This is just a Info Message!");
//        Used for general application information.

        logger.debug("This is a Debug Message!");
//        Used for debugging details.

        logger.warn("This is a Warning Message!");
//        Used when something unexpected but not fatal happens.

        logger.error("This is a Error Message!");
//        Used for serious problems.

        logger.fatal("This is a Fatal Message!");
//        Used for critical system failure.

        logger.trace("This is a trace Message!");
//        Very detailed logs (mostly used for deep debugging).

/*  Final Execution Flow

When the TestNG test runs:

ConsoleAppenderExamples()

Steps executed:

1️⃣ Create Layout
2️⃣ Create ConsoleAppender
3️⃣ Create FileAppender
4️⃣ Attach both Appender's to RootLogger
5️⃣ Set log level
6️⃣ Print logs

Logs appear in:

IDE Console
application.log file    */
    }

/*  2. Using Basic Configurator Examples */
/*  => it follows this patter = "%-4r [%t] %-5p %c %x - %m %n"
*   => It is suitable for temporary and tutorial purpose */

    @Test(priority = 1, enabled = false)
    public void BasicConfiguratorExamples(){
        BasicConfigurator.configure();

//        Logging Messages
        logger.info("This is just a Info Message!");
//        Used for general application information.

        logger.debug("This is a Debug Message!");
//        Used for debugging details.

        logger.warn("This is a Warning Message!");
//        Used when something unexpected but not fatal happens.

        logger.error("This is a Error Message!");
//        Used for serious problems.

        logger.fatal("This is a Fatal Message!");
//        Used for critical system failure.

        logger.trace("This is a trace Message!");
//        Very detailed logs (mostly used for deep debugging).

    }

/*  3. Property Configurator in Log4j (Using log4j.properties) 📄

Property Configurator is a way to configure Log4j logging using a properties file instead of Java code.
It is the most commonly used configuration method in Selenium automation frameworks because it is simple and easy to maintain.

Instead of writing configuration in Java, we create a file called:

log4j.properties

and Log4j reads it at runtime.

1️⃣ Why Use Property Configurator? 🤔

Advantages:

✅ No need to change Java code
✅ Easy to modify logging levels
✅ Easy to maintain in large projects
✅ Standard approach in automation frameworks

Example:
If you want to change log level from DEBUG to ERROR, you only modify the properties file, not the code.

2️⃣ Basic Structure of log4j.properties

A Log4j properties file mainly contains 3 components:

1️⃣ Logger – controls logging level
2️⃣ Appender – defines where logs go
3️⃣ Layout – defines log format

3️⃣ Example log4j.properties File 📄
Create this file inside src/main/resources or project root.
# Root Logger
log4j.rootLogger=DEBUG, consoleAppender, fileAppender

# Console Appender
log4j.appender.consoleAppender=org.apache.log4j.ConsoleAppender
log4j.appender.consoleAppender.layout=org.apache.log4j.PatternLayout
log4j.appender.consoleAppender.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n

# File Appender
log4j.appender.fileAppender=org.apache.log4j.FileAppender
log4j.appender.fileAppender.File=application.log
log4j.appender.fileAppender.layout=org.apache.log4j.PatternLayout
log4j.appender.fileAppender.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n

4️⃣ Explanation of Each Line 🔍
Root Logger
log4j.rootLogger=DEBUG, consoleAppender, fileAppender

Meaning:

Part	            Description
DEBUG	            Log level
consoleAppender	    Print logs in console
fileAppender	    Write logs to file
Console Appender    log4j.appender.consoleAppender=org.apache.log4j.ConsoleAppender

This tells Log4j:

➡ Send logs to console (IDE terminal)

Layout for Console
log4j.appender.consoleAppender.layout=org.apache.log4j.PatternLayout

This defines log message format.

Log Pattern
%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n

Meaning:

Pattern	Meaning
%d	    Date
%p	    Log level
%c	    Class name
%L	    Line number
%m	    Message
%n	    New line

File Appender
log4j.appender.fileAppender=org.apache.log4j.FileAppender

This tells Log4j to write logs into a file.

File Location
log4j.appender.fileAppender.File=application.log

Logs will be saved in:

application.log

inside your project folder.

5️⃣ Java Code to Use Property Configurator 💻

Now we load the configuration file in Java.

6️⃣ How It Works ⚙️

Execution Flow:

1️⃣ TestNG runs the test
2️⃣ PropertyConfigurator.configure() loads log4j.properties
3️⃣ Log4j creates appender's
4️⃣ Logs are printed in console and file

9️⃣ Appender's Commonly Used in Frameworks
Appender	                Purpose
ConsoleAppender	            Logs to console
FileAppender	            Logs to file
RollingFileAppender	        Creates multiple log files
DailyRollingFileAppender	Creates logs per day

In Selenium frameworks, developers mostly use:
RollingFileAppender = to prevent large log files.

Question: What is Property Configurator in Log4j?

Answer:

Property Configurator in Log4j is used to configure logging behavior using a log4j.properties file instead of writing configuration in Java code.
    It defines loggers, appender's, and layouts in a simple key-value format, making logging configuration easier to maintain and modify.

*/
    @Test(priority = 2, enabled = false)
    public void PropertiesFileLog4jExample(){

        PropertyConfigurator.configure("log4j.properties");
        logger.trace("This is a Trace message!");
        logger.debug("This is a Debug message!");
        logger.warn("This is a Warning Message!");
        logger.error("This is a Error Message!");
        logger.fatal("This is a Fatal Message!");

    }

/*  3.  XML Configurator in Log4j:
            In Apache Log4j, an XML Configurator is used to configure logging behavior using an XML file instead of Java code.
                It defines loggers, appender's, layouts, and log levels in a structured XML format.

Using XML configuration makes the framework easier to maintain and modify without changing Java code.

1. Why Use XML Configuration in Log4j
Advantages:
Easy to read and structured
No need to recompile code when changing logging settings
Supports multiple appenders
Commonly used in enterprise frameworks (like Selenium automation frameworks)

2. XML Configuration File Name
The default file name is:
log4j.xml
Place it inside:
src/main/resources
or
src/test/resources

3. Basic Structure of log4j.xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">
<log4j:configuration xmlns:log4j="http://jakarta.apache.org/log4j/">
    <!-- Appender -->
    <appender name="console" class="org.apache.log4j.ConsoleAppender">
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern"
                   value="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </layout>
    </appender>
    <!-- Root Logger -->
    <root>
        <level value="INFO"/>
        <appender-ref ref="console"/>
    </root>
</log4j:configuration>

4. Components in XML Configuration
        1. Configuration Tag
Main tag for Log4j.
<log4j:configuration>
        2. Appender
Defines where logs will be stored.
Example: Console Appender
<appender name="console" class="org.apache.log4j.ConsoleAppender">
Other appenders:
Appender	        Purpose
ConsoleAppender	    Print logs in console
FileAppender	    Store logs in file
RollingFileAppender	Rotate log files
JDBCAppender	    Store logs in database

        3. Layout

Defines log format.
Example:
<layout class="org.apache.log4j.PatternLayout">
Pattern:
%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n
Meaning:

Pattern	    Meaning
%d	        Date
%p	        Log level
%c	        Class name
%L	        Line number
%m	        Message
%n	        New line

        4. Root Logger
Defines default log level.
<root>
    <level value="INFO"/>
    <appender-ref ref="console"/>
</root>

        5. Example 1 — Console Logging
log4j.xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">
<log4j:configuration xmlns:log4j="http://jakarta.apache.org/log4j/">
    <appender name="consoleAppender" class="org.apache.log4j.ConsoleAppender">
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern"
                   value="%d{yyyy-MM-dd HH:mm:ss} %-5p %c - %m%n"/>
        </layout>
    </appender>
    <root>
        <level value="DEBUG"/>
        <appender-ref ref="consoleAppender"/>
    </root>
</log4j:configuration>

        6. Example 2 — Logging into File
XML Configuration
<appender name="fileAppender" class="org.apache.log4j.FileAppender">
    <param name="File" value="logs/application.log"/>
    <layout class="org.apache.log4j.PatternLayout">
        <param name="ConversionPattern"
               value="%d{yyyy-MM-dd HH:mm:ss} %-5p %c - %m%n"/>
    </layout>
</appender>
<root>
    <level value="INFO"/>
    <appender-ref ref="fileAppender"/>
</root>

Logs will be stored in:
logs/application.log

        7. Comparison of Log4j Configuration Types
Configuration Type	    Method
Basic Configurator	    Java Code
Property Configurator	.properties file
XML Configurator	    .xml file

Example:
BasicConfigurator.configure();
PropertyConfigurator.configure("log4j.properties");
DOMConfigurator.configure("log4j.xml");

        8. When XML Configuration is Preferred
XML is mostly used when:
Large automation frameworks
Multiple appenders
Advanced log formatting
Complex logging rules

Example frameworks:
Selenium Automation Framework
Spring applications
Enterprise Java applications

✅ Short Interview Definition
XML Configurator in Log4j is a method of configuring logging behavior using an XML configuration file (log4j.xml)
    where loggers, appenders, layouts, and log levels are defined without modifying Java code.
If you want, I can also show you a Complete Selenium Framework Log4j XML (industry-level example) used in real automation projects. */

    @Test(priority = 3, enabled = true)
    public void XmlConfiguratorExamples(){
        DOMConfigurator.configure("log4j.xml");
        logger.trace("This is a Trace message!");
        logger.debug("This is a Debug message!");
        logger.warn("This is a Warning Message!");
        logger.error("This is a Error Message!");
        logger.fatal("This is a Fatal Message!");

    }
}
