package com.soft1841;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 孟妮 2019-4-8
 */
public class TimeThread extends Thread {
    private JLabel timeLabel;

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }
    @Override
    public void run() {
        while (true) {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            timeLabel.setText(String.valueOf(df.format(new Date())));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
