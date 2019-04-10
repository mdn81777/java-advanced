package com.soft1841.thread.io;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SleepMethodTest extends JFrame {
    private static final long serialVersionUID = 1L;
    private Thread t;
    private static java.awt.Color[] color = {Color.BLACK,Color.PINK,Color.LIGHT_GRAY,Color.YELLOW,Color.BLUE,Color.red};
    private static final Random rand = new Random();
    private static java.awt.Color getC(){
       return  color[rand.nextInt(color.length)];
    }
    public SleepMethodTest(){
        t = new Thread(new Draw());
        t.start();
    }
    class Draw implements Runnable{
        int x = 30;
        int y = 50;
        public void run(){
            while (true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Graphics graphics = getGraphics();
                graphics.setColor(getC());
                graphics.drawLine(x,y,100,y++);
                if (y>=80){
                    y= 50;
                }
            }
        }
    }

    public static void main(String[] args) {
        init(new  SleepMethodTest(),100,100);
    }
    public static void init(JFrame frame,int width,int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setVisible(true);
    }
}
