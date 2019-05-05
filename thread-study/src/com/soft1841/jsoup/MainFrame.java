package com.soft1841.jsoup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainFrame extends JFrame {
    private static final JDesktopPane DESKTOP_PANE = new JDesktopPane();
    private JLabel accountLabel,passwordLabel;
    private  JTextField accountField;
    private  JPasswordField passwordField;
    private  JComboBox<String> roleComboBox;
    private  JButton confirmButton,cancelButton;
    private JLabel bgLabel;
    public MainFrame() {
        init();
        setTitle("天猫");
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        //窗体大小不可变
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init(){
        Font font = new Font("微软雅黑",Font.PLAIN,24);
        JLabel accountLabel = new JLabel("账号");
        accountLabel.setFont(font);
        accountLabel.setForeground(new Color(0x6E6E6E));
        accountLabel.setBounds(1205,375,170,55);
        add(accountLabel);
        JTextField accountField = new JTextField();
        accountField.setFont(font);
        accountField.setBackground(new Color(0xFFFFFF));
        accountField.setBounds(1305,385,270,47);
        add(accountField);
        JLabel passwordLabel = new JLabel("密码");
        passwordLabel.setForeground(new Color(0x6E6E6E));
        passwordLabel.setBounds(1205,450,170,55);
        add(passwordLabel);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBackground(new Color(0xFFFFFF));
        passwordField.setFont(font);
        passwordField.setBounds(1305,460,270,47);
        add(passwordField);
        JButton confirmButton = new JButton("登录");
        confirmButton.setFont(font);
        confirmButton.setBounds(1205,530,370,47);
        confirmButton.setForeground(new Color(0xFFFFFF));
        confirmButton.setBorder(BorderFactory.createLineBorder(new Color(0xFF0036)));
        confirmButton.setBackground(new Color(0xFF0036));
        //实现监听
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String account = accountField.getText().trim();
                String password = String.valueOf(passwordField.getPassword());
                if ("123".equals(account) && "123".equals(password)) {
                    //关闭登录
                    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    //打开主体线程
                    AllFrame frameThread = new AllFrame();
                    new Thread(frameThread).start();

                }
            }
        });
        add(confirmButton);
        JButton cancelButton = new JButton("注册");
        cancelButton.setFont(font);
        cancelButton.setBounds(1205,605,370,47);
        cancelButton.setForeground(new Color(0xFFFFFF));
        cancelButton.setBackground(new Color(0xFF0036));
        cancelButton.setBorder(BorderFactory.createLineBorder(new Color(0xFF0036)));
        add(cancelButton);
        //窗体布局设为空布局，需要每个组件设置定位
        setLayout(null);
        bgLabel = new JLabel();
        Icon bgIcon = new ImageIcon(MainFrame.class.getResource("/img/5.png"));
        bgLabel.setIcon(bgIcon);
        bgLabel.setBounds(0,-50,1920,1080);
        add(bgLabel);

    }
    public static void main(String[] args) {
        new MainFrame();
    }
    }