package com.learnJava.InterviewQuestionForJava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindSmallestElementInArrayCopy {

    public Integer[] givenArray = {100,220,330,4,50,67,72,89,90};

    public void UsingArraysFunction(){
        Arrays.sort(givenArray);
        System.out.println("Smallest value in an Array is: "+givenArray[0]);
    }

    public void UsingJavaIteration(){
        Integer minIntegerValue = Integer.MAX_VALUE;
        for (Integer i: givenArray){
            if(i<minIntegerValue){
                minIntegerValue = i;
            }
        }
        System.out.println("Smallest value in an Array is: "+minIntegerValue);
    }

    public void UsingCollections(){
        List<Integer> arrayList = Arrays.asList(givenArray);
        Collections.sort(arrayList);
        int smallValue = arrayList.get(0);
        System.out.println("Smallest value in an Array is: "+smallValue);
    }

    public void FindHighestElementInArray(){
        Integer largeValue = Integer.MIN_VALUE;
        for(Integer i: givenArray){
            if(i>largeValue){
                largeValue = i;
            }
        }
        System.out.println("Highest value in an Array is: "+largeValue);
    }

    public static void main(String[]args){
        FindSmallestElementInArrayCopy smallArray = new FindSmallestElementInArrayCopy();
        smallArray.UsingArraysFunction();
        smallArray.UsingJavaIteration();
        smallArray.UsingCollections();
        smallArray.FindHighestElementInArray();
    }
}
