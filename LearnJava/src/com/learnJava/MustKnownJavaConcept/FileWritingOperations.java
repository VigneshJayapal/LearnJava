package com.learnJava.MustKnownJavaConcept;

import com.google.common.primitives.Bytes;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWritingOperations {

    /*
    * 1. Using File Writer function
    * 2. Using Buffer Writer function
    * 3. Using File Output Stream function
    * 4. Using paths
    *
    * Comparison Table
        Method              -	Data Type   -	Performance -	Use Case
        FileWriter          -	Characters  -	Medium      -	Simple text writing
        BufferedWriter      -	Characters  -	Fast        -	Large text files
        FileOutputStream    -	Bytes       -	Fast        -	Binary files
        Files / Paths	    -   Bytes       -	Very Fast   -	Modern Java applications
*
    ✅ Simple Rule to Remember
            FileWriter → Simple text
            BufferedWriter → Large text
            FileOutputStream → Binary data
            Paths / Files → Modern Java method  */

//    1. Using File Writer function
    /*  FileWriter is used to write character data directly into a file.
        It is simple and commonly used for writing text files.
     Key Points
        Writes character data
        Creates file if not exists
        Not efficient for large data    */

    @Test(priority = 0, enabled = true)
    public void UsingFileWriterFunc() throws IOException {
        String location = "WriteFileUsingFileWriter.txt";
        String content = "India Won T20 WorldCup 2026!";

        FileWriter fileWriter = new FileWriter(location);
        fileWriter.write(content);
        fileWriter.close();
    }

    /* 2. Using BufferedWriter function
            BufferedWriter is used to improve performance by writing data into a buffer first,
                then writing to the file.
        Key Points
            Faster than FileWriter
            Uses buffer memory
            Best for large text writing */
    @Test(priority = 1, enabled = true)
    public void UsingBufferedWriterFunc() throws IOException {
        String location = "WriteFileUsingBufferedWriter.txt";
        String content = "WriteFileUsingBufferedWriter";

        FileWriter fileWriter = new FileWriter(location);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(content);
        bufferedWriter.close();
        fileWriter.close();
    }

    /* 3. Using FileOutputStream function
            FileOutputStream is used to write binary data (bytes) into a file.
       Key Points
            Writes byte data
            Used for images, videos, files
            Faster for binary data  */
    @Test(priority = 2, enabled = true)
    public void UsingFileOutputStreamFunc() throws IOException {
        String location = "WriteFileUsingFileOutputStream.txt";
        String content = "WriteFileUsingFileOutputStream";

        FileOutputStream fileOutputStream = new FileOutputStream(location);
        byte[] contentByte = content.getBytes();
        fileOutputStream.write(contentByte);
        fileOutputStream.close();
    }

    /* 4. Using Paths / Files (Java NIO)
            Modern Java uses java.nio.file.Files and Paths which is simpler and more efficient.
          Key Points
            Introduced in Java NIO
            Cleaner syntax
            Best modern approach    */
    @Test(priority =3, enabled = true)
    public void UsingPathFunction() throws IOException {
        String location = "WriteFileUsingPathFunction.txt";
        String content = "WriteFileUsingPathFunction";

        Path path = Paths.get(location);
        Files.write(path, content.getBytes());
    }
}
