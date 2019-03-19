package com.soft1841.set;

import sun.security.util.Length;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set接口基础程序
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println("直接输出set集合");
        System.out.println(set);
//        String s1 = new String("A");
//        String s2 = new String("B");
//        String s3 = new String("C");
//        String s4 = new String("A");
//        set.add(s1);
//        set.add(s2);
//        set.add(s3);
//        set.add(s4);
//        System.out.println(set);
        //用for循环遍历set集合
        System.out.println("for循环遍历集合");
        Object[] array = set.toArray();
        for (int i= 0, length = array.length ; i < length;i++){
            System.out.println(array[i] + "  ");
        }
        //用Iterator循环遍历集合
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + "   ");
        }
        System.out.println();
        System.out.println("Lamada表达式遍历集合");
        //用Lamada表达式遍历set集合
        set.forEach(s -> System.out.println(s + " "));

    }
}
