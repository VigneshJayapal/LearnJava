package com.learnJava.JavaCrashCourse.collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExamples {

    public void arrayListExamples(){
//      Parent class with reference of child class - Dynamic polymorphism
        List<String> arrayListEx = new ArrayList<String>();

//      Normal Add operations
        arrayListEx.add("BMW");
        arrayListEx.add("AUDI");
        arrayListEx.add("BENZ");
        arrayListEx.add("Buggatti");
        arrayListEx.add("Buggatti");
        System.out.println(arrayListEx);

//      Add with Index poisition in the List
        arrayListEx.add(3, "Rolls Royce");
        System.out.println(arrayListEx);

//      To retrieve a particular value from the list

//      Get the particular value with its index
        System.out.println(arrayListEx.get(2));

//      To get particular value from the list and identify its first indexing position of the value in the list
        System.out.println(arrayListEx.indexOf("AUDI"));

//      To get the last index of value from the list, eventhough it have many duplicate values. It identifies last indexed value position
        System.out.println(arrayListEx.lastIndexOf("Buggatti"));

//      If the given element doesn't exist in the list, returns -1
        System.out.println(arrayListEx.lastIndexOf("Hero"));

//      Copying all the values from One collection to another collection
        List<String> anotherListEx = new ArrayList<String>();
        anotherListEx.addAll(arrayListEx);
        System.out.println("another collection:"+anotherListEx);

//      Deleting all values from the list
        anotherListEx.clear();
        System.out.println("another collection:"+anotherListEx);

//      Removing particular value from the list
//        -with Index
        arrayListEx.remove(3);
        System.out.println(arrayListEx);
//        -with value
        arrayListEx.remove("BMW");
        System.out.println(arrayListEx);

//      Adding null value to the list
        arrayListEx.add(null);
        System.out.println(arrayListEx);

//      Set Method is used for updating the existing value in the particular position
        arrayListEx.set(4, "TATA");
        System.out.println(arrayListEx);

//      To determine whether the given list is empty or not: use isEmpty() method
        System.out.println(arrayListEx.isEmpty());

//      Iterator in ArrayList
//      For Each Loop
        for (String value: arrayListEx) {
            System.out.println("using for each loop:"+value);
        }

//      Normal For Loop
        for (int i=0; i<anotherListEx.size(); i++){
            System.out.println("using for loop:"+arrayListEx.get(i));
        }

//      List Iterator loop for Forward transversing and Reverse Transversing
//      Forward:
//      ListIterator is a Interface, so without creating object we need to use it
        ListIterator<String> iteratorForward = arrayListEx.listIterator();
        while(iteratorForward.hasNext()){
            System.out.println("iteratorForward:"+iteratorForward.next());
        }

//      Reverse:
        ListIterator<String> iteratorReverse = arrayListEx.listIterator();
        while(iteratorReverse.hasPrevious()){
            System.out.println("iteratorReverse:"+iteratorReverse.previous());
        }

//      Iterator loop have only Forward traversing
//      ListIterator is a Interface, so without creating object we need to use it
        Iterator<String> iterator = arrayListEx.iterator();
        while(iterator.hasNext()){
            System.out.println("Iterator:"+ iterator.next());
        }

//      Concurrent Modification Exception - this will happen when a read operation has been overwritten action on the list.
//      Uncomment below to check this method
//        for (String value: arrayListEx) {
//            System.out.println("using for each loop:"+value);
//            arrayListEx.add("Hyundai");
//        }

//        CopyOnWriteArrayList - which allow us to modify the list while reading it
        CopyOnWriteArrayList<String> readWrite = new CopyOnWriteArrayList<String>();

//        Adding elements to the synchorized arraylist
        readWrite.add(0, "PRANAV");
        readWrite.add(1, "VARU");
        readWrite.add(2,"VIKKY");
        System.out.println("CopyOnWriteArrayList:"+ readWrite);

        Iterator<String> iteratorEx = readWrite.iterator();
        while(iteratorEx.hasNext()){
            System.out.println("CopyOnWriteArrayList:"+iteratorEx.next());
            readWrite.add("dummy");
            readWrite.remove("dummy");
        }
        System.out.println("Final List:"+ readWrite);
    }

    public static void main(String [] args){
        ArrayListExamples arrayListExample = new ArrayListExamples();
        arrayListExample.arrayListExamples();
    }
}
