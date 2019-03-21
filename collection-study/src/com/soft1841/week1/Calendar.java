package com.soft1841.week1;

import java.util.Date;

/**
 * @author ，孟妮 2019-3-22
 */
public class Calendar {
    public static void main(String[] args) {
        //创建Calendar对象
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        //获取年
        int year = calendar.get(java.util.Calendar.YEAR);
        //获取月
        int month = calendar.get(java.util.Calendar.MONTH) + 1;
        //获取日期
        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
        //获取小时
        int hour = calendar.get(java.util.Calendar.HOUR_OF_DAY);
        //获取分钟
        int minute = calendar.get(java.util.Calendar.MINUTE);
        //获取秒
        int second = calendar.get(java.util.Calendar.SECOND);
        System.out.println("当前时间：" + year + "-" + month + "-" + day + " " + hour+ ":" + minute + "-" + ":"+second);
        //将Calendar转换为Date对象
        Date date = calendar.getTime();
        //获取当前毫秒数
        Long time = calendar.getTimeInMillis();
        System.out.println("当前时间："+ date);
        System.out.println("当前毫秒数："+time);
    }
}
