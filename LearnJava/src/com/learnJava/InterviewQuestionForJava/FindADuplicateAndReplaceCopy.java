package com.learnJava.InterviewQuestionForJava;

import java.util.HashSet;
import java.util.Scanner;

public class FindADuplicateAndReplaceCopy {
    public static String givenText;
    public static void GetInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        givenText = scanner.nextLine();
    }

    public static void FindADuplicateAndReplace(){
        try {
            char[] charArray = givenText.toCharArray();
            HashSet<Character> removeDuplicates = new HashSet<Character>();
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < charArray.length; i++) {
                if (removeDuplicates.contains(charArray[i])) {
                    builder.append("*");
                } else {
                    removeDuplicates.add(charArray[i]);
                    builder.append(charArray[i]);
                }
            }
            System.out.println("Original String: " + givenText);
            System.out.println("Modified String: " + builder);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[]args){
        GetInputFromUser();
        FindADuplicateAndReplace();
    }
}
