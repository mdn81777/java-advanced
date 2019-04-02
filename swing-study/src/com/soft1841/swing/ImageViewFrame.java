package com.soft1841.swing;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
/**
 * 使用卡片布局实现多图浏览功能
 * @author 孟妮 2019-4-2
 */
class ImageViewerFrame extends JFrame implements ActionListener {
    private JButton chooserBtn,preBtn,nextBtn,firstBtn,lastBtn;
    private JFileChooser fileChooser;
    private JPanel centerPane,bottomPanel;
    private CardLayout cardLayout;
    private JLabel imgLabel;
    private  Icon icon;

    private ImageViewerFrame(){
        init();
        setTitle("ImageViewerFrame");
        setSize(700,600);
        //窗体居中显示
        setLocationRelativeTo(null);
        setResizable(false);
        //窗体可见
        setVisible(true);
        //关闭方式
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init(){
        chooserBtn = new JButton("选择图片");
        preBtn = new JButton("上一张");
        nextBtn = new JButton("下一张");
        firstBtn = new JButton("第一张");
        lastBtn = new JButton("最后一张");
        bottomPanel = new JPanel();
        bottomPanel.add(preBtn);
        bottomPanel.add(nextBtn);
        bottomPanel.add(chooserBtn);
        bottomPanel.add(firstBtn);
        bottomPanel.add(lastBtn);
        add(bottomPanel,BorderLayout.SOUTH);
        chooserBtn.addActionListener(this);
        preBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        firstBtn.addActionListener(this);
        lastBtn.addActionListener(this);
        centerPane = new JPanel();
        cardLayout = new CardLayout();
        centerPane.setLayout(cardLayout);
        add(centerPane);
        centerPane.setBackground(new Color(123, 123, 123));
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new ImageViewerFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooserBtn) {
            fileChooser = new JFileChooser();
            //设置文件选择器的默认路径
            fileChooser.setCurrentDirectory(new File("D:\\"));
            fileChooser.setMultiSelectionEnabled(true);
            int result = fileChooser.showOpenDialog(null);
            //用户点击“确认”按钮
            if (result == JFileChooser.APPROVE_OPTION) {
                File[] files = fileChooser.getSelectedFiles();
                for (File f : files) {
                    System.out.println(f.getAbsolutePath());
                    //对每个f文件，创建输入流读入字节数组，构建Icon,并设置给JLabel
                    try {
                        InputStream inputStream = new FileInputStream(f);
                        byte[] bytes = new byte[(int) f.length()];
                        //读入内容到字节数组
                        inputStream.read(bytes);
                        //使用bytes构建一个新的输出字符串
                        icon = new ImageIcon(bytes);
                        imgLabel = new JLabel();
                        imgLabel.setIcon(icon);
                        centerPane.add(imgLabel);
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, "IO操作异常");
                    }
                }
            }
        }
        if (e.getSource() == preBtn) {
            cardLayout.previous(centerPane);
        }
        if (e.getSource() == nextBtn) {
            cardLayout.next(centerPane);
        }
        if (e.getSource() == firstBtn) {
            cardLayout.first(centerPane);
        }
        if (e.getSource() == lastBtn) {
            cardLayout.last(centerPane);
        }
    }

}
