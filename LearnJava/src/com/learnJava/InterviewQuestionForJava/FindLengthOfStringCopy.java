package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class FindLengthOfStringCopy {

    public String givenValue;
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String Value: ");
        givenValue = scanner.nextLine();
    }

    public void UsingInbuiltFunction(){
        int lengthOfString = givenValue.length();
        System.out.println("Lenght Of String is: "+ lengthOfString);
    }

    public void UsingJavaIteration(){
        char[] charArray = givenValue.toCharArray();
        int length = 0;
        for(Character chars: charArray){
            if(chars!=null) {
                length++;
            }
        }
        System.out.println("Lenght Of String is: "+ length);
    }

    public static void main(String[]args){
        FindLengthOfStringCopy stringValue = new FindLengthOfStringCopy();
        stringValue.getUserInput();
        stringValue.UsingInbuiltFunction();
        stringValue.UsingJavaIteration();
    }
}
