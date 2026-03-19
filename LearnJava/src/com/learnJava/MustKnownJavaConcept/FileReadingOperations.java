package com.learnJava.MustKnownJavaConcept;

import org.testng.annotations.Test;
import org.testng.reporters.Files;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadingOperations {

    /*
    * In Java, FileReader is used to read character data from a file (mainly text files).
          It belongs to the java.io package.

      Below are the commonly used FileReader methods.
      *     1. read() - Reads one character at a time from the file.
        Syntax
        int read()
      * Explanation
        * read() returns ASCII value of character
        * -1 means end of file


      2. read(char[] array) = Reads characters into a character array.
        Syntax
            int read(char[] cbuf)
        Explanation
           * Reads multiple characters
           * Stores them in array buffer

      3. read(char[] array, int offset, int length) = Reads characters into part of an array.
        Syntax
            int read(char[] cbuf, int off, int len)
        Explanation
            off → start position in array
            len → number of characters to read

        Summary Table
                Method	                Description
                read()	                Reads single character
                read(char[])	        Reads characters into array
                read(char[],off,len)	Reads characters with offset
                ready()	                Checks file ready for reading
                close()	                Closes the file

       * ✅ Important Interview Point
                FileReader is used for character streams, while FileInputStream is used for byte streams.

    BufferedReader methods in Java:
    *   BufferedReader in Java is used to read text from a character input stream efficiently.
    *   It reads data using a buffer, which improves performance compared to normal readers like FileReader.
    *   It belongs to the java.io package.
    *
    * Important BufferedReader Methods in Java
        1. read()
            Reads one character at a time.
        Syntax
            int read()
        Key Point
            Returns ASCII value of character
            -1 indicates end of file
        2. readLine()
            Reads one line at a time from the file.
        Syntax
            String readLine()

        Key Point
            Most commonly used method
            Returns null when file ends
        3. read(char[] cbuf, int off, int len)
                Reads characters into a part of an array.
        Syntax
                int read(char[] cbuf, int off, int len)
         Explanation
                cbuf → character buffer
                off → starting index
                len → number of characters

         Summary Table
                Method	                Description
                read()	                Reads one character
                readLine()	            Reads one line
                read(char[],off,len)	Reads characters into array
                ready()	                Checks stream readiness
                skip()	                Skips characters
                close()	                Closes stream

         Important Interview Difference
                Feature	            FileReader	    BufferedReader
                Speed	            Slow	        Fast
                Buffer	            No	            Yes
                readLine() support	❌ No	        ✅ Yes
                Usage	            Small files	    Large files

         ✅ Interview Tip
             Most real-world Java programs use:
                BufferedReader br = new BufferedReader(new FileReader("file.txt"));
                    because BufferedReader is faster and supports readLine().                            */


    @Test(priority = 0, enabled = false)
    public void UsingFileReaderFunc() throws IOException {
        String location = "WriteFileUsingFileWriter.txt";

        FileReader fileReader = new FileReader(location);
//      1.Reads Everything from the file using readAllLines function
//        System.out.println(fileReader.readAllLines());

//      2. Reads Everything from the file using looping
//        int i;
//        while((i=fileReader.read())!=-1){
//            System.out.print((char)i);
//        }
//        fileReader.close();

////      3. Reads Everything from the file using char[]
//        FileReader fileReader1 = new FileReader(location);
//        char[] character = new char[100];
//        System.out.println(fileReader1.read(character));
//        fileReader1.close();

//      4. Reads Certain position of the content with Start and end value.
        FileReader fileReader2 = new FileReader(location);
        BufferedReader br= new BufferedReader(fileReader2);
        char[] character1 = new char[27];
        br.read(character1, 0, 27);
        System.out.println(character1);
        br.close();
        fileReader2.close();

    }

    @Test(priority = 1, enabled = true)
    public void UsingBufferReaderFunc() throws IOException {
        String location = "WriteFileUsingFileWriter.txt";
        FileReader fileReader = new FileReader(location);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
        fileReader.close();
    }
}
