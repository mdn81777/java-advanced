package com.soft1841.list;

/**
 * Integer类的练习
 * @author 孟妮 2019年3月12日
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int num = 31;
        //调用Integer类的方法，将num进行进制转换
        //二进制
        String str1 = Integer.toBinaryString(num);
        System.out.println("二进制："+ str1);
        //八进制
        String str2 = Integer.toOctalString(num);
        System.out.println("八进制："+ str2);
        //七进制
        String str3 = Integer.toString(num,7);
        System.out.println("七进制：" +str3);
        System.out.println("————分割线，以下是自定义方法————");
        //调用自定义的转换方法
        System.out.println("转换为五进制:" +convert(num,9) );

    }
    private static String convert(int num, int radix){
        //创建一个StringBuffer，用来存放结果字符串
        StringBuffer stringBuffer = new StringBuffer();
        //被除数不为0，继续除
        while (num != 0){
            //求出余数
            int remainder = num % radix;
            //将余数转换为字符串加入StringBuffer
            stringBuffer.append(remainder);
            //更新被除数为商
            num = num / radix;
        }
        //将结果串去反返回
        return stringBuffer.reverse().toString();
    }

}
