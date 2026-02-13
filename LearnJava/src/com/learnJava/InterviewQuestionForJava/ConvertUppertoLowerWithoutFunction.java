package com.learnJava.InterviewQuestionForJava;

public class ConvertUppertoLowerWithoutFunction {

    /*
    *  Convert Upper Case Letter to Lower Case Letter
    *  Custom Logic
    *       Get the User's input = "PRANAV"
    *       Convert it to charArray
    *       Take the length of the charArray
    *       Iterate it to length of charArray in a loop
    *       Inside a loop check each character and verify it with ASCII value is in between 65(A) to 90(Z)
    *       if it is ascii value then add with 32 to it. ASCII Value for a to z is 97 to 122
    *       then store it in char[i]
    *       after the loop iterate and print the value    */

    public static void main(String[] args) {
        String givenString = "I Love India";
        char [] charArray = givenString.toCharArray();
        int stringLength = charArray.length;

//      Upper to Lower Character
//        for(int i=0;i<stringLength; i++){
//            if(charArray[i]>=65 && charArray[i]<=90){
//                charArray[i]= (char) (charArray[i]+32);
//            }
//        }
//        for(int i=0; i<charArray.length; i++){
//            System.out.print(charArray[i]);
//        }

//        Lower to Upper Character
        for (int i=0; i<stringLength; i++){
            if(charArray[i]>=97 && charArray[i]<=122){
                charArray[i] = (char) (charArray[i]-32);
            }
        }
        for (int i=0; i<stringLength; i++){
            System.out.print(charArray[i]);
        }
    }
}
