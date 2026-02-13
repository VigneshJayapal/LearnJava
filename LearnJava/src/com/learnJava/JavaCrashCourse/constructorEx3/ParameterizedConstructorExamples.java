package com.learnJava.JavaCrashCourse.constructorEx3;

public class ParameterizedConstructorExamples {

    String animal_Name;
    String animal_Type;

//    When it is a parameterized constructor it should be parameterized
    ParameterizedConstructorExamples(String name, String type){
        animal_Name = name;
        animal_Type = type;
    }

    public void sayAboutAnimal(){
        System.out.println("Animal name is :"+ animal_Name +" & its type is :"+ animal_Type);
    }

    public static void main(String [] args){
        ParameterizedConstructorExamples parameterizedConstructorExamples1 = new ParameterizedConstructorExamples("Lion","Omnivorus");
        parameterizedConstructorExamples1.sayAboutAnimal();
        ParameterizedConstructorExamples parameterizedConstructorExamples2 = new ParameterizedConstructorExamples("Elephant", "Herbivorus");
        parameterizedConstructorExamples2.sayAboutAnimal();
    }
}
