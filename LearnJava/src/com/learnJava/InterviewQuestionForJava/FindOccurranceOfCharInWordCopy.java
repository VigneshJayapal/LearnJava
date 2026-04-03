package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class FindOccurranceOfCharInWordCopy {

    public static String givenInput;
    public static Character findChar = 'i';
    public static int occurrance = 0;

    public static void GetInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        givenInput = scanner.nextLine();
    }

    public static void FindOccurranceOfChar(){
        givenInput = givenInput.toLowerCase();
        char[] charArray = givenInput.toCharArray();
        for(Character ch: charArray){
            if(ch==findChar){
                occurrance++;
            }
        }
        System.out.println("There are "+occurrance+" occurrance exist in the given input!");
    }

    public static void FindOccurranceOfCharUsingCalc(){
        givenInput = givenInput.toLowerCase();
        int actualLength = givenInput.length();
        String modifiedInput = givenInput.replaceAll(findChar.toString(), "");
        int expectedLength = modifiedInput.length();
        int FinalLength = actualLength - expectedLength;
        System.out.println("There are "+FinalLength+" occurrance exist in the given input!");
    }

    public static void main(String[]args){
        GetInputFromUser();
        // FindOccurranceOfChar();
        FindOccurranceOfCharUsingCalc();
    }
}
