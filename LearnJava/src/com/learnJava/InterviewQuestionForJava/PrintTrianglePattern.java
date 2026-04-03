package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class PrintTrianglePattern {

    public static void main(String [] args) {
        /*Star Pattern*/
//        int numberOfLines = 5;
//        int row = 0;
//        int column = 0;
//        for(row=0; row<numberOfLines; row++){
//            for(column=0; column<=row; column++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*Numeric Pattern - getting input from User*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int limit = scanner.nextInt();
        int numberOfLines=5;

        int row = 0;
        int column = 0;
        for(row=0; row<limit; row++){
            for(column=0; column<=row; column++) {
                System.out.print(numberOfLines+" ");
                numberOfLines = numberOfLines+1;
            }
            System.out.println();
        }

    }
}
