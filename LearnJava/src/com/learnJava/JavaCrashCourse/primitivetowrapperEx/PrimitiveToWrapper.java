package com.learnJava.JavaCrashCourse.primitivetowrapperEx;

public class PrimitiveToWrapper {
    //below we were using Long data type, so we end up with 'L' for declaring int to Long
    Long accountNumber = 1234567890L;
    Integer accountBalance = 500;
    String accountHolderName = "PRANAV";

    public void getAccountHolderName(){
        System.out.println("AccountHolderName is " + accountHolderName);
    }

    public void getAccountNumber(){
        System.out.println("AccountNumber is " + accountNumber);
    }

    public void getAccountBalance(){
        System.out.println("AccountBalance is " + accountBalance);
    }

    public static void main(String [] args){
        //Entry point of execution
        //To accessing the class method and its property, we need to create an Object
        PrimitiveToWrapper primitiveToWrapper = new PrimitiveToWrapper();
        primitiveToWrapper.getAccountBalance();
        primitiveToWrapper.getAccountHolderName();
        primitiveToWrapper.getAccountNumber();
    }

}
