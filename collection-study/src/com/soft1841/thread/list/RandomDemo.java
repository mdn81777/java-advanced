package com.soft1841.thread.list;

import java.util.Random;

/**
 * 随机数类程序
 * @author 孟妮 2019年3月12日
 */

public class RandomDemo {
    public static void main(String[] args) {
        //随机生成一个五以内的随机数，包括五
        Random random = new Random();
        //[0,bound)范围
        int num = random.nextInt(6);
        System.out.println(num);
    }
}
