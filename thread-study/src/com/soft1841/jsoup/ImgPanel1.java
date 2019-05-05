package com.soft1841.jsoup;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


class ImgPanel1 extends JPanel{
    private String imgPath;

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    protected void paintComponent(Graphics g) {
        String basePath = System.getProperty("user.dir");
        Image bg = null;
        try {
            bg = ImageIO.read(new File(basePath + "/thread-study/src/img/" + imgPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
}


