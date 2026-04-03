package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class FindaNumberOfVowelsInNameCopy {

    public static String givenInput;
    public static int findValue;

    public static void GetUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        givenInput = scanner.nextLine();
    }

    public static void FindNumberOfVowelsInName(){
        char[] charArray = givenInput.toCharArray();
        for(Character ch: charArray){
            if((ch.equals('A'))||(ch.equals('E'))||(ch.equals('I'))||(ch.equals('O'))||
                    (ch.equals('U'))||(ch.equals('a'))||(ch.equals('e'))||(ch.equals('i'))||
                    (ch.equals('o'))||(ch.equals('u'))){
                findValue++;
            }
        }
        System.out.println("There are "+findValue+" number of vowels exist from the given input!");
    }

    public static void main(String[]args){
        GetUserInput();
        FindNumberOfVowelsInName();
    }
}
