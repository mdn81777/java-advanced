package com.soft1841.week1;

import org.omg.CORBA.DATA_CONVERSION;

import java.time.temporal.WeekFields;
import java.util.Scanner;

enum Date {
    MONDAY("周一"), TUESDAY("周二"), WEDNESDAY("周三"), THURSDAY("周四"), FRIDAY("周五"),SATURDAY("周六"),SUNDAY("周日");
    String dateName;
    Date(String dateName) {
        this.dateName = dateName;
    }
    public String getDateName() {
    return dateName;
    }
    //定义一个静态方法，根据一个简称得到完整的星期名称
    public static Date getResult(String input) {
        // 根据输入获取枚举值
        switch (input) {
            case "mon":
                return Date.MONDAY;
            case "tue":
                return Date.TUESDAY;
            case "wen":
                return Date.WEDNESDAY;
            case "thu":
                return Date.THURSDAY;
            case "fri":
                return Date.FRIDAY;
            case "sat":
                return Date.SATURDAY;
            case "sun":
                return  Date.SUNDAY;
            default:
                return Date.MONDAY;
        }
    }
}
public class EnumTest {
    public static void main(String[] args) {
        Date dateArry[] = Date.values();
        for (Date date :dateArry){
            System.out.println(date + " " + date.getDateName());
        }
        System.out.println("\n请输入需要查询的英文星期单词的前三个小写字母：");
        Scanner scanner = new Scanner(System.in);
        Date date = Date.getResult(scanner.next());
     switch (date){
         case MONDAY:
             System.out.println("MONDAY---"+ date.getDateName());
             break;
         case TUESDAY:
             System.out.println("TUESDAY---"+ date.getDateName());
             break;
         case WEDNESDAY:
             System.out.println("WEDNESDAY---" + date.getDateName());
             break;
         case THURSDAY:
             System.out.println("THURSDAY---" + date.getDateName());
             break;
         case FRIDAY:
             System.out.println("FRIDAY---" + date.getDateName());
             break;
         case SATURDAY:
             System.out.println("SATURDAY---" + date.getDateName());
             break;
         case SUNDAY:
             System.out.println("SUNDAY---" + date.getDateName());
     }
     scanner.close();
     }
    }
