package com.soft1841.io;


import javax.swing.*;

public class ImageThread extends Thread {
    private JLabel imageLabel;

    public void setImageLabel(JLabel imageLabel){
        this.imageLabel = imageLabel;
    }
    @Override
    public void run() {
        String[] imgPath = {"1.jpg","3.jpg","4.jpg"};
        while (true){
            for(int i = 0; i < imgPath.length; i++){
                Icon icon = new ImageIcon(NumThread.class.getResource("/img/" + imgPath[i]));
                imageLabel.setIcon(icon);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                if (i == imgPath.length - 1){
                    i = 0;
                }
            }
        }
    }
}
