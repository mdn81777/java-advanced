package com.soft1841.thread.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws IOException {
//        Scanner sc= new Scanner(new FileInputStream(new File("D:\\out.txt")));
//        String resultStr = sc.nextLine();
//        System.out.println(resultStr);
        //获取文件内容
        File file = new File("D:\\out.txt");
        InputStream inputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(file);
        String res = scanner.nextLine();
    }
}
