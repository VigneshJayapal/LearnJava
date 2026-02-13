package com.learnJava.InterviewQuestionForJava;

import java.util.Scanner;

public class ReverseAInteger {

    static Integer givenNum = 876556789;
    static Integer reversedNum = 0;

    public static void main (String [] args){

        /*Here we can get any inputs from the user with Scanner class*/
/*        static Integer givenNum = 0;
/*        Scanner scanner = new Scanner(System.in);
        givenNum = scanner.nextInt();*/

        while(givenNum!=0) {
            reversedNum = reversedNum * 10;
            reversedNum = reversedNum + givenNum % 10;
            givenNum = givenNum/10;
        }

        System.out.println(reversedNum);
    }
}
