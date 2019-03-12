package com.java.util;
/**
 * 随机颜色
 *  @author 孟妮 2019年3月12日
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
public class RandomColor {
    public static void main(String[] args) throws IOException {
        //生成随机种子
        Random random = new Random();
        //生成RedRandom
        int redRandom = random.nextInt(256);
        //生成Random随机值
        int greenRandom = random.nextInt(256);
        //生成blueRandom随机值
        int blueRandom = random.nextInt(256);
        System.out.println("R:"+ redRandom + ",G:" + greenRandom + ",B:" + blueRandom);
        //开始用随机色值绘制图片
        //在图片缓冲1区生成一个图片对象
        BufferedImage bufferedImage = new BufferedImage(120,40,BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("微软雅黑",Font.BOLD,16);
        g.setFont(font);
        //设置画笔颜色
        Color color = new Color(redRandom,greenRandom,blueRandom);
        g.setColor(color);

        //开始绘制矩形，充满图片缓冲区
        g.fillRect(0,0,120,40);
        //绘制文字
        g.setColor(Color.BLACK);
        g.drawString("验证码:",0,15);
        //输出图片
        //指定图片路径
        File file = new File("D:/code.jpg");
        //获取字节输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节流写到文案金
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //关闭输出流
        outputStream.close();
        }
}
