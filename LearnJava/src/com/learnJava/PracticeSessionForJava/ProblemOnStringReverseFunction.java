package com.learnJava.PracticeSessionForJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemOnStringReverseFunction {

    public static String givenInput = "Hello";
    public static String reversedStr = "";

    public static void ReverseAStringWithoutInbuiltFunc(){
       char[] charArray = givenInput.toCharArray();
       for(int i=charArray.length-1;i>=0;i--){
           reversedStr = reversedStr + charArray[i];
       }
       System.out.println("Reversed String value: "+reversedStr);
    }

    public static void UsingStringBuilder(){
        StringBuilder builder = new StringBuilder(givenInput);
        builder.reverse();
        System.out.println("Reversed String value: "+builder);
    }

    public static void UsingJavaCollection(){
        char[] charArray = givenInput.toCharArray();
        List<Character> charList = new ArrayList<Character>();
        StringBuilder result = new StringBuilder();
        for(Character ch: charArray){
            charList.add(ch);
        }
        Collections.reverse(charList);
        for(Character character:charList){
            result.append(character);
        }
        System.out.print("Reversed String Value: "+result.toString());
    }

    public static void main(String[]args){
        ReverseAStringWithoutInbuiltFunc();
        UsingStringBuilder();
        UsingJavaCollection();
    }
}
