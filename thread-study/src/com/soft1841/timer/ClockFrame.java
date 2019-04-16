package com.soft1841.timer;

import com.soft1841.TimeThread;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ClockFrame extends JFrame {
    private Timer timer;
    private JLabel timelabel;
    public ClockFrame(){
        init();
        setTitle("漂亮的时钟");
        setSize(500, 400);
//        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public  void init(){
        JPanel jPanel = new JPanel(){
            protected  void  paintComponent(Graphics g){
                try {
                    Image bg = ImageIO.read(new File("D:/5.jpg"));
                    g.drawImage(bg,0,0,getWidth(),getHeight(),null);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER,200,200));
        add(jPanel);
        timelabel = new JLabel("系统时间");
        Font font1=new Font("微软雅黑",Font.BOLD,25);
        timelabel.setFont(font1);
        TimeThread timeThread = new TimeThread();
        timeThread.setTimeLabel(timelabel);
        timeThread.start();
        jPanel.add(timelabel,BorderLayout.SOUTH);
        TimerTask clockTask = new TimerTask() {
            @Override
            public void run() {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeString = sdf.format(date);
                if (timeString.equals("2019-04-16 09:21:30")) {
                    JOptionPane.showMessageDialog(jPanel, "时间到···");
                    this.cancel();
                }
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(clockTask, 0, 1000);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ClockFrame();
    }
}
