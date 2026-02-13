package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class FindPositionOfAlphabets {

    public static void findPositionOfAlphabets(){
        Scanner scanner = new Scanner(System.in);
        char charVal = scanner.next().charAt(0);

/* //      This is for Lower Alphabets
        charVal = Character.toLowerCase(charVal);
        int asciiValue = (int)charVal;
        int finalSmallLetterValue = asciiValue - 96;
        System.out.println(finalSmallLetterValue);*/

//      This is for Higher Alphabets
        charVal = Character.toUpperCase(charVal);
        int asciiValue1 = (int)charVal;
        int finalCapsLetterValue = asciiValue1 - 64;
        System.out.println(finalCapsLetterValue);
    }
    public static void main(String[] args) {
        findPositionOfAlphabets();
    }
}
