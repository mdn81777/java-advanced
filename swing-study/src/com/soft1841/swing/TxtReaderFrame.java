package com.soft1841.swing;
/**
 * 图片阅读窗体
 * @author 孟妮 2019-4-1
 */
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class TxtReaderFrame extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton confirmButton;
    private JPanel topPanel;
    private JTextArea contentArea;
    private JLabel imgLabel;
    private Icon icon;

    public TxtReaderFrame(){
        init();
        setTitle("文本阅读窗体");
        setSize(new Dimension(760,600));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        //顶部面板
        inputField = new JTextField(20);
        inputField.setPreferredSize(new Dimension(150,40));
        confirmButton = new JButton("确认");
        confirmButton.setPreferredSize(new Dimension(70,40));
        imgLabel = new JLabel();
        imgLabel.setPreferredSize(new Dimension(300,300));
        //给按钮注册监听
        confirmButton.addActionListener(this);
        topPanel = new JPanel();
        topPanel.add(inputField);
        topPanel.add(confirmButton);
        confirmButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        add(topPanel,BorderLayout.NORTH);
        //图片
        add(imgLabel,BorderLayout.CENTER);
       //中间的多行文本域
        contentArea = new JTextArea();
        add(contentArea,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new TxtReaderFrame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取输入框内容
        String filePath = inputField.getText().trim();
        //创建文件
        File file = new File(filePath);
        //使用三种方法将file中的内容读入
        byte[] bytes = new byte[0];
        try {
            //字节流输入
            InputStream inputStream = new FileInputStream(file);
            bytes = new byte[(int) file.length()];
            //读入内容，到字节数组
            inputStream.read(bytes);
           // 使用bytes构建一个新的输出字符串
            String resultStr = new String(bytes);
            // 换行
            contentArea.append("\r\n ");
        } catch (IOException e1) {
            JOptionPane.showMessageDialog(null,"IO操作异常");
        }
//        icon = new ImageIcon(bytes);
//        imgLabel.setIcon(icon);
    }
}
