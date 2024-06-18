package com.learnJava.JavaCrashCourse.returnTypeEx;

public class ReturnTypeExample {

/* Scenario:
        Someone have to give me amount, I asked my son to collect the amount
        After collecting amount he needs to return me the amount
     */

    Integer amountToBeCollected = 100000;

    public Integer sentSonToCollectAmount(){
        System.out.println("Collecting amount from someone: "+amountToBeCollected);
        return amountToBeCollected;
    }

    public static void main(String [] args){
        ReturnTypeExample returnTypeExample = new ReturnTypeExample();
        Integer mySonCollectedAmount = returnTypeExample.sentSonToCollectAmount();
        System.out.println("Amount collected by My Son: "+ mySonCollectedAmount);
    }

}
