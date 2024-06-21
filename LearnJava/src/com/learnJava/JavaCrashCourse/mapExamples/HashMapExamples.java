package com.learnJava.JavaCrashCourse.mapExamples;

import java.util.HashMap;

public class HashMapExamples {

    /*
       HashMap(c) is the implementation of the class for Map(I)
       Duplicate Keys are allowed, but duplicate values are not allowed
       Insertion order is not maintained here
       It uses a technique called Hashing to store the element
       Only one null key is allowed
       It is Non-Synchronized and Not a thread-safe, means it can be used in multithreaded environment
       Initial capacity = 16
       Load Factor = 0.75
       */

    public void hashMapExample(){
        HashMap<String, String> hashMapEx = new HashMap<String, String>();
//        Put method to insert value to the HashMap
        hashMapEx.put("PRANAV", "MAY Born");
        hashMapEx.put("VARU", "SEPTEMBER Born");
        hashMapEx.put("VIKKY", "AUGUST Born");
        hashMapEx.put(null, "dummy");
        hashMapEx.put(null, null);

        System.out.println("HashMap Examples: "+hashMapEx);

//      Put all method to copy from one map to another map
        HashMap<String, String> hashMapEx1 = new HashMap<String, String>();
        hashMapEx1.putAll(hashMapEx);

        System.out.println("Copy from another Map: "+hashMapEx1);

//      clear - to remove all the content in hashmap
        hashMapEx1.clear();
        System.out.println("After clear : "+hashMapEx1);

//       Contains Key - to check whether the key is exist in hashmap or not
        System.out.println("Contains Key :"+hashMapEx.containsKey("VIKKY"));

//       Contains Value - to check whether the value is exist in hashmap or not
        System.out.println("Contains Value :"+hashMapEx.containsValue(null));

//        clone - takes copy of hashmap
        System.out.println("Clone a copy: "+ hashMapEx.clone());

//        IsEmpty - check whether hashmap is empty or not
        System.out.println("IsEmpty or Not: "+hashMapEx.isEmpty());

//        KeySet - to fetch only the key from hashmap
        System.out.println("KeySet value: "+hashMapEx.keySet());

//        Get - to fetch the value of provided key
        System.out.println("Get value: "+hashMapEx.get("PRANAV"));

//        Values - To fetch only values from the map
        System.out.println("Values of map:"+ hashMapEx.values());

//        EntrySet - To fetch both the key & value
        System.out.println("EntrySet value: "+hashMapEx.entrySet());
    }

    public static void main(String [] args){
        HashMapExamples hashMapExamples = new HashMapExamples();
        hashMapExamples.hashMapExample();
    }
}
