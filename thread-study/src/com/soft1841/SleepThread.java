package com.soft1841;

import javax.swing.*;
import java.util.Random;

/**
 * @author 孟妮 2019-4-8
 */
public class SleepThread extends Thread{
    private JLabel sleepLabel;
    public void setSleepLabel(JLabel numLabel) {
        this.sleepLabel=numLabel;
    }
    @Override
    public void run(){
        Random random=new Random();
        while (true){
            int num=random.nextInt(100);
            sleepLabel.setText(String.valueOf(num));
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}

