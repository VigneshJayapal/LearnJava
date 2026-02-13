package com.learnJava.InterviewQuestionForJava;

/* There were 3 and more methods we can achieve this task
*   Working with Trim() Functions
*   Working with Strip Functions - Strip(), StripLeading(), StripTrailing()
*   Working with regex - "^[ \t]+|[ \t]+$" - Removes Leading and Trailing space
*                         "^[ \t]+" - Removes Leading space
*                         "[ \t]+$" - Removes Trailing space*/

public class RemoveLeadingAndTrailingSpace {

    static String given = " Hello World !! ";

    public static void main(String[] args) {

//      Method 1
        System.out.println(given.trim());

//        Method 2
        System.out.println(given.strip());
        System.out.println(given.stripLeading());
        System.out.println(given.stripTrailing());
        System.out.println(given.stripIndent());

//      Method 3
        System.out.println(given.replaceAll("^[ \t]+|[ \t]+$",""));
        System.out.println(given.replaceAll("^[ \t]", ""));
        System.out.println(given.replaceAll("[ \t]+$", ""));
    }
}
