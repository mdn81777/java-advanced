package com.soft1841.week1;

import jdk.nashorn.internal.ir.IfNode;
/**
 * @author 孟妮2019-4-1
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FolderTest {
    public static void main(String[] args) {
        //遍历的路径
        String path = "D:\\java";
        //获取file对象
        File file = new File(path);
        //遍历path下的文件和目录，放在File数组中
        File[] fs = file.listFiles();
        //遍历File数组
        for (File f : fs) {
            //将图片格式添加进去
            String fileName = f.getName();
            List<File> list = new ArrayList<File>();
            if (fileName.endsWith(".jpg") || fileName.endsWith(".png")
                    || fileName.endsWith(".gif")) {
                list.add(f);
                //若非目录（即文件），则打印
                if (!f.isDirectory()) {System.out.println(f);
                }

            }
        }
    }
}