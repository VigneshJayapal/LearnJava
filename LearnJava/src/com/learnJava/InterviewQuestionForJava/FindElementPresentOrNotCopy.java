package com.learnJava.InterviewQuestionForJava;

import java.util.stream.*;

public class FindElementPresentOrNotCopy {

    public int[] intArray = {1,2,3,4,5,6};
    public int findValue = 5;
    public boolean found = false;

    public void UsingJavaIteration(){
        for(Integer arrayValue: intArray){
            if(findValue==arrayValue){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Element "+findValue+" Present in the Array!");
        else
            System.out.println("Element "+findValue+" Not Present in the Array!");
    }

    public void UsingStreamFunction(){
        found = IntStream.of(intArray).anyMatch(element->element==findValue);
        if(found)
            System.out.println("Element "+findValue+" Present in the Array!");
        else
            System.out.println("Element "+findValue+" Not Present in the Array!");
    }

    public static void main(String[]args){
        FindElementPresentOrNotCopy copy = new FindElementPresentOrNotCopy();
        copy.UsingJavaIteration();
        copy.UsingStreamFunction();
    }
}
