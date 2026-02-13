package com.learnJava.InterviewQuestionForJava;

public class FindLengthOfString {

    static String name="PRANAV";

    public static void main(String []args){
        char[] nameArray = name.toCharArray();
        int Length=0;
        for(Character character: nameArray){
            Length++;
        }
        System.out.println("Lenght of character : "+Length);
    }
}
