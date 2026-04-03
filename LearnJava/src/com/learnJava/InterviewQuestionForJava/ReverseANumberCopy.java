package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class ReverseANumberCopy {

    public void UsingJavaIteration(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        Integer givenNumber = scanner.nextInt();
        int reversedNumber = 0;
        /*  🔹 Important Notes ⚠️
                    givenNumber % 10 → gets last digit
                    givenNumber / 10 → removes last digit
                    StringBuffer.reverse() → built-in method    */
        while(givenNumber!=0) {
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + givenNumber % 10;
            givenNumber = givenNumber / 10;
        }
        System.out.print("New Reversed Value is: "+reversedNumber);
    }

    public void UsingJavaReverseFunction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        Integer givenNum = scanner.nextInt();
        String value = givenNum.toString();
        StringBuffer buffer = new StringBuffer(value);
        System.out.print("New Reversed Value is: "+ buffer.reverse());
    }

    public static void main(String[]args){
        ReverseANumberCopy number = new ReverseANumberCopy();
//        number.UsingJavaIteration();
        number.UsingJavaReverseFunction();
    }
}
