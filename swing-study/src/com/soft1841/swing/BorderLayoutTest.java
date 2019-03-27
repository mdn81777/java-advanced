package com.soft1841.swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author 孟妮 2019-3-26
 * 边界布局管理器
 */
public class BorderLayoutTest extends JFrame {
    public BorderLayoutTest(){
        setTitle("这个窗体使用边界布局管理器");
        //定义一个容器
        Container c = getContentPane();
        //设置容器为边界布局管理器
        setLayout(new BorderLayout());
        JButton centerBtn = new JButton("中神通"),
                northBtn = new JButton("北乞"),
                southBtn = new JButton("南帝"),
                westBtn = new JButton("西毒"),
                eastBtn = new JButton("东邪");
        //中间添加按钮
        c.add(centerBtn,BorderLayout.CENTER);
        centerBtn.setBackground(Color.YELLOW);
        c.add(northBtn,BorderLayout.NORTH);
        northBtn.setBackground(Color.GREEN);
        c.add(southBtn,BorderLayout.SOUTH);
        southBtn.setBackground(Color.PINK);
        c.add(westBtn,BorderLayout.WEST);
        westBtn.setBackground(Color.LIGHT_GRAY);
        c.add(eastBtn,BorderLayout.EAST);
        //设置窗体大小
        setSize(550,400);
        //设置窗体可见
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new  BorderLayoutTest();
    }
}
