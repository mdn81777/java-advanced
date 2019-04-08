package com.soft1841.io;
import javax.swing.*;
import java.sql.Time;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
/**
 * @author 孟妮 2019-4-8
 */
public class NumThread extends Thread{
    private JLabel numLabel;
    public void setNumLabel(JLabel numLabel) {
        this.numLabel=numLabel;
    }
    @Override
    public void run(){
        Random random=new Random();
        while (true){
            int num=random.nextInt(100);
            numLabel.setText(String.valueOf(num));
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

