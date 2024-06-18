package com.learnJava.JavaCrashCourse.polymorphismEx;

public class PolymorphismOverloadingEx {
//    Static/Compile time/Early binding - Overloading polymorphism
//    Aspects of Overloading (which always applies on method level):
//    1. Method name should be same and its should be in the same class
//    2. Method should be differentiated with passed in parameters, either parameter data type, or adding more parameter
//    3. Return type can be anything
//    4. Access modifier can be anything
//    5. Throwing exception can be anything
//    6. Private method can be overloaded
    public void bankRule(){
        System.out.println("Customer should maintain 5000Rs min balance!");
    }

    public void bankRule(String name, String age){
        System.out.println("Customer should provide name and age proof!");
    }

    public void bankRule(String idProof, Float minimumBal){
        System.out.println("Customer should provide idProof and maintain 1000Rs min balance!");
    }

    public void bankRule(String idProof){
        System.out.println("Customer should provide idProof!");
    }

    public static void main(String []args){
        PolymorphismOverloadingEx example = new PolymorphismOverloadingEx();
        example.bankRule("provided Aadhar!");
        example.bankRule();
        example.bankRule("PRANAV", "2");
        example.bankRule("provided aadhar proof", 10000f);
    }

}
