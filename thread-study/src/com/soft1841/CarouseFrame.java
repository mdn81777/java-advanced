package com.soft1841;
import javax.swing.*;
import java.awt.*;

public class CarouseFrame extends JFrame {

    private JLabel bgLabel;
    private CarouseFrame(){
        init();
        setTitle("轮播窗体");
        //居中
        setLocationRelativeTo(null);
        //窗口最大化
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(930,770);
        //可见
        setVisible(true);
        //关闭
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init(){
        bgLabel = new JLabel();
        add(bgLabel);
        CarouseThread ct = new CarouseThread();
        ct.setBgLabel(bgLabel);
        new Thread(ct).start();
    }

    public static void main(String[] args) {
        new CarouseFrame();
    }
}



