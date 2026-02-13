package com.learnJava.InterviewQuestionForJava;

public class FindANumberFromStringAndAddIt {

    /*
    *   Get the numerical value from a String and Add it
    *   First declare the total number of value is 0
    *   Take the length of string and iterate
    *   Inside the loop, fetch each character and store it
    *   check if the char is digit or character using isDigit()
    *   if it is digit, get the numeric value and add it to total number */

    static String givenString = "VIGNESH12JAYAPAL";
    static int totalNum = 0;

    public static void main(String[] args) {
        int stringLength = givenString.length();
        for(int i=0; i<stringLength; i++){
            char digitValue = givenString.charAt(i);
            if(Character.isDigit(digitValue)){
                totalNum=totalNum+Character.getNumericValue(digitValue);
            }
        }
        System.out.println("Value of total number in the given String is : "+totalNum);
    }
}
