package com.soft1841.io;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++){
            File folder = new File("D:/java"+ "/"+ "chap"+i);
            if (!folder.exists()){
                folder.mkdirs();
            }
            else {
                folder.delete();
            }
        }
    }
}
