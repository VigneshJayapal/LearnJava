package com.learnJava.InterviewQuestionForJava;

public class SwapTwoNumbersCopy {

    public int number1 = 2000;
    public int number2 = 5000;

    public void UsingThirdVariable(){
        System.out.println("Before swap - Value for Number1: "+number1);
        System.out.println("Before swap - Value for Number2: "+number2);
        int number3 = number1;
        int number1 = number2;
        int number2 = number3;
        System.out.println("After swap - Value for Number1: "+number1);
        System.out.println("After swap - Value for Number2: "+number2);
    }

    public void UsingArithmeticOpertaion1(){
        System.out.println("Before swap - Value for Number1: "+number1);
        System.out.println("Before swap - Value for Number2: "+number2);
        number1 = number1-number2;
        number2 = number1+number2;
        number1 = number2-number1;
        System.out.println("After swap - Value for Number1: "+number1);
        System.out.println("After swap - Value for Number2: "+number2);
    }

    public void UsingArithmethicOperation2(){
        System.out.println("Before swap - Value for Number1: "+number1);
        System.out.println("Before swap - Value for Number2: "+number2);
        number1 = number1*number2;
        number2 = number1/number2;
        number1 = number1/number2;
        System.out.println("After swap - Value for Number1: "+number1);
        System.out.println("After swap - Value for Number2: "+number2);
    }

    public static void main(String[]args){
        SwapTwoNumbersCopy copy  = new SwapTwoNumbersCopy();
//        copy.UsingThirdVariable();
//        copy.UsingArithmeticOpertaion1();
        copy.UsingArithmethicOperation2();
    }
}
