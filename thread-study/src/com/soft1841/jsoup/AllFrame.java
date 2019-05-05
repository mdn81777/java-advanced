package com.soft1841.jsoup;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
/**
 * @孟妮
 * 天猫
 */
public class AllFrame  extends JFrame implements Runnable {
    private  Icon icon,icon1,icon2;
    private JMenu m1,m2,m3,m4,m5,m6;
    private JMenu n1,n2,n3,n4,n5,n6;
    public AllFrame(){
        init();
        setTitle("天猫");
        setSize(1938,1985);
        setLocationRelativeTo(null);
        //窗体大小不可变
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void run() {
    }
    private void init(){
        this.setLayout(null);
        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(1900,3400));
        JScrollPane scrollPane = new JScrollPane(jPanel);
        scrollPane.setBounds(10,10,1900,2000);
        this.getContentPane().add(scrollPane);
        //窗体布局设为空布局，需要每个组件设置定位
        jPanel.setLayout(null);
        //系统时间的标签
        Font font = new Font("微软雅黑",Font.PLAIN,21);
        JLabel timeLabel = new JLabel("系统时间");
        timeLabel.setFont(new Font("楷体",Font.PLAIN,20));
        timeLabel.setForeground(new Color(0xA8A8A8));
        timeLabel.setBounds(1000,170,220,30);
        //调用线程
        TimeThread timeThread = new TimeThread();
        timeThread.setTimeLabel(timeLabel);
        timeThread.start();
        jPanel.add(timeLabel);
        //顶部的图片
        JLabel imgLabel = new JLabel();
        imgLabel.setBounds(2,0,1940,40);
        //读入本地的图片到内存的字节数组，IO的使用
        File srcFile = new File("D:/1.png");
        InputStream inputStream;
        byte[] bytes = new byte[0];
        try {
            inputStream  = new FileInputStream(srcFile);
            bytes = new byte[(int) srcFile.length()];
            inputStream.read(bytes);
        } catch (IOException e) {
            System.out.println("IO异常");
        }
        icon = new ImageIcon(bytes);
        imgLabel.setIcon(icon);
        jPanel.add(imgLabel);
        //左面的图片
        File srcFile1 = new File("D:/2.png");
        InputStream inputStream1;
        byte[] bytes1 = new byte[0];
        try {
            inputStream1 = new FileInputStream(srcFile1);
            bytes1 = new byte[(int) srcFile1.length()];
            inputStream1.read(bytes1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO异常");
        }
        JLabel imgLabel1 = new JLabel();
        icon1 = new ImageIcon(bytes1);
        imgLabel1.setIcon(icon1);
        imgLabel1.setBounds(162,-29,400,400);
        jPanel.add(imgLabel1);
        //右面的图片
        File srcFile2 = new File("D:/3.png");
        InputStream inputStream2;
        byte[] bytes2 = new byte[0];
        try {
            inputStream2 = new FileInputStream(srcFile2);
            bytes2 = new byte[(int) srcFile2.length()];
            inputStream2.read(bytes2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO异常");
        }
        JLabel imgLabel2 = new JLabel();
        icon2 = new ImageIcon(bytes2);
        imgLabel2.setIcon(icon2);
        imgLabel2.setBounds(1855,10,44,280);
        jPanel.add(imgLabel2);
        //搜索框
        JTextField inputField = new JTextField("搜索 天猫 商品 /品牌 /店铺");
        inputField.setBorder(BorderFactory.createLineBorder(new Color(0xFF0036)));
        inputField.setFont(font);
        inputField.setForeground(new Color(192, 192, 192));
        inputField.setBounds(570,90,600,55);
        jPanel.add(inputField);
        //搜索按钮
        JButton inputButton = new JButton("搜索");
        //设置文字的颜色（即前景色）
        inputButton.setForeground(new Color(0xFFFFFF));
        //设置background颜色
        inputButton.setBackground(new Color(255, 0, 54));
        //foreground设置透明
        inputButton.setOpaque(true);
        //最后显示红色
        inputButton.setBorderPainted(false);
        Font font1 = new Font("微软雅黑",Font.PLAIN,22);
        inputButton.setFont(font1);
        inputButton.setBounds(1170,90,180,55);
        jPanel.add(inputButton);
        //图片的轮播
        JLabel bgLabel = new JLabel();
        bgLabel.setBounds(0,250,1920,680);
        AllThread at = new AllThread();
        at.setBgLabel(bgLabel);
        //调用线程
        new Thread(at).start();
        jPanel.add(bgLabel);
        //菜单
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(570,160,400,50);
        menuBar.setForeground(new Color(0xB12328));
        menuBar.setBackground(new Color(0xF2F2F2));
        menuBar.setFont(font);
        jPanel.add(menuBar);
        JMenu menu1 = new JMenu("女装");
        menu1.setForeground(new Color(0xA8A8A8));
        JMenu menu2 = new JMenu("男装");
        menu2.setForeground(new Color(0xA8A8A8));
        JMenu menu3 = new JMenu("女鞋");
        menu3.setForeground(new Color(0xA8A8A8));
        JMenu menu4 = new JMenu("男鞋");
        menu4.setForeground(new Color(0xA8A8A8));
        JMenu menu5 = new JMenu("美妆");
        menu5.setForeground(new Color(0xA8A8A8));
        JMenu menu6 = new JMenu("腕表");
        menu6.setForeground(new Color(0xA8A8A8));
        JMenu menu7 = new JMenu("数码");
        menu7.setForeground(new Color(0xA8A8A8));
        JMenu menu8 = new JMenu("母婴");
        menu8.setForeground(new Color(0xA8A8A8));
        JMenu menu9 = new JMenu("水果");
        menu9.setForeground(new Color(0xA8A8A8));
        JMenu menu10 = new JMenu("家电");
        menu10.setForeground(new Color(0xA8A8A8));
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);
        menuBar.add(menu5);
        menuBar.add(menu6);
        menuBar.add(menu7);
        menuBar.add(menu8);
        menuBar.add(menu9);
        menuBar.add(menu10);
        JMenuItem item1 = new JMenuItem("GUCCI");
        JMenuItem item2 = new JMenuItem("ONLY");
        JMenuItem item3 = new JMenuItem("ZARA");
        JMenuItem item4 = new JMenuItem("UR");
        JMenuItem item5 = new JMenuItem("唐狮");
        JMenuItem item6 = new JMenuItem("森马");
        JMenuItem item7 = new JMenuItem("ADIDAS");
        JMenuItem item8 = new JMenuItem("HM");
        JMenuItem item9 = new JMenuItem("GXG");
        JMenuItem item10 = new JMenuItem("GAP");
        JMenuItem item11 = new JMenuItem("雅戈尔");
        JMenuItem item12 = new JMenuItem("七匹狼");
        JMenuItem item13 = new JMenuItem("Keds");
        JMenuItem item14 = new JMenuItem("ASH");
        JMenuItem item15 = new JMenuItem("UN");
        JMenuItem item16 = new JMenuItem("艾今");
        JMenuItem item17 = new JMenuItem("ECCO");
        JMenuItem item18 = new JMenuItem("teva");
        JMenuItem item19 = new JMenuItem("乐步");
        JMenuItem item20 = new JMenuItem("沙驰");
        JMenuItem item21 = new JMenuItem("innisfree");
        JMenuItem item22 = new JMenuItem("卡姿兰");
        JMenuItem item23 = new JMenuItem("自然堂");
        JMenuItem item24 = new JMenuItem("佰草集");
        JMenuItem item25 = new JMenuItem("CK");
        JMenuItem item26 = new JMenuItem("DW");
        JMenuItem item27 = new JMenuItem("卡西欧");
        JMenuItem item28 = new JMenuItem("聚利时");
        JMenuItem item29 = new JMenuItem("SONY");
        JMenuItem item30 = new JMenuItem("三星");
        JMenuItem item31 = new JMenuItem("苹果");
        JMenuItem item32 = new JMenuItem("小米");
        JMenuItem item33 = new JMenuItem("aptamil");
        JMenuItem item34 = new JMenuItem("雀巢");
        JMenuItem item35 = new JMenuItem("惠氏");
        JMenuItem item36 = new JMenuItem("美赞臣");
        JMenuItem item37 = new JMenuItem("牛百岁");
        JMenuItem item38 = new JMenuItem("tip top");
        JMenuItem item39 = new JMenuItem("格林豪");
        JMenuItem item40 = new JMenuItem("哈根达斯");
        JMenuItem item41 = new JMenuItem("格力");
        JMenuItem item42 = new JMenuItem("美的");
        JMenuItem item43 = new JMenuItem("美菱");
        JMenuItem item44 = new JMenuItem("海尔");
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        menu1.add(item5);
        menu1.add(item6);
        menu2.add(item7);
        menu2.add(item8);
        menu2.add(item9);
        menu2.add(item10);
        menu2.add(item11);
        menu2.add(item12);
        menu3.add(item13);
        menu3.add(item14);
        menu3.add(item15);
        menu3.add(item16);
        menu4.add(item17);
        menu4.add(item18);
        menu4.add(item19);
        menu4.add(item20);
        menu5.add(item21);
        menu5.add(item22);
        menu5.add(item23);
        menu5.add(item24);
        menu6.add(item25);
        menu6.add(item26);
        menu6.add(item27);
        menu6.add(item28);
        menu7.add(item29);
        menu7.add(item30);
        menu7.add(item31);
        menu7.add(item32);
        menu8.add(item33);
        menu8.add(item34);
        menu8.add(item35);
        menu8.add(item36);
        menu9.add(item37);
        menu9.add(item38);
        menu9.add(item39);
        menu9.add(item40);
        menu10.add(item41);
        menu10.add(item42);
        menu10.add(item43);
        menu10.add(item44);
        menu1.addSeparator();
        //直接从包里面获取图片
        ImgPanel1 imgPanel1 = new ImgPanel1();
        imgPanel1.setBounds(1500,87,170,130);
        imgPanel1.setImgPath("13.jpg");
        //天猫秒杀的标签
        JLabel tianmaoLabel = new JLabel("天猫秒杀");
        tianmaoLabel.setForeground(new Color(255, 50, 58));
        tianmaoLabel.setBounds(1522,38,170,50);
        Font font4 = new Font("微软雅黑",Font.PLAIN,30);
        tianmaoLabel.setFont(font4);
        jPanel.add(tianmaoLabel);
        //倒计时的标签
        JLabel timeJLabel1 = new JLabel();
        timeJLabel1.setFont(new Font("楷体",Font. BOLD,29));
        timeJLabel1.setBounds(1521,136,170,200);
        //调用倒计时线程
        Time1 time1 = new Time1();
        time1.setTime(timeJLabel1);
        time1.start();
        JPanel timeJPanel1 = new JPanel();
        timeJPanel1.add(timeJLabel1);
        imgPanel1.add(timeJPanel1);
        jPanel.add(timeJLabel1);
        jPanel.add(imgPanel1);
        //登录按钮
        JButton button = new JButton("登录 / 注册");
        button.setBackground(new Color(0xFFFFFF));
        button.setFont(new Font("微软雅黑",Font.PLAIN,19));
        button.setBounds(1230,160,120,50);
        button.setForeground(new Color(0xFFFFFF));
        button.setBackground(new Color(0xFF0036));
        button.setBorder(BorderFactory.createLineBorder(new Color(0xFF335E)));
        jPanel.add(button);
        //按钮监听
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "将进入登录或注册！");
                new MainFrame();
                setVisible(false);
            }
        });
        //商品信息标签
        JLabel shangpinLabel= new JLabel("商品信息");
        shangpinLabel.setFont(new Font("微软雅黑",Font.PLAIN,30));
        shangpinLabel.setBounds(160,1230,170,70);
        jPanel.add(shangpinLabel);
        //文本域
        JTextArea textArea = new JTextArea();
        textArea.setLayout(new FlowLayout(FlowLayout.LEFT,0,30));
        textArea.setForeground(new Color(110,110,110));
        textArea.setFont(font);
        jPanel.add(textArea);
        textArea.setBounds(160,1320,1540,100);
        //调用爬取的线程
        CrawlThread crawl = new CrawlThread();
        crawl.setTextArea(textArea);
        new Thread(crawl).start();
        //排行榜的内容
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(3,1,20,20));
        textPanel.setBounds(160,1000,1540,220);
        textPanel.setBackground(new Color(255, 255, 255));
        JLabel paihangLabel = new JLabel("排行榜");
        paihangLabel.setFont(new Font("微软雅黑",Font.PLAIN,30));
        paihangLabel.setBounds(160,915,150,100);
        jPanel.add(paihangLabel);
        //创建list集合将所有数据显示在界面
        java.util.List<String> list = new ArrayList<>();
        list.add("1  奥克斯（AUX） FS1613 电风扇/空气循环/落地扇/家用静音风扇/五叶大风量风扇");
        list.add("2  美的（Midea）FS40-13ER 五叶遥控落地扇/电风扇");
        list.add("3  艾美特（Airmate）电风扇 家用落地扇 五叶静音 FSW65T2-5");
        for (int i = 0, len = list.size(); i < len; i++){
            JLabel textLabel = new JLabel();
            textLabel.setText(list.get(i));
            textLabel.setFont(font);
            textLabel.setForeground(new Color(110, 110, 110));
            textPanel.add(textLabel);
        }
        jPanel.add(textPanel);
        //我的购物车相关内容
        JLabel fileLabel = new JLabel("我的购物车");
        fileLabel.setFont(new Font("微软雅黑",Font.PLAIN,25));
        fileLabel.setBounds(160,1420,200,100);
        jPanel.add(fileLabel);
        JTextArea fileArea = new JTextArea();
        fileArea.setFont(font1);
        jPanel.add(fileArea);
        fileArea.setBounds(160,1510,1540,270);
        fileArea.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        JButton fileButton  = new JButton("赶紧选购吧！");
        fileButton.setBackground(new Color(255, 0, 54));
        fileButton.setBorder(BorderFactory.createLineBorder(new Color(0xFF335E)));
        fileButton.setForeground(new Color(0xE8E8E8));
        fileButton.setBounds(160,1810,170,60);
        fileButton.setFont(font);
        //按钮实现监听，内容可以写到本地
        fileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fileString  = fileArea.getText();
                char[] chars = fileString.toCharArray();
                File destFile1 = new File("D:/tianmao.txt");
                try {
                    Writer out1 = new FileWriter(destFile1,true);
                    out1.write(chars);
                    out1.close();

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        jPanel.add(fileButton);
    }
}

