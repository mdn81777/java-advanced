package com.soft1841.thread.list;
import java.util.ArrayList;
import java.util.List;

public class BookOneList {
    public static void main(String[] args) {
        List<BookOne> list = new ArrayList<>();
        list.add(new BookOne(1, "Java",66.6));
        list.add(new BookOne(2, "Math",33.3));
        list.add(new BookOne(3, "Art",76.6));
        System.out.println(list);
        list.add(new BookOne(2,"Math",77.7));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2,new BookOne(2,"Java",66.6));
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(new BookOne(1, "Java",66.6));
        System.out.println(list);
        System.out.println(list.indexOf("2"));
        System.out.println(list.lastIndexOf("2"));


    }
}
