package com.learnJava.PracticeSessionForJava;

import java.util.Scanner;

public class FindANumberFromStringAndAddIt {
    public static String givenInput;
    public static int finalValue = 0;


    public static void GetInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        givenInput = scanner.nextLine();
    }

    public static void FindANumberFromString() {
        String[] stringArray = givenInput.split(",");
        for (String str : stringArray) {
            StringBuilder builder = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (Character chars : charArray) {
                if (Character.isDigit(chars)) {
                    builder.append(chars);
                }
            }
            if(!builder.isEmpty()){
                finalValue =finalValue + Integer.parseInt(builder.toString());
            }
        }
        System.out.print("Final Value is: "+finalValue);
    }

    public static void UsingJavaRegExp(){
        String newValue = "";
        for(String strArray: givenInput.split(",")){
            StringBuilder builder = new StringBuilder();
            newValue = strArray.replaceAll("[^0-9]", "");
            builder.append(newValue);
            finalValue = finalValue + Integer.parseInt(builder.toString());
        }
        System.out.println("Final Value is: "+finalValue);
    }

    public static void main(String[]args){
        GetInputFromUser();
        FindANumberFromString();
        UsingJavaRegExp();
    }
}
