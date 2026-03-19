package com.learnJava.MustKnownJavaConcept;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JacksonReadWriteOperation {

    @Test(priority = 0, enabled = false)
    public void WriteValueConceptEx() throws Throwable, IOException, JsonMappingException {
//      Create Object Mapper
        ObjectMapper objectMapper = new ObjectMapper();
//      Create java object
        JacksonParentClass jacksonParentClass = new JacksonParentClass("vikky",32,"Male");
//      Create a new file
        File file = new File("details.txt");
        objectMapper.writeValue(file, jacksonParentClass);
        System.out.println("File writing operation is success!");
    }

    @Test(priority = 1, enabled = false)
    public void WriteValueWithPrettyFormatEx() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JacksonParentClass jacksonParentClass = new JacksonParentClass("pranav",03,"Male");
        File file = new File("details1.txt");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, jacksonParentClass);
        System.out.println("File writing operation is success!");
    }

    @Test(priority = 2, enabled = false)
    public void WriteValueAsStringConceptEx() throws JsonProcessingException {
//      Create Object Mapper
        ObjectMapper objectMapper = new ObjectMapper();
//      Create java object
        JacksonParentClass jacksonParentClass = new JacksonParentClass("vikky",32,"Male");
        String json = objectMapper.writeValueAsString(jacksonParentClass);
        System.out.println(json);
    }

    @Test(priority = 3, enabled = false)
    public void ReadValueConceptEx() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonValue = "{\"Name\":\"varu\",\"Age\":27,\"Gender\":\"Female\"}";
        Object finalObject = objectMapper.readValue(jsonValue, Object.class);
        objectMapper.writeValue(new File("details2.txt"), finalObject);
        System.out.println("File writing operation is success!");
    }

    @Test(priority = 4, enabled = true)
    public void WritingArrayInJsonEx() throws IOException {
        List<JacksonParentClass> listValue = new ArrayList<JacksonParentClass>();
        listValue.add(new JacksonParentClass("vikky",32,"Male"));
        listValue.add(new JacksonParentClass("varu",27,"Female"));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("details3.txt"), listValue);
        System.out.println("File writing operation is success!");
    }
}
