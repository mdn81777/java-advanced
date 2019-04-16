package com.soft1841.io;

import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        //声明文件夹Test所在的目录
        String path = "D:/test";
        for (int i = 1; i<= 3;i++){
            File folder = new File(path + "\\" + i);
            if (!folder.exists()){
                folder.mkdirs();
            }
        }
        System.out.println("文件夹创建成功，请打开D盘查看！\n\nD文件及文件夹列表如下：");
        //根据路径名创建File对象
        File file = new File("D:\\");
        //获得D盘所有的文件和文件夹
        File[] files = file.listFiles();
        //遍历files数组
        for (File folder : files){
            //判断是否为文件
            if (folder.isFile())
                //输出D盘所有的文件名称
                System.out.println(folder.getName()+"文件");
            //判断是否为文件夹
            else if (folder.isDirectory())
                //输出D盘所有的文件夹名称
                System.out.println(folder.getName()+"文件");
        }

    }
}
