package com.learnJava.JavaCrashCourse.constructorEx3;

public class ConstructorOverloadingExamples {

    String draw;
    Integer length;
    Integer breath;

//    Constructor Overloading may create many constructor but which got differentiated by its
//          passed in arguments/parameters
    public ConstructorOverloadingExamples(){
        System.out.println("To draw something...");
    }

    public ConstructorOverloadingExamples(String toDraw) {
        this.draw = toDraw;
    }

    public ConstructorOverloadingExamples(String toDraw, Integer itsLength, Integer itsBreath){
        this.draw = toDraw;
        this.length = itsLength;
        this.breath = itsBreath;
    }

    public void getConstructor(){
        System.out.println("To draw a: "+draw);
    }

    public void getConstructorValue(){
        System.out.println("To draw a: "+draw+" with its Length as: "+length+" and its Breath as: "+breath);
    }

    public static void main(String [] args){
        ConstructorOverloadingExamples constructorOverloadingExamples = new ConstructorOverloadingExamples();
        ConstructorOverloadingExamples constructorOverloadingExamples1 = new ConstructorOverloadingExamples("Square");
        ConstructorOverloadingExamples constructorOverloadingExamples2 = new ConstructorOverloadingExamples("Rectangle", 10, 5);
        constructorOverloadingExamples1.getConstructor();
        constructorOverloadingExamples2.getConstructorValue();
    }
}
