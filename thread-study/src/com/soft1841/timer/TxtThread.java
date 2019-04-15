package com.soft1841.timer;


import javax.swing.*;
import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

public class TxtThread extends Thread {
    private JLabel txtLabel;

    public void setTxtLabel(JLabel txtLabel) {

        this.txtLabel = txtLabel;
    }

    @Override
    public void run() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println(new String());
            }
        };
        java.util.Timer timer = new Timer();
        timer.schedule(timerTask,0,1000);
        File file = new File("D:\\hello.txt");
        InputStream inputStream = null;
        byte[] bytes = new byte[(int) file.length()];

        try {
            inputStream = new FileInputStream(file);
            inputStream.read(bytes);
        } catch (IOException e) {
            System.out.println("IO异常");
        }
        txtLabel.setText(new String(bytes));
    }
}
