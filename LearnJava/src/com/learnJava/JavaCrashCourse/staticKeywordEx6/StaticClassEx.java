package com.learnJava.JavaCrashCourse.staticKeywordEx6;

//Static is not allowed in class, when if it is not a nested class
public class StaticClassEx {
//    It is a class which Object cannot be created and also cannot be Inherited
//    These class are used as a container of member of static variables, methods, constructor and others

// when class is not a static then constructor should not be static
    public StaticClassEx(){
        System.out.println("Showing examples!");
    }
//    Static variable declaration
    public static Integer length = 5;

    public static Integer breath = 3;

//    Static Method
    public static void calculation(){
      System.out.println("Result: "+ length*breath);
    }


    // Below is the nested class - class inside class, which support static class
    public static class AdditionalEx{
        public static Integer height = 10;
        public static Integer weight = 20;

        public static void calculation1(){
            System.out.println("Result: "+ height*weight);
        }

        public static void main(String [] args){
            calculation1();
        }
    }

    public static void main (String [] args){
        calculation();
        AdditionalEx.calculation1();
    }

}
