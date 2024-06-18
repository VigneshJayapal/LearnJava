package com.learnJava.JavaCrashCourse.exceptionHandlingInJava;

public class MultipleTryCatchExample {

    public static int a = 0;
    public static int b = 10;

    public static void main(String []args){

//      Multiple try catch block examples
        try{
            int result = b/a;
            System.out.println(result);
        }
//        Exception is the Parent for all the exception, either if is Arithmetic or Null Pointer which is child to Exception class
//        Exception class should declare at the last, if it declared at the beginning then rest other declaration below will be not be reachable, then that will blow out error.
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception needs to handled here!");
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException needs to handled here!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

/*
output:
        E:\LearnJava\LearnJava\out\production\LearnJava com.learnJava.JavaCrashCourse.exceptionHandlingInJava.MultipleTryCatchExample
        Arithmetic exception needs to handled here!
*/
