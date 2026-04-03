package com.learnJava.InterviewQuestionForJava;

import java.util.*;

public class FindMissingAlphabetsFromStringCopy {

    public static String givenText;
    public static void GetUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        givenText = scanner.nextLine();
    }

    public static void FindMissingAlphabets(){
        givenText = givenText.toLowerCase();
        String[] userArray = givenText.split("");
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabetArray = alphabets.split("");
        HashSet<String> set1 = new HashSet<String>(Arrays.asList(userArray));
        HashSet<String> set2= new HashSet<String>(Arrays.asList(alphabetArray));
        set2.removeAll(set1);
        System.out.println(set2.toString());
    }

    public static void main(String[]args){
        GetUserInput();
        FindMissingAlphabets();
    }
}
