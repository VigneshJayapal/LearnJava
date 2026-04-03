package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class ConvertUppertoLowerWithoutFunctionCopy {
    public static String givenInput;

    public static void GetUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        givenInput = scanner.nextLine();
    }

    public static void ConvertLowerToUpper(){
        char[] charArray = givenInput.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if((charArray[i]>=96) && (charArray[i]<=122)){
                charArray[i] = (char) (charArray[i]-32);
            }
        }
        for(char ch: charArray){
            System.out.print(ch);
        }
    }

    public static void ConvertUpperToLower(){
        char[] charArray= givenInput.toCharArray();
        for(int j=0; j<charArray.length; j++){
            if((charArray[j]>=65) && (charArray[j]<=90)){
                charArray[j] = (char) (charArray[j]+32);
            }
        }
        for (char ch: charArray){
            System.out.print(ch);
        }
    }

    public static void main(String[]args){
        GetUserInput();
        ConvertLowerToUpper();
        ConvertUpperToLower();
    }
}
