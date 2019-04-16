package com.soft1841.io;

import java.io.File;
import java.io.IOException;

/**
 * File基础操作
 * @author 孟妮 2019-3-25
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/README.md");
        //判定如果file不存在，则创建新文件
        if (!file.exists()){
            file.createNewFile();
            
        }
    }
}
