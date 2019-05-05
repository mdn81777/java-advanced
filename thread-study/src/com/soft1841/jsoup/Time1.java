package com.soft1841.jsoup;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;


class Time1 extends Thread implements Runnable {
    private JLabel timeJlabel;

    public void setTime(JLabel timeJlabel) {
        this.timeJlabel = timeJlabel;
    }

    @Override
    public void run() {
        while (true) {

            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            long timenow = date.getTime();
            timenow = 60 * 60 * 1000 - timenow;
            date = new Date(timenow);
            timeJlabel.setText(sdf.format(date));
            if (sdf.format(date).equals("20:30:10")) {
                JOptionPane.showMessageDialog(timeJlabel, "本场活动现在开始！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("1");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("1");
            }
        }
    }
}


