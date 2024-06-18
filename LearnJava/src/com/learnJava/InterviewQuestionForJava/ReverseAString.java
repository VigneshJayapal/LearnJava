package com.learnJava.InterviewQuestionForJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {

    public void usingInbuiltFunc(){
        String given = "PRANAV";
        StringBuffer buffer = new StringBuffer();
        buffer.append(given);
        System.out.println(buffer.reverse());
    }

    public void usingLoopingFunc(){
        String given = "VANARP";
        char[] characterArray = given.toCharArray();
        String reversed="";
        for(int i=characterArray.length-1; i>=0; i--){
            reversed = reversed+characterArray[i];
        }
        System.out.println(reversed);
    }

    public void usingJavaCollection(){
        String given = "VARU";
        char [] charArray = given.toCharArray();

        List<Character> characterList = new ArrayList<Character>();
        for(Character character: charArray){
            characterList.add(character);
        }
        Collections.reverse(characterList);

        ListIterator<Character> iterator = characterList.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }

    public static void main (String [] args){
        ReverseAString reverseAString = new ReverseAString();
        reverseAString.usingInbuiltFunc();
        reverseAString.usingLoopingFunc();
        reverseAString.usingJavaCollection();
    }
}
