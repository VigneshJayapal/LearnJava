package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class FindANumberFromStringAndAddItCopy {

    public static String givenInput;
    public static int finalValue;

    public static void GetUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        givenInput = scanner.nextLine();
    }

    public static void FindANumberAndAddIt(){
        char[] charArray = givenInput.toCharArray();
        for(Character ch: charArray){
            if(Character.isDigit(ch)){
//                finalValue = finalValue + (ch - '0'); or
                finalValue = finalValue + Character.getNumericValue(ch);
            }
        }
        System.out.println("Consolidated digit value from the given string is: "+finalValue);
    }


    public static void main(String[]args){
        GetUserInput();
        FindANumberAndAddIt();
    }
}
