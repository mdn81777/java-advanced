package com.soft1841.thread.list;


/**
 * List接口基础程序
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //创建一个list对象，加入元素
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        //输出
        System.out.println(list);
        //通过for循环遍历集合
        for (int i= 0, length = list.size() ; i < length;i++){
            System.out.println();
        }
        //通过
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}