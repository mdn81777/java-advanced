package com.soft1841.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
/**
 * CardLayout卡片布局管理器
 * @author 孟妮 2019-4-2
 */
public class CardLayoutTest extends JFrame implements ActionListener {
    //头部定义，构造方法
    private JPanel cardPanel;
    private JButton preButton, nextButton;
    private JPanel buttonPanel;
    private CardLayout cardLayout;
    public CardLayoutTest () {
        init();
        setTitle("CardLayout卡片布局");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    //int初始化方法
    private void init () {
        cardLayout = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        for (int i = 0; i < 4; i++) {
            cardPanel.add(String.valueOf(i+1),getPanel());
        }
        add(cardPanel);
        buttonPanel=new JPanel();
        buttonPanel.setBackground(new Color(254, 180, 110));
        preButton=new JButton("上一张");
        nextButton=new JButton("下一张");
        buttonPanel.add(preButton);
        buttonPanel.add(nextButton);
        add(buttonPanel,BorderLayout.SOUTH);
        preButton.addActionListener(this);
        nextButton.addActionListener(this);
    }
    private JPanel getPanel(){
        JPanel newPanel =new JPanel();
        Random random=new Random();
        int r=random.nextInt(256);
        int g=random.nextInt(256);
        int b=random.nextInt(256);
        newPanel.setBackground(new Color(r,g,b));
        return newPanel;
    }
    public static void main (String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new CardLayoutTest();
    }
    @Override
    public void actionPerformed (ActionEvent e) {
        //监听实现方法
        if (e.getSource()==preButton){
            cardLayout.previous(cardPanel);
        }else {
            cardLayout.next(cardPanel);
        }

    }
}
