package com.learnJava.InterviewQuestionForJava;

import java.util.HashSet;
import java.util.Set;

public class FindADuplicateAndReplace {

    String given = "softwaretesting";
    public void findDuplicates(){
        Set<Character> removeDuplicates = new HashSet<>();
        char[] charArray = given.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for(char c:charArray){
            if(removeDuplicates.contains(c)){
                stringBuilder.append("*");
            } else {
                removeDuplicates.add(c);
                stringBuilder.append(c);
            }
        }
        System.out.println("Original String: "+ given);
        System.out.println("Final String:"+ stringBuilder);
    }

    public static void main(String []args){
        FindADuplicateAndReplace find = new FindADuplicateAndReplace();
        find.findDuplicates();
    }
}
