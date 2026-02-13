package com.learnJava.InterviewQuestionForJava;

public class ReplaceVowelsWithSpecialSigns {

    /*
    * Method1:
    * In a given sentence replace all vowels with ? sign
    *   Input = "I LOVE INDIA"
    *   Convert the given string to char array
    *   Calculate the length of the string and iterate
    *   inside the loop, verify the charAt(index)=vowels
    *   if it is a vowel character, then replace it with ? sign
    *   Outside the loop, iterate it again to print the char Array
    *
    * Method2:
    * Another Approach: using RegularExpression
    *   Use replaceAll functions for regular expression [AEIOUaeiou] and replace it with ?.
    *
    * CAUTION: if you are replacing it with $ sign, then make sure \\ escape char is used
    * */

    static String given = "I LOVE INDIA";

//    Method1:
    public static void usingIteration(){
        char[] charArray = given.toCharArray();
        for(int i=0; i<given.length(); i++){
            if(given.charAt(i)=='A' || given.charAt(i)=='E' || given.charAt(i)=='I' || given.charAt(i)=='O' ||
                    given.charAt(i)=='U' || given.charAt(i)=='a' || given.charAt(i)=='e' || given.charAt(i)=='i' ||
                    given.charAt(i)=='o' || given.charAt(i)=='u'){
                charArray[i]='?';
            }
        }
        for(int i=0;i<given.length(); i++){
            System.out.print(charArray[i]);
        }
    }

//    Method2:
    public static void usingRegrex(){
        String replaceValue = given.replaceAll("[AEIOUaeiou]", "?");
        System.out.println(replaceValue);
    }

    public static void main(String[] args) {
//        usingIteration();
        usingRegrex();
    }
}
