package com.learnJava.JavaCrashCourse.staticKeywordEx6;

public class StaticVariableEx {
    //Below is a Static variable, which can be accessed anywhere and its holds final updated/affected value.
    public static Integer accountBalance = 0;
    //Below is non static variable, which can be access within the object
    public String accountHolderName = null;

    public void method2(){

    }

    public static void main(String [] args){
        StaticVariableEx object1 = new StaticVariableEx();
        object1.accountBalance = 1000;
        object1.accountHolderName = "VARU";

        StaticVariableEx object2 = new StaticVariableEx();
        object2.accountBalance = 2000;
        object2.accountHolderName = "PRANAV";

        System.out.println("Account balance is: "+object1.accountBalance);
        System.out.println("Account Holder is: "+object1.accountHolderName);
        System.out.println("Account balance is: "+object2.accountBalance);
        System.out.println("Account Holder is: "+object2.accountHolderName);
    }

   /* output:
//   just showing below how static variable holds last updated value across the class
    Account balance is: 2000
    Account Holder is: VARU
    Account balance is: 2000
    Account Holder is: PRANAV*/
}
