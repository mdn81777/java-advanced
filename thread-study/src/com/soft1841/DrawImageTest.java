package com.soft1841;
import javax.swing.*;
import java.awt.*;

public class DrawImageTest extends JFrame {
    public DrawImageTest() {
        //设置窗体大小
        this.setSize(700, 600);
        //设置窗体关闭模式
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体面板为绘图面板对象
        add(new CanvasTest());
        //设置窗体标题
        this.setTitle("绘制图像");
    }
    public static void main(String[] args) {
        new DrawImageTest().setVisible(true);
    }
    class CanvasTest extends Canvas {
        //创建画布
        public void paint(Graphics g) {
            super.paint(g);
            //创建绘图对象
            Graphics2D g2 = (Graphics2D) g;
            //获取图片资源
            Image img = new ImageIcon(this.getClass().getResource("/img/3.jpg")).getImage();
            //显示图片
            g2.drawImage(img, 0, 0, this);
        }
    }
}
