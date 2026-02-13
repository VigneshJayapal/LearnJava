package com.learnJava.JavaCrashCourse.polymorphismEx8;

public class PolymorphismOverridingExParent {

    public void familyProperty(){
        System.out.println("Family property should belong to child!");
    }

    public void familyProperty(String condition){
        System.out.println("Family property should belong to child after his marriage!");
    }

    public void familyProperty(Integer age, String condition){
        System.out.println("Family property should belong to child who marries relatives daughter!");
    }

}
