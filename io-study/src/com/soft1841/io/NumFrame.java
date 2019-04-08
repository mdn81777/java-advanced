package com.soft1841.io;

import javax.swing.*;
import java.awt.*;
/**
 * @author 孟妮 2019-4-8
 */
public class NumFrame extends JFrame{
    private JLabel numLabel;
    private JLabel sleepLabel;
    private GridLayout panel;
    private JLabel timeLabel;
    private JPanel[]  panels;
    private JPanel colourPanel;
    private JLabel imageLabel;
    public NumFrame () {
        init();
        setTitle("随机数轮播窗体");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init () {
        //将整个容器背景设置为白色
        getContentPane().setBackground(new Color(243, 243, 243));
        //定义三行九宫格，放置九个面板
        GridLayout gridLayout = new GridLayout(3, 3, 50, 30);
        setLayout(gridLayout);
        //创建面板数组
        panels = new JPanel[9];
        //循环创建每个面板的对象
        for (int i = 0; i < 9; i++) {
            panels[i] = new JPanel();
            //给面板加上边框
            panels[i].setBorder(BorderFactory.createTitledBorder("面板" + (i + 1)));
            //给面板依次加上网格布局管理器，变成九宫格
            add(panels[i]);
        }
        numLabel =new JLabel("随机数");
        Font font=new Font("微软雅黑",Font.BOLD,18);
        numLabel.setFont(font);
        panels[0].setBackground(new Color(255, 143, 0));
        panels[0].add(numLabel);
        NumThread numThread =new NumThread();
        numThread.setNumLabel(numLabel);
        numThread.start();
        timeLabel = new JLabel("系统时间");
        Font font1=new Font("微软雅黑",Font.BOLD,18);
        timeLabel.setFont(font1);
        panels[1].setBackground(new Color(255, 160, 0));
        panels[1].add(timeLabel);
        TimeThread timeThread = new TimeThread();
        timeThread.setTimeLabel(timeLabel);
        timeThread.start();
        sleepLabel = new JLabel("系统时间");
        Font font2=new Font("微软雅黑",Font.BOLD,18);
        timeLabel.setFont(font1);
        panels[1].setBackground(new Color(255, 160, 0));
        panels[1].add(timeLabel);
        SleepThread sleepThread = new SleepThread();
        sleepThread.setSleepLabel(sleepLabel);
        sleepThread.start();
        colourPanel = new JPanel();
        colourPanel.setSize(200,200);
        add(colourPanel,BorderLayout.CENTER);
        panels[2].setLayout(new BorderLayout(30,30));
        panels[2].add(colourPanel,BorderLayout.CENTER);
        ColourThread colourThread = new ColourThread();
        colourThread.setColourPanel(colourPanel);
        colourThread.start();
//        panels[2].setBackground(new Color(255, 179, 0));
        imageLabel = new JLabel();
        panels[3].setLayout(new BorderLayout(20,20));
        panels[3].add(imageLabel,BorderLayout.CENTER);
        ImageThread imageThread = new ImageThread();
        imageThread.setImageLabel(imageLabel);
        imageThread.start();
//        panels[3].setBackground(new Color(255, 193, 7));
        panels[4].setBackground(new Color(221, 202, 40));
        panels[5].setBackground(new Color(255, 213, 79));
        panels[6].setBackground(new Color(255, 224, 130));
        panels[7].setBackground(new Color(255, 236, 179));
        panels[8].setBackground(new Color(255, 248, 225));




    }
    public static void main (String[] args){
        new NumFrame();
    }
}
