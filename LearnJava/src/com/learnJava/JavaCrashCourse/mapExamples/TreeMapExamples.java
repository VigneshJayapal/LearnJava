package com.learnJava.JavaCrashCourse.mapExamples;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExamples {

    /*
    * Null key is not allowed
    * Tree Map will be retrieved on Natural sorting order
    * Rest other method & properties are same like hashmap
    * */

    public void treeMapExample(){
        TreeMap<String, String> treeMapEx = new TreeMap<String, String>();
//        Put method to insert value to the HashMap
        treeMapEx.put("PRANAV", "MAY Born");
        treeMapEx.put("VARU", "SEPTEMBER Born");
        treeMapEx.put("VIKKY", "AUGUST Born");
//        treeMapEx.put(null, "dummy"); //Null key is not allowed
//        treeMapEx.put(null, null);  //Null key is not allowed

        System.out.println("HashMap Examples: "+treeMapEx);

//      Put all method to copy from one map to another map
        TreeMap<String, String> treeMapEx1 = new TreeMap<String, String>();
        treeMapEx1.putAll(treeMapEx);

        System.out.println("Copy from another Map: "+treeMapEx1);

//      clear - to remove all the content in hashmap
        treeMapEx1.clear();
        System.out.println("After clear : "+treeMapEx1);

//       Contains Key - to check whether the key is exist in hashmap or not
        System.out.println("Contains Key :"+treeMapEx.containsKey("VIKKY"));

//       Contains Value - to check whether the value is exist in hashmap or not
        System.out.println("Contains Value :"+treeMapEx.containsValue("VIKKY"));

//        clone - takes copy of hashmap
        System.out.println("Clone a copy: "+ treeMapEx.clone());

//        IsEmpty - check whether hashmap is empty or not
        System.out.println("IsEmpty or Not: "+treeMapEx.isEmpty());

//        KeySet - to fetch only the key from hashmap
        System.out.println("KeySet value: "+treeMapEx.keySet());

//        Get - to fetch the value of provided key
        System.out.println("Get value: "+treeMapEx.get("PRANAV"));

//        Values - To fetch only values from the map
        System.out.println("Values of map:"+ treeMapEx.values());

//        EntrySet - To fetch both the key & value
        System.out.println("EntrySet value: "+treeMapEx.entrySet());
    }

    public static void main(String [] args){
        TreeMapExamples treeMapExamples = new TreeMapExamples();
        treeMapExamples.treeMapExample();
    }
}
