package com.soft1841.thread.io;
/**
 * @author 孟妮 2019-3-26
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class WordCopy {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入内容：");
        String str = sc.nextLine();
        byte[] bytes = str.getBytes();
        File destFile = new File("D:/word.txt");
        OutputStream out = new FileOutputStream(destFile);
        out.write(bytes);
        out.close();
    }
}
