package com.soft1841.io;

import javax.security.auth.callback.CallbackHandler;
import javax.sound.midi.Soundbank;
import java.io.*;

/**
 * 文本操作复制
 * @author 孟妮 2019-3-26
 */
public class TxtCopy {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:/hello.txt");
        if (!srcFile.exists()){
            File destFile = new File("D:/hello副本.txt");
            Reader in = new FileReader(srcFile);
            char[] chars = new  char[(int) srcFile.length()];
            in.read(chars);
            Writer out = new FileWriter(destFile);
            out.write(chars);
            in.close();
            out.close();
        }
     else {
            System.out.println("该文件不存在：");
     }
    }
}
