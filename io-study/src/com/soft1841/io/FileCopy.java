package com.soft1841.io;

import com.sun.deploy.util.SyncFileAccess;
import sun.java2d.loops.DrawLine;

import java.io.*;
import java.util.UUID;

/**
 * 文件操作复制
 * @author 孟妮 2019-3-26
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //指定源文件
        File srcFile = new File("D:/line.jpg");
        //获取源文件名
        String srcFileName = srcFile.getName();
        //定位的位置
        int position = srcFileName.indexOf(".");
        //取得源文件的拓展名
        String suffixName = srcFileName.substring(position + 1);
        //新的文件名
        String newName = UUID.randomUUID().toString();
        //指定目标文件
        File destFile = new File("D:/" + newName + "." + suffixName);
        //创建一个字节数组，大小为源文件长度，长度转为int
        byte[] b = new byte[(int) srcFile.length()];
        //创建字节输入流
        InputStream in = new FileInputStream(srcFile);
        //将源文件读入字节数组
        in.read(b);
        //创建字节输出流
        OutputStream out = new FileOutputStream(destFile);
        //将源文件读入字节数组;
        out.write(b);
        //关闭输入输出流
        in.close();
        out.close();
        System.out.println(UUID.randomUUID());
    }
}
