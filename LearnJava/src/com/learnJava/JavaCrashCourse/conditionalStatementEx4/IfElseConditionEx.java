package com.learnJava.JavaCrashCourse.conditionalStatementEx4;

public class IfElseConditionEx {

    public boolean isCupEmptyorNot = false;

    public void validateCupCondition(){
//        Conditional statement should always be in true or false condition, so we are using boolean variable to validate
//        Also if condition always satisfy true conditon by default, if condition fails then it moved to else condition
        if(isCupEmptyorNot){
            System.out.println("Fill the coffee cup!");
        } else {
            System.out.println("Drink the coffee!");
        }
    }

    public static void main(String [] args){
        IfElseConditionEx condition = new IfElseConditionEx();
        condition.validateCupCondition();
    }
}
