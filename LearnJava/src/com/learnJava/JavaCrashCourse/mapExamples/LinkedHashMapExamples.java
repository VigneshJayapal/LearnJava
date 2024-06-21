package com.learnJava.JavaCrashCourse.mapExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExamples {

    /*
     LinkedHashMap - Insertion order is maintained here, rest all are same like hashmap
      */

    public void linkedHashMapExample(){
        LinkedHashMap<String, String> linkedHashMapEx = new LinkedHashMap<String, String>();
//        Put method to insert value to the HashMap
        linkedHashMapEx.put("PRANAV", "MAY Born");
        linkedHashMapEx.put("VARU", "SEPTEMBER Born");
        linkedHashMapEx.put("VIKKY", "AUGUST Born");
        linkedHashMapEx.put(null, "dummy");
        linkedHashMapEx.put(null, null);

        System.out.println("HashMap Examples: "+linkedHashMapEx);

//      Put all method to copy from one map to another map
        LinkedHashMap<String, String> linkedHashMapEx1 = new LinkedHashMap<String, String>();
        linkedHashMapEx1.putAll(linkedHashMapEx);

        System.out.println("Copy from another Map: "+linkedHashMapEx1);

//      clear - to remove all the content in hashmap
        linkedHashMapEx1.clear();
        System.out.println("After clear : "+linkedHashMapEx1);

//       Contains Key - to check whether the key is exist in hashmap or not
        System.out.println("Contains Key :"+linkedHashMapEx.containsKey("VIKKY"));

//       Contains Value - to check whether the value is exist in hashmap or not
        System.out.println("Contains Value :"+linkedHashMapEx.containsValue(null));

//        clone - takes copy of hashmap
        System.out.println("Clone a copy: "+ linkedHashMapEx.clone());

//        IsEmpty - check whether hashmap is empty or not
        System.out.println("IsEmpty or Not: "+linkedHashMapEx.isEmpty());

//        KeySet - to fetch only the key from hashmap
        System.out.println("KeySet value: "+linkedHashMapEx.keySet());

//        Get - to fetch the value of provided key
        System.out.println("Get value: "+linkedHashMapEx.get("PRANAV"));

//        Values - To fetch only values from the map
        System.out.println("Values of map:"+ linkedHashMapEx.values());

//        EntrySet - To fetch both the key & value
        System.out.println("EntrySet value: "+linkedHashMapEx.entrySet());
    }

    public static void main(String [] args){
        LinkedHashMapExamples linkedHashMapExamples = new LinkedHashMapExamples();
        linkedHashMapExamples.linkedHashMapExample();
    }
}
