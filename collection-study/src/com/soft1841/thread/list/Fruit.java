package com.soft1841.thread.list;
/**
 * 自定义水果类，实现比较器接口，按照单位价格升序排序
 * 实现Comparable接口，必须强制重写其compareTo()方法
 * @author 孟妮 2019-3-20
 */
public class Fruit implements Comparable<Fruit>{
    private  String name;
    private  Integer Price;

    public Fruit(String name, Integer price) {
        this.name = name;
        Price = price;
    }

    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    @Override
    public int compareTo(Fruit fruit) {
        return this.getPrice()-fruit.getPrice();
    }
}
