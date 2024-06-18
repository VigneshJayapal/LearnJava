package com.learnJava.JavaCrashCourse.exceptionHandlingInJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinallyBlockExample {

    public static String fileName = "E:\\LearnJava\\LearnJava\\src\\com\\learnJava\\JavaCrashCourse\\exceptionHandlingInJava\\Readme.txt";
    public static BufferedReader br = null;
    public static FileReader fr = null;

    public static void main(String [] args){
        try{
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String currentLine;

            while((currentLine = br.readLine())!=null){
                System.out.println(currentLine);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(fr!=null){
                    fr.close();
                }
                if(br!=null){
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
