package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class ReverseAWordInSentenceCopy{
        public static String givenInput;
        public static void GetUserInput(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Sentence to be reversed: ");
            givenInput = scanner.nextLine();
        }

        public static void UsingJavaIteration(){
            String[] splitString = givenInput.split(" ");
            String reversedString = "";
            for(int i=splitString.length-1;i>=0;i--){
                reversedString=reversedString+splitString[i]+" ";
            }
            System.out.println(reversedString);
        }

        public static void UsingJavaInbuiltFunction(){
            StringBuilder result = new StringBuilder();
            StringBuilder word = new StringBuilder();
            for(int i=givenInput.length()-1;i>=0;i--){
                char ch = givenInput.charAt(i);

                if(ch!=' '){
                    word.insert(0,ch);
                } else {
                    result.append(word).append(" ");
                    word.setLength(0);
                }
            }
            result.append(word);
            System.out.println(result.toString());
        }

        public static void main(String []args){
            GetUserInput();
            UsingJavaIteration();
            UsingJavaInbuiltFunction();
        }
}
