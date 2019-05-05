package com.soft1841.jsoup;

import javax.swing.*;
import java.io.*;

public class AllThread implements Runnable {
    private String[] imgs = {"D:/carousel/1.png", "D:/carousel/2.png", "D:/carousel/3.png", "D:/carousel/4.png","D:/carousel/7.png", "D:/carousel/6.png",};
    private JLabel bgLabel;
    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }
    @Override
    public void run() {
        int i = 0;
        int len = imgs.length - 1;
        while (true) {
            try {
                File file = new File(imgs[i]);
                InputStream inputStream = new FileInputStream(file);
                byte[] bytes = new byte[(int) file.length()];
                inputStream.read(bytes);
                Icon icon = new ImageIcon(bytes);
                bgLabel.setIcon(icon);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i == len) {
                    i = 0;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("IO异常");
            }
        }

    }
}