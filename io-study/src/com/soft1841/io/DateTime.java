package com.soft1841.io;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class DateTime {
    public static void main(String[] args) throws IOException {
        //创建目录
        LocalDate today = LocalDate.now();
        File file = new File("D:\\"+today);
        if (!file.exists()){
            file.mkdirs();
        }
        //目录上创建文件
        File folder = new File(file + "/" + "hello.md");
        //判定如果file不存在，则创建新文件
        if (!folder.exists()){
            folder.createNewFile();
        }

        System.out.println("创建成功");

    }
}