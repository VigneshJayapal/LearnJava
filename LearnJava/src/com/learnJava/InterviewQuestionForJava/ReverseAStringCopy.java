package com.learnJava.InterviewQuestionForJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAStringCopy {

    /*There were 3 ways we can perform the above task
    * Using Inbuilt Function
    * Using Looping Function
    * Using Java Collections */

//    Using Inbuilt Function
    public static void usingInbuiltFunction() {
        String given = "PRANAV";
/*//      Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(given);
        System.out.println("String Reverse: "+stringBuffer.reverse());*/

//      Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(given);
        System.out.println("String Reverse: "+stringBuilder.reverse());
    }

    public static void usingLoopingFunctions(){
        String given = "PRANAV";
        char[] charArray = given.toCharArray();
        String reversed = "";
        for(int i=charArray.length-1; i>=0; i--){
            reversed = reversed+charArray[i];
        }

        System.out.println(reversed);
    }

    public static void usingJavaCollections(){
        String given = "PRANAV";
        char[] charArray = given.toCharArray();

        List<Character> charList = new ArrayList<>();
        for(Character character: charArray){
            charList.add(character);
        }
        Collections.reverse(charList);

        ListIterator<Character> reverseChar = charList.listIterator();
        while(reverseChar.hasNext()){
            System.out.print(reverseChar.next());
        }
    }

    public static void main(String [] args){
//        usingInbuiltFunction();
//        usingLoopingFunctions();
        usingJavaCollections();
    }
}
