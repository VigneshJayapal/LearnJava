package com.learnJava.InterviewQuestionForJava;

import java.util.stream.IntStream;

public class FindElementPresentOrNot {
    static Integer [] arrayValue = {1,3,5,7,9,3,1};
    static Boolean found = false;
    static Integer findValue = 3;

    public static void usingForLoopConcept(){
        for(int i= arrayValue.length;i<0;i++){
            if(arrayValue[i]==findValue){
                found = true;
                break;
            }
        }
        System.out.println("Number present: "+found);
    }

    public static void usingForEachLoopConcept(){
        for(Integer val: arrayValue){
            if(val==findValue){
                found = true;
                break;
            }
        }
        System.out.println("Number present: "+found);
    }

    public static void usingStreamFuctions(){
        int[] arrayVal = {1,3,5,7,9,3,1};
        int findval = 5;
        Boolean presentOrNot = IntStream.of(arrayVal).anyMatch(element->element==findval);
        System.out.println(presentOrNot);
    }

    public static void main(String[] args) {
//        usingForLoopConcept();
//        usingForEachLoopConcept();
        usingStreamFuctions();
    }
}
