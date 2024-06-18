package com.learnJava.JavaCrashCourse.conditionalStatement;

public class SwitchCaseExample {

    public String guessFruitColor = "MANGO";

    public void validateFruitColor(){
        switch(guessFruitColor){
            case "APPLE":
                System.out.println("Fruit color is RED!");
                break;
            case "MANGO":
                System.out.println("Fruit color is YELLOW!");
                break;
            case "GRAPE":
                System.out.println("Fruit color is BLACK!");
                break;
            case "JACKFRUIT":
                System.out.println("Fruit color is GREEN!");
                break;
            default:
                System.out.println("Not able to find the Fruit Color!");
        }
    }

    public static void main(String [] args){
        SwitchCaseExample example = new SwitchCaseExample();
        example.validateFruitColor();
    }
}
