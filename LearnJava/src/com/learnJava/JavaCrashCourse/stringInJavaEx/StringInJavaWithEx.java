package com.learnJava.JavaCrashCourse.stringInJavaEx;

import java.util.Locale;

public class StringInJavaWithEx {
    //    String literal concept
//    Syntax: String obj = Char of Sequence enclosed within double quotes
    public static String name = "PRANAV";
    public static Integer id = 12345;
    //    Using New Keyword
//    Syntax: String obj name = new Keyword with String of Value declared.
    public static String empName = new String("VARU");

    public static void main(String[] args) {
//        Here is the few examples of String Method and String concepts

//      1. charAt method - returning the character value for the particular index
        System.out.println(name.charAt(3));

//       2. Length method - returning the length value of given string
        System.out.println(name.length());

//      3. equal method - checking the equality of string with the given object
        System.out.println(name.equals("PRANAV"));

//      4. equal ignore case method - checking the equality of string with the given object without case sensitivity
        System.out.println(name.equalsIgnoreCase("pranav"));

//      5. empty method - check if the string is empty or not
        System.out.println(name.isEmpty());

//      6. contains method - check if the provided char or char seq based on the given value is present or not, which returns ture or false boolean value
        System.out.println(name.contains("V"));

//      7. substring method - taking the particular portion on the string (cropping the string value)
        System.out.println(name.substring(3));

//      8. substring with index position - taking the particular portion on the string with beggining and end index value
//        substring will include only the beggining index, not an end index value
        System.out.println(name.substring(2, 4));

//      9. concat method - appending the value to the existing string value
        System.out.println(name.concat("VARU"));

//      10. Replace method with char - replace existing char value with new char value
        System.out.println(name.replace("A", "V"));

//      11. Replace method with charSequence - replace existing charSeq value with new charSeq value
        System.out.println(name.replace("PRANAV", "VARU"));

//       12. index of - find the position of char from the given string
        System.out.println(name.indexOf("R"));

//      13. index of - find the character specified position from the index position
        System.out.println(name.indexOf("A", 4));
        System.out.println(name.indexOf("AN", 2));

//      14. trim method - it removes leading spaces in the beggining and ending of the given string
        System.out.println((" VARU ").trim());

//      15. value of method - it converts the data type integer to a String
        System.out.println(String.valueOf(id));

//      16. Lowercase to uppercase for given string
        System.out.println("varu".toUpperCase());

//      17. Uppercase to Lowercase for the given string
        System.out.println(name.toLowerCase());

//      18. join method - returns a joined string with given delimiter
        System.out.println(String.join("-", "I", "LOVE", "INDIA"));
        System.out.println(String.join("/", "12", "08", "1993"));

//      19. Split functions
        String given = "I-Love-India";
        String[] splitThis = given.split("-");
        for (String string: splitThis ) {
            System.out.println(string);
        }

    }
}
