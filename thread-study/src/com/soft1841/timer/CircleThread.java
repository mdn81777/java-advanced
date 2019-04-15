package com.soft1841.timer;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class CircleThread implements Runnable {
    int x = 800;
    int y = 800;
    private JFrame frame;

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                for (int i = 1; i <= 15; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Graphics graphics = frame.getGraphics();
                    graphics.setColor(Color.red);
                    graphics.drawOval(x / 2 - (i + 1) * 10, y / 2 - (i + 1) * 10, 20 + 20 * i, 20 + 20 * i);
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask,10,1000);

    }
}
