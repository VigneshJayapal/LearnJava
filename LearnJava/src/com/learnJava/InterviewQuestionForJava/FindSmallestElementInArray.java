package com.learnJava.InterviewQuestionForJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSmallestElementInArray {

    static Integer[] givenValue = {5,7,3,4,1,2,6};
    static Integer smallest= Integer.MAX_VALUE;

    public static void usingLoopingConcept(){
        for(int i=0; i<givenValue.length; i++){
           if(givenValue[i]<smallest){
               smallest=givenValue[i];
           }
        }
        System.out.println(smallest);
    }

    public static void usingArrayConcept(){
        Arrays.sort(givenValue);
        System.out.println(givenValue[0]);
    }

    public static void usingJavaCollections(){
        List<Integer> sortNumber = new ArrayList<>();
        for (int i=0; i<givenValue.length; i++) {
            sortNumber.add(givenValue[i]);
        }
        Collections.sort(sortNumber);
        System.out.println(sortNumber.get(0));
    }

    public static void main(String [] args){
//        usingLoopingConcept();
//        usingArrayConcept();
        usingJavaCollections();
    }
}
