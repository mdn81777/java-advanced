package com.soft1841.io;

import jdk.internal.org.objectweb.asm.TypeReference;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.time.LocalDate;
import java.util.UUID;

/**
 * 图片窗体程序
 * @author 孟妮 2019-3-26
 */
public class ImageFrame extends JFrame {
    private  JPanel topPanel;
    private JButton[] buttons;
    private JLabel imgLabel;
    private  Icon icon;
    private  JLabel nameLabel;
    private  JLabel timeLabel;
    //构造方法
    public ImageFrame(){
        init();
        setTitle("图片窗体");
        setSize(660,800);
        //窗体自动居中
        setLocationRelativeTo(null);
        //窗体可见
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    //自己定义的init,设置布局，放置组件
    public  void init(){
        topPanel = new JPanel();
        buttons = new JButton[5];
        Font font = new Font("微软雅黑",Font.BOLD,10);
        topPanel.setBackground(Color.LIGHT_GRAY);
        for (int i= 0;i<5;i++){
           buttons[i] = new JButton("按钮"+i);
           topPanel.add(buttons[i]);
        }
        add(topPanel, BorderLayout.NORTH);
        imgLabel = new JLabel("图片");
        //读入本地的图片到内存的字节数组
        File srcFile = new File("D:/1.png");
        InputStream inputStream;
        byte[] bytes = new byte[0];
        try {
            inputStream = new FileInputStream(srcFile);
            bytes = new byte[(int) srcFile.length()];
            inputStream.read(bytes);
        } catch (IOException e) {
            System.out.println("IO异常");
        }
        icon = new ImageIcon(bytes);
        imgLabel.setIcon(icon);
        LocalDate today =LocalDate.now();
        timeLabel = new JLabel(String.valueOf(today));
        add(timeLabel,BorderLayout.WEST);
        nameLabel = new JLabel(srcFile.getAbsolutePath());
        add(nameLabel,BorderLayout.SOUTH);
        add(imgLabel,BorderLayout.CENTER);
    }
    //main方法
    public static void main(String[] args) {
        new  ImageFrame();
    }
}
