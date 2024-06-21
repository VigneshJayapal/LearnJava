package com.learnJava.JavaCrashCourse.collectionInJava;

import java.util.LinkedHashSet;

public class LinkedHashSetExamples {

    /**
     * LinkedHashSet->Child class of HashSet
     * DS-> Hash table + Linked List
     * Insertion order is preserved
     * Duplicates not allowed
     */

    public void linkedHashSetExample(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("10");
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("10");

        System.out.println("Insertion Order preserved Linked Hash Set :"+ linkedHashSet);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedHashSetExamples example= new LinkedHashSetExamples();
        example.linkedHashSetExample();
    }

}
