package com.learnJava.InterviewQuestionForJava;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabetsFromString {


    /* Pangram = A sentence which contains all 26 letters from alphabets
    *  Steps:
    *       Convert the string to uniform case
    *       remove space if anything is there in the sentence
    *       Store the input into a String Array
    *       Create String array with english alphabets
    *       Create two sets, one is with the user's input and other with all alphabets
    *       compare the two sets and find the missing characters    */

    public static void main(String[] args) {
        String givenString = "I Love India";
        String lowerCase = givenString.toLowerCase();
        String case1 = lowerCase.replace(" ", "");
        String[] value1 = case1.split("");
        String verifyString = "abcdefghijklmnopqrstuvwxyz";
        verifyString = verifyString.toLowerCase();
        String[] validateString = verifyString.split("");

//      Method 1 to add values to set
        HashSet<String> set1 = new HashSet<>();
        for (String s: value1){
            set1.add(s);
        }

//      Method 2 add values to arraylist and add to a set with collection concept
        HashSet<String> set2 = new HashSet<>(Arrays.asList(validateString));
        set2.removeAll(set1);
        System.out.println(set2);
    }
}
