package com.learnJava.InterviewQuestionForJava;

import java.awt.*;
import java.util.Scanner;

public class RemoveLeadingAndTrialingSpaceCopy {
    public static String givenInput;

    public static void GetUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to be removed with leading space: ");
        givenInput = scanner.nextLine();
    }
    public static void UsingTrimFunction(){
        if(givenInput.contains(" ")){
//  Removes leading and trialing space
            System.out.println(givenInput.trim());
        } else{
            System.out.println(givenInput);
        }
    }

    public static void UsingStripFunction(){
        if(givenInput.contains(" ")){
//  Removes leading and trialing space - This method may be used to strip white space from the beginning and end of a string.
            System.out.println(givenInput.strip());

//  Removes leading space - This method may be used to trim white space from the beginning of a string.
//            System.out.println(givenInput.stripLeading());

//  Removes trailing space - This method may be used to trim white space from the end of a string.
//            System.out.println(givenInput.stripTrailing());

// Incidental white space is often present in a text block to align the content with the opening delimiter.
//            System.out.println(givenInput.stripIndent());
        } else{
            System.out.println(givenInput);
        }
    }

    public static void UsingRegularExpression(){
        if(givenInput.contains(" ")){
//  Removes both leading and trailing white space - "^\s+|\s+$"
//            String newValue= givenInput.replaceAll("^\\s+|\\s+$","");

//  Removes leading white space - ^\\s+
//            String newValue = givenInput.replaceAll("^\\s+", "");

//  Removes trailing white space - \\s+$
            String newValue = givenInput.replaceAll("\\s+$","");
            System.out.println(newValue);
        } else{
            System.out.println(givenInput);
        }
    }

    public static void RemoveUnwantedSpaceBetweenSentences(){
        String newValue = givenInput.trim().replaceAll("\\s+"," ");
        System.out.println(newValue);
    }

    public static void main(String[]args){
        GetUserInput();
//        UsingTrimFunction();
//        UsingStripFunction();
//        UsingRegularExpression();
        RemoveUnwantedSpaceBetweenSentences();
    }
}
