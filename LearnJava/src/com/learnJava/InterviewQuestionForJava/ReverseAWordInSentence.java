package com.learnJava.InterviewQuestionForJava;

public class ReverseAWordInSentence {

    static String givenString = "I LOVE INDIA";
    static String reversedString = "";

    public static void main(String []args){
        String[] wordArray = givenString.split(" ");

        for(int i=wordArray.length-1; i>=0;i--){
            reversedString = reversedString+wordArray[i]+" ";
        }
        System.out.print(reversedString);
    }
}
