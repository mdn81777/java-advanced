package com.soft1841.week1;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar类
 * @author 孟妮 2019-3-22
 */
public class CalendarTest {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar c = Calendar.getInstance();
        //获取 年
        int year = c.get(Calendar.YEAR);
        //获取月
        int month = c.get(Calendar.MONTH);
        //获取日期
        int day = c.get(Calendar.DAY_OF_MONTH);
        //获取小时
        int hour = c.get(Calendar.HOUR_OF_DAY);
        //获取分钟
        int minute = c.get(Calendar.MINUTE);
        //获取秒
        int second = c.get(Calendar.SECOND);
        System.out.println("当前时间：" + year + "-" + month + "-" + day + " "
                + hour + ":" + minute + ":" + second );
        //将Calendar对象转换成Date对象
        Date date = c.getTime();
        //获取当前毫秒
        Long time = c.getTimeInMillis();
        System.out.println("当前时间：" + date);
        System.out.println("当前毫秒：" + time);

    }
}