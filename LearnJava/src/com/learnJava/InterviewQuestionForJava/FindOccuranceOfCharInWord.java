package com.learnJava.InterviewQuestionForJava;


public class FindOccuranceOfCharInWord {

/*
*   Find the occurrence of Character in a given String
*   input given = "PRANAV"
*   to find = A
*   occurrence = 2
*
*
*   Method1 using Iterations
*   Method2 using Without Iteration
*       1. Convert the input to a specific uniform format
*       2. find the length of actual input
*       3. replace the toFind char with empty string
*       4. find the length after replacing
*       5. Occurrence = actual Length - Length after replacing*/

//    Method1 using Iteration
    static String given = "Pranav";
    static char toFind = 'a';
    static int occurrence = 0;

    public static void usingIteration(){
        String lowCase = given.toLowerCase();
        for(int i=0; i<lowCase.length(); i++){
            if(lowCase.charAt(i)==toFind){
                occurrence=occurrence+1;
            }
        }
        System.out.println("Occurance count :"+occurrence);
    }

    public static void withoutUsingIteration(){
        String upperCase = given.toUpperCase();
        String upperfindVal = String.valueOf(Character.toUpperCase(toFind));

        String replacedLength = upperCase.replace(upperfindVal, "");
        int finalReplacedLength = replacedLength.length();

        int finalLength = upperCase.length() - finalReplacedLength;
        System.out.println("Occurance count: "+finalLength);
    }

    public static void main(String[] args) {
//        usingIteration();
        withoutUsingIteration();
    }
}
