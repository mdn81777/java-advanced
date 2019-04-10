package com.soft1841.thread.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 实现Comparable接口的Student，放入List进行按价格排序
 * @author 孟妮 2019.3.19
 */
public class FruitList {
    public static void main(String[] args) {
        //创建List对象，存入Fruit对象
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit("苹果", 20));
        list.add(new Fruit("香蕉", 11));
        list.add(new Fruit("离子", 18));
        list.add(new Fruit("荔枝", 13));
        list.add(new Fruit("芒果", 17));
        //调用Collections的sort方法，会自动调用之前写的compareTo方法进行排序
        Collections.sort(list);
        //forEach遍历list
        for (Fruit fruit : list) {
            System.out.println("名称：" + fruit.getName() + ",价格：" + fruit.getPrice());

        }
    }
}