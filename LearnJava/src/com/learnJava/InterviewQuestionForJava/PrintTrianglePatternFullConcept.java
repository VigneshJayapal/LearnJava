package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class PrintTrianglePatternFullConcept {

    public int start = 0;
    public int end = 0;
    public int userInput = 0;

    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        userInput = scanner.nextInt();
    }
    public void UsingStarPattern(){
        for(start=0;start<userInput;start++){
            for(end=0;end<=start;end++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void UsingNumericPattern(){
        for(start=0;start<userInput;start++){
            for(end=0;end<=start;end++){
                System.out.print(end+1+" ");
            }
            System.out.println();
        }
    }

    public void UsingInverseStarPattern(){
        for(start=userInput;start>=1;start--){
            for(end=1;end<=start;end++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void UsingInverseNumericPattern(){
        for(start=userInput;start>=1;start--){
            for(end=1;end<=start;end++){
                System.out.print(end+" ");
            }
            System.out.println();
        }
    }

    public void RightInverseStarPattern(){
        for(start=userInput;start>=1;start--){
            for(int space=0;space<userInput-start;space++){
                System.out.print(" ");
            }
            for(end=1;end<=start;end++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void RightInverseNumericPattern(){
        for(start=userInput;start>=1;start--){
            for(int space=0; space<userInput-start;space++){
                System.out.print(" ");
            }
            for(end=1;end<=start;end++){
                System.out.print(end);
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        PrintTrianglePatternFullConcept pattern = new PrintTrianglePatternFullConcept();
        pattern.getUserInput();
        pattern.UsingStarPattern();
        pattern.UsingNumericPattern();
        pattern.UsingInverseStarPattern();
        pattern.UsingInverseNumericPattern();
        pattern.RightInverseStarPattern();
        pattern.RightInverseNumericPattern();
    }
}
