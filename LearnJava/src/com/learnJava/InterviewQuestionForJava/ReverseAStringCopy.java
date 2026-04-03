package com.learnJava.InterviewQuestionForJava;

import java.util.*;

public class ReverseAStringCopy{

    /* AIM for the program: Reverse a String
    *   1. Using Java Iteration
    *   2. Using StringBuilder
    *   3. Using StringBuffer
    *   4. Using Java Collection */

//    1. Using Java Iteration
    /*  a. Convert a given string to a character of an array
    *   b. Calculate the length of the given string and use for loop for the iteration
    *   c. write the reverse looping logic to reverse the string value
    *   d. print the reversed string value  */

    public void UsingJavaIteration(){
        String givenText = "UsingJavaIteration";
        char[] charArray = givenText.toCharArray();
        String reversedText = "";
        for(int i=charArray.length-1;i>=0;i--){
            reversedText = reversedText+charArray[i];
        }
        System.out.print(reversedText);
    }

//    2. Using StringBuffer
    /*   a. Create an object for the StringBuffer
    *    b. using reverse inbuild function to reverse the string
    *    c. print the statement   */
    public void UsingStringBuffer(){
        String givenText = "UsingStringBuffer";
//        StringBuffer stringBuffer = new StringBuffer(givenText); or
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(givenText);
        stringBuffer.reverse();
        System.out.print(stringBuffer);
    }

//      3. Using StringBuilder
    /*    a. Create an object for the StringBuilder
     *    b. using reverse inbuild function to reverse the string
     *    c. print the statement   */
    public void UsingStringBuilder(){
        String givenText = "UsingStringBuilder";
//        StringBuilder stringBuilder = new StringBuilder(givenText); or
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(givenText);
        stringBuilder.reverse();
        System.out.print(stringBuilder);
    }

//      4. Using JavaCollection
    /*      a. Convert the String into Character of an array
    *       b. Calculate the length of the string and iterate it using for loop
    *       c. By using collection we need to add iterated value to a list
    *       d. use collection reverse function to reverse the string
    *       e. print the statement */
    public void UsingJavaCollection(){
        String givenText = "UsingJavaCollection";
        char[] charsArray = givenText.toCharArray();
        List<Character> charList = new ArrayList<>();
        for(Character chars: charsArray){
            charList.add(chars);
        }
        Collections.reverse(charList);
        ListIterator listIterator = charList.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next());
        }
    }

    public static void main(String[]args){
        ReverseAStringCopy reverseAStringCopy = new ReverseAStringCopy();
//        reverseAStringCopy.UsingJavaIteration();
//        reverseAStringCopy.UsingStringBuffer();
//        reverseAStringCopy.UsingStringBuilder();
        reverseAStringCopy.UsingJavaCollection();
    }
}