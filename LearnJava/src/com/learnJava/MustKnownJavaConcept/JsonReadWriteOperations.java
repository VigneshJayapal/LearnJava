package com.learnJava.MustKnownJavaConcept;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class JsonReadWriteOperations {

    @Test(priority = 0, enabled = false)
    public void JsonWriteOperationsExample() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", "Vikky");
        jsonObject.put("Age", "32");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Cricketer");
        jsonArray.add("Singer");
        jsonArray.add("Quick Learner");

        jsonObject.put("Special Talents", jsonArray);

        FileWriter fileWriter = new FileWriter("JsonFileWriting.json");
        fileWriter.write(jsonObject.toJSONString());
        fileWriter.close();
    }

    @Test(priority = 1,enabled = true)
    public void JsonReadOperations() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader("JsonFileWriting.json");
        Object parsedObject = jsonParser.parse(fileReader);
        JSONObject parsedFinalValue = (JSONObject) parsedObject;
        String value1 = (String) parsedFinalValue.get("Name");
        System.out.println("Name is :"+value1);
        String value2 = (String) parsedFinalValue.get("Age");
        System.out.println("Age is :"+value2);
        JSONArray array = (JSONArray) parsedFinalValue.get("Special Talents");
        Iterator iterator = array.iterator();
        int i = 1;
        while(iterator.hasNext()){
            System.out.println("Special Talents "+i+" : "+ iterator.next());
            i++;
        }
    }
}
