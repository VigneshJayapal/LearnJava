package com.learnJava.InterviewQuestionForJava;

public class FindaNumberOfVowelsInName {

    /*
    *   Steps:
    *       First lets assume that the vowel count is Zero
    *       Then change the given string into uniform case-sensitive
    *       Then take the length of the given string
    *       Iterate it till the end of string length to find the vowel exist in the array and increment the vowel count by 1
    *       repeat those step till the end of a string
    *       */

    static String givenString = "I LOVE INDIA";
    static Integer vowelCount = 0;

    public static void main(String [] args){
        String lowerCase = givenString.toLowerCase();
        int lengthString = lowerCase.length();

        for(int i=0; i<lengthString; i++){
            if(lowerCase.charAt(i)=='a' || lowerCase.charAt(i)=='e' || lowerCase.charAt(i)=='i' ||
                    lowerCase.charAt(i)=='o' || lowerCase.charAt(i)=='u'){
                vowelCount++;
            }
        }
        System.out.println("Vowel count exist in given string is :"+vowelCount);
    }
}
