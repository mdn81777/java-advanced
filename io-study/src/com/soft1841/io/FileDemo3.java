package com.soft1841.io;

import java.io.*;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        String str = "I love java";
        File file1 = new File("D:\\out.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
        OutputStream outputStream = new FileOutputStream(file1,true);
        outputStream.write(str.getBytes());
        outputStream.close();

        Writer writer = new FileWriter(file1,true);
        writer.write(str.toCharArray());
        writer.close();

        OutputStream outputStream1 = new FileOutputStream(file1,true);
        PrintStream printStream = new PrintStream(outputStream);
        printStream.print(str);
        System.out.println(str);
        printStream.close();
        outputStream.close();



    }
}
