package com.learnJava.InterviewQuestionForJava;

public class ReplaceVowelsWithSpecialSignsCopy {

    /*  Write a solution to replace vowels with special signs using below methods,
    *       1. Using Java Iteration
    *       2. Using Regular Expression */

//    1. Using Java Iteration
            /*  a. Convert the given string to a Character of an array
            *   b. Calculate the length of the given string and do the iteration with For loop
            *   c. Inside For loop verify the character is matching with vowels[AEIOUaeiou] and replace with '*'
            *   d. Outside the For loop print the replaced string */

    public static String givenText = "I MISS MAHENDRA SINGH DHONI";

    public void UsingJavaIteration(){
        char[] charArray = givenText.toCharArray();
        for(int i=0;i<givenText.length();i++){
            if(givenText.charAt(i)=='A'||givenText.charAt(i)=='E'||givenText.charAt(i)=='I'||givenText.charAt(i)=='O'||
            givenText.charAt(i)=='U'||givenText.charAt(i)=='a'||givenText.charAt(i)=='e'||givenText.charAt(i)=='i'||givenText.charAt(i)=='o'||
                    givenText.charAt(i)=='u'){
                charArray[i]='*';
            }
        }
        for(int j=0;j<charArray.length;j++){
            System.out.print(charArray[j]);
        }
    }

//    2. Using Regular Expression
    public void UsingRegularExp(){
        String replacedText = givenText.replaceAll("[AEIOUaeiou]","#");
        System.out.print(replacedText);
    }

//    3. Replacing Java's special symbol '$' or '^' with escaping characters
    public void ReplacingJavaSymbol(){
        String text = givenText.replaceAll("[AEIOUaeiou]","\\$");
        System.out.print(text);
    }

    public static void main(String[]args){
        ReplaceVowelsWithSpecialSignsCopy copy = new ReplaceVowelsWithSpecialSignsCopy();
//        copy.UsingJavaIteration();
//        copy.UsingRegularExp();
        copy.ReplacingJavaSymbol();
    }
}
