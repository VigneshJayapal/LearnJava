To write a JSON object to a text file using the Jackson library in Java, you typically use the Jackson Databind ObjectMapper class. It can convert Java objects into JSON and directly save them to a file.

1️⃣ Maven Dependency (Jackson)

Add this dependency if you are using **Apache Maven:

<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.17.0</version>
</dependency>

2️⃣ Example Java Class (POJO)
class Employee {

    public int id;
    public String name;
    public String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}

3️⃣ Writing JSON Object to a Text File
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class WriteJsonToFile {

    public static void main(String[] args) {

        try {

            // Create ObjectMapper.
            ObjectMapper mapper = new ObjectMapper();

            // Create Java Object
            Employee emp = new Employee(101, "Vikky", "Automation");

            // Write JSON to file
            mapper.writeValue(new File("employee.txt"), emp);

            System.out.println("JSON written to file successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

4️⃣ Output File (employee.txt)
{
  "id" : 101,
  "name" : "Vikky",
  "department" : "Automation"
}

Jackson automatically converts the Java object into JSON and writes it to the file.

5️⃣ Pretty Print JSON (Readable Format)
mapper.writerWithDefaultPrettyPrinter()
      .writeValue(new File("employee.txt"), emp);

Output:

{
  "id" : 101,
  "name" : "Vikky",
  "department" : "Automation"
}

6️⃣ Writing JSON String Instead of Object

If you already have a JSON string:

String json = "{\"id\":101,\"name\":\"Vikky\",\"department\":\"Automation\"}";

ObjectMapper mapper = new ObjectMapper();
Object obj = mapper.readValue(json, Object.class);

mapper.writeValue(new File("employee.txt"), obj);

7️⃣ Writing JSON Array Example
List<Employee> list = new ArrayList<>();

list.add(new Employee(101,"Vikky","QA"));
list.add(new Employee(102,"Rahul","Dev"));

mapper.writerWithDefaultPrettyPrinter()
      .writeValue(new File("employees.txt"), list);

Output:

[
  {
    "id":101,
    "name":"Vikky",
    "department":"QA"
  },
  {
    "id":102,
    "name":"Rahul",
    "department":"Dev"
  }
]

✅ Key Jackson Methods

Method	                            Purpose
writeValue(File, Object)	        Write JSON to file
writeValueAsString(Object)	        Convert object to JSON string
readValue(File, Class)	            Read JSON file
writerWithDefaultPrettyPrinter()	Pretty formatted JSON

💡 Since you are learning Java automation frameworks (Selenium + Log4j etc.), this is commonly used for:

Test data storage
    API request payloads
    Configuration files
    Logging structured data

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

✔ Write API response JSON to file using Jackson (real automation scenario).

Here is a real automation scenario:
Writing an API response JSON to a file using the Jackson Databind library. This is very common in Selenium WebDriver + API automation frameworks for saving responses, debugging, or reporting.

1️⃣ Scenario

You call an API using REST Assured, get the response, and save it as a JSON file using Jackson.

Example API:

https://reqres.in/api/users/2

2️⃣ Maven Dependencies
<dependencies>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>5.4.0</version>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.17.0</version>
    </dependency>
</dependencies>

3️⃣ Java Example (API → JSON File)

import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class SaveAPIResponse {

    public static void main(String[] args) {

        try {

            // Call API
            Response response = RestAssured.get("https://reqres.in/api/users/2");

            // Convert response to String.
            String jsonResponse = response.getBody().asString();

            // Jackson ObjectMapper.
            ObjectMapper mapper = new ObjectMapper();

            // Convert JSON string → Object
            Object json = mapper.readValue(jsonResponse, Object.class);

            // Write JSON to file
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File("API_Response.json"), json);

            System.out.println("API Response saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

4️⃣ Generated File (API_Response.json)
{
  "data": {
    "id": 2,
    "email": "janet.weaver@reqres.in",
    "first_name": "Janet",
    "last_name": "Weaver"
  }
}

5️⃣ Real Automation Framework Usage

In a Hybrid Framework (POM + Data Driven) this is used for:

✔ Debugging API failures

Save response when test fails.

if(response.statusCode()!=200)
{
   mapper.writeValue(new File("failed_response.json"), json);
}

✔ Storing test evidence

Automation reports often attach JSON responses.

✔ Data validation

Compare expected JSON with actual JSON.

6️⃣ Cleaner Utility Method (Framework Level)

Most frameworks create a utility class.

public class JsonUtil {

    public static void writeJsonToFile(String json, String fileName) {

        try {

            ObjectMapper mapper = new ObjectMapper();

            Object obj = mapper.readValue(json, Object.class);

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File(fileName), obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

Usage:

JsonUtil.writeJsonToFile(response.asString(),"response.json");

✅ Automation Benefit

Use Case	        Why
Debugging	        Save API responses
Reporting	        Attach JSON in reports
Data validation	    Compare expected vs actual
Logging	Store       structured logs

