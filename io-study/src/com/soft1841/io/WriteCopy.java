package com.soft1841.io;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import java.beans.beancontext.BeanContext;
import java.io.*;
import java.util.Scanner;

/**
 * @author 孟妮 2019-3-26
 */
public class WriteCopy {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要输入的文本内容：");
        String inputString  = scanner.nextLine();
        //方法一：通过字符流输出
        char[] chars = inputString.toCharArray();
        File destFile1  = new File("D:/word1.txt");
        Writer out = new FileWriter(destFile1,true);
        out.write(chars);
        out.close();
        //方法二：通过字节流输出
        byte[] bytes = inputString.getBytes();
        File destFile2 = new File("D:/word2.txt");
        OutputStream out2 = new FileOutputStream(destFile2);
        out2.write(bytes);
        out2.close();
        //方法三：通过打印流输出
        File destFile3 = new File("D:/word3.txt");
        OutputStream out3 = new FileOutputStream(destFile3);
        PrintStream printStream = new PrintStream(out3);

    }
}
