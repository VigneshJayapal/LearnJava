package com.learnJava.JavaCrashCourse.stringInJavaEx;

public class StringBuilderEx {

    //    To demonstrate String and String Builder difference in the below code
//    No difference were between String buffer and builder
//    But String buffer is Synchronized(Thread-safe), where as String builder is non-synchronized(Non-Thread-safe)
//    String Buffer: it is Synchronized(Thread-safe) means multiple threads cannot access this method simultaneously
//    String Builder: it is Non-Synchronized(Non-Thread-safe) means multiple threads can be able to access this method simultaneously
    public static void main(String [] args){
        System.out.println("Explaining String is IMMUTABLE!");
        String name = "PRANAV";
        System.out.println("Appending a other name to the original name: " + name.concat("VARU"));
        System.out.println("Original name: "+name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Explaining String builder is MUTABLE!");
        StringBuilder builder = new StringBuilder("PRANAV");
        System.out.println("Appending a other name to the original name: " + builder.append("VARU!"));
        System.out.println("Original name: "+builder);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        /*Output:
        Explaining String is IMMUTABLE!
        Appending a other name to the original name: PRANAVVARU
        Original name: PRANAV
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Explaining String builder is MUTABLE!
        Appending a other name to the original name: PRANAVVARU!
        Original name: PRANAVVARU!
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

//      String BufferMethods:
//        Reverse:
        System.out.println("Reversing a String: "+ builder.reverse());
//        Replace:
        StringBuilder builder1 = new StringBuilder("VARALAKSHMI");
        System.out.println("Replacing a existing string: "+ builder1.replace(0,3, "VIGN"));
//        Delete:
        StringBuilder builder2 = new StringBuilder("VIKKY");
        System.out.println("Deleting a existing string: "+ builder2.delete(0, 2));
//        Insert:
        StringBuilder builder3 = new StringBuilder("SUSI");
        System.out.println("Inserting a char to the existing string: "+ builder3.insert(4, "LA"));
//        Capacity:
        System.out.println("To Know the capacity of String Buffer: "+ builder.capacity());
//        Like String, String builder also support charAt, Length, Substring
    }
}
