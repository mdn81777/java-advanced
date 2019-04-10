package com.soft1841.thread.io;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        //定义字符数组
        String content[] = {
                "你不喜欢我，","我一点都不介意。","因为我活下来，","不是为了取悦你！"
        };
        File file = new File("word.txt");
        try {
            FileWriter fw = new FileWriter(file);
            //创建BufferedWriter对象
            BufferedWriter bufw = new BufferedWriter(fw);
            //循环遍历数组
            for (int k = 0;k<content.length;k++){
                //将字符数组中的元素写入到磁盘文件中
                bufw.write(content[k]);
                //将数组中的单个元素以单行的形式写入到文件
                bufw.newLine();
            }
            //将BufferedWrite流关闭
            bufw.close();
            //将FileWrite流关闭
            fw.close();
            //处理异常
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //创建FileReader对象
            FileReader fr = new FileReader(file);
            //创建BufferedReader对象
            BufferedReader bufr = new BufferedReader(fr);
            //创建字符串对象
            String  s = null;
            //声明int型变量
            int i = 0;
            //如果文件的文本行数不为null，则进入循环
            while ((s = bufr.readLine())!= null){
                //将变量做自增运算
                i++;
                //输入文件数据
                System.out.println("第"+i+"行："+s);
            }
            //将BufferedReader流关闭
            bufr.close();
            //将FileReader流关闭
            fr.close();
            //处理异常
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
