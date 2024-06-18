package com.learnJava.JavaCrashCourse.stringInJavaEx;

public class StringBufferEx {

//    To demonstrate String and String buffer difference in the below code
    public static void main(String [] args){
        System.out.println("Explaining String is IMMUTABLE!");
        String name = "PRANAV";
        System.out.println("Appending a other name to the original name: " + name.concat("VARU"));
        System.out.println("Original name: "+name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Explaining String Buffer is MUTABLE!");
        StringBuffer buffer = new StringBuffer("PRANAV");
        System.out.println("Appending a other name to the original name: " + buffer.append("VARU!"));
        System.out.println("Original name: "+buffer);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        /*Output:
        Explaining String is IMMUTABLE!
        Appending a other name to the original name: PRANAVVARU
        Original name: PRANAV
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Explaining String Buffer is MUTABLE!
        Appending a other name to the original name: PRANAVVARU!
        Original name: PRANAVVARU!
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

//      String BufferMethods:
//        Reverse:
        System.out.println("Reversing a String: "+ buffer.reverse());
//        Replace:
        StringBuffer buffer1 = new StringBuffer("VARALAKSHMI");
        System.out.println("Replacing a existing string: "+ buffer1.replace(0,3, "VIGN"));
//        Delete:
        StringBuffer buffer2 = new StringBuffer("VIKKY");
        System.out.println("Deleting a existing string: "+ buffer2.delete(0, 2));
//        Insert:
        StringBuffer buffer3 = new StringBuffer("SUSI");
        System.out.println("Inserting a char to the existing string: "+ buffer3.insert(4, "LA"));
//        Capacity:
        System.out.println("To Know the capacity of String Buffer: "+ buffer.capacity());
//        Like String, String buffer also support charAt, Length, Substring
    }
}
