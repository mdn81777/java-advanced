package com.soft1841.thread.map;

import java.util.*;

public class StudentMapTest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student(30, "袁腾飞"));
        list1.add(new Student(31, "黄敬理"));
        list2.add(new Student(32, "孟妮"));
        list2.add(new Student(34, "王欢乐"));
        Map<String, List<Student>> map = new HashMap<>();
        map.put("男生", list1);
        map.put("女生", list2);
        Iterator<Map.Entry<String, List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
            List<Student> list = entry.getValue();
            for (Student s : list) {
                System.out.print("学号:" + s.getID() + "，姓名：" + s.getName());
                System.out.println();
            }
        }
    }}
