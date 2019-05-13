package com.soft1841.gui;

import javax.swing.*;

public class AiSiFrame {
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JList list1;

    public static void main(String[] args) throws Exception {
        //根据系统设置
        String lookAndFeel1 = UIManager.getSystemLookAndFeelClassName();
        UIManager.setLookAndFeel(lookAndFeel1);
        JFrame frame = new JFrame("AiSiFrame");
        frame.setContentPane(new AiSiFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
