package com.learnJava.JavaCrashCourse.conditionalStatementEx4;

public class IfElseIfConditionEx {

    public Integer examGrade = -1;

    public void defineExamGrade(){
        if(examGrade>0 && examGrade<35){
            System.out.println("FAIL!");
        } else if(examGrade>35 && examGrade<60){
            System.out.println("BORDER PASS!");
        } else if(examGrade>60 && examGrade<80){
            System.out.println("SECOND CLASS!");
        } else if(examGrade>80){
            System.out.println("FIRST CLASS!");
        } else {
            System.out.println("ABSENT FOR EXAM!");
        }
    }

    public static void main(String [] args){
        IfElseIfConditionEx conditionEx = new IfElseIfConditionEx();
        conditionEx.defineExamGrade();
    }
}
