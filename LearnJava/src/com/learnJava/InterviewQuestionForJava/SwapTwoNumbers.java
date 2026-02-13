package com.learnJava.InterviewQuestionForJava;

public class SwapTwoNumbers {
    /*
    * Swapping will be achieved by two ways
    *   Using Third Variable
    *   Using Arithmetic Operations*/

    static Integer amount1 = 100;
    static Integer amount2 = 200;
    static Integer amount3 = null;

    public static void swapNumbersWithvariable(){
        System.out.println("Before swapping the value is:");
        System.out.println("Amount1 value: "+amount1);
        System.out.println("Amount2 value: "+amount2);

        System.out.println("After swapping the value is:");
        amount3 = amount1;
        amount1 = amount2;
        System.out.println("Amount1 value: "+amount1);
        amount2 = amount3;
        System.out.println("Amount2 value: "+amount2);
    }

    public static void swapNumberwithArithmeticOps(){
/*//        Below with Addition and Subtraction
        System.out.println("Before swapping the value is:");
        System.out.println("Amount1 value: "+amount1);
        System.out.println("Amount2 value: "+amount2);

        amount1 = amount1-amount2;
        amount2 = amount1+amount2;
        amount1 = amount2-amount1;
        System.out.println("After swapping the value is:");
        System.out.println("Amount1 value: "+amount1);
        System.out.println("Amount2 value: "+amount2);*/

//        Below with Multiplication and Division
        System.out.println("Before swapping the value is:");
        System.out.println("Amount1 value: "+amount1);
        System.out.println("Amount2 value: "+amount2);

        amount1 = amount1 * amount2;
        amount2 = amount1 / amount2;
        amount1 = amount1 / amount2;
        System.out.println("After swapping the value is:");
        System.out.println("Amount1 value: "+amount1);
        System.out.println("Amount2 value: "+amount2);

    }

    public static void main(String [] args){
//        swapNumbersWithvariable();
        swapNumberwithArithmeticOps();
    }
}
