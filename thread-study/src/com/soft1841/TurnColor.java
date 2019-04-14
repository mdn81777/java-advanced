package com.soft1841;

import javax.swing.*;

/**
 * 模拟红绿灯变化场景线程程序
 * @author 孟妮 2019-4-15
 */
public class TurnColor extends Thread {
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        // 线程始终处于被启用状态
        while (true) {
            try {
                // 线程休眠2秒
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/8.png"))); // 黄灯
            try {
                // 线程休眠8秒
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/9.png"))); // 红灯
            try {
                // 线程休眠5秒
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/10.png"))); // 绿灯
        }
    }
}
