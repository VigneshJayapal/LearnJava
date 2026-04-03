package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class FindPositionOfAlphabetsCopy {

    public void UsingAsciiValuesForLowerCase(){
//      Get the value input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Alphabet and find its position");
        char givenValue = scanner.next().charAt(0);
        givenValue = Character.toLowerCase(givenValue);
        int asciiValue = (int)givenValue;
        int finalValue = asciiValue-96;
        System.out.println("Position of the given alphabet: "+finalValue);
    }

    public void UsingAsciiValuesForUpperCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the alphabet and find its position: ");
        char inputValue = scanner.next().charAt(0);
        inputValue = Character.toUpperCase(inputValue);
        int asciiValue = (int)inputValue;
        int finalValue = asciiValue-64;
        System.out.println("Position of the given alphabet: "+finalValue);
    }

    public static void main(String[]args){
        FindPositionOfAlphabetsCopy copy = new FindPositionOfAlphabetsCopy();
//        copy.UsingAsciiValuesForLowerCase();
        copy.UsingAsciiValuesForUpperCase();
    }
}
