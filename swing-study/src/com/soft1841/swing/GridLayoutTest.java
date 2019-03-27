package com.soft1841.swing;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

/**
 * GridLayout网格布局
 * @author 孟妮 2019-3-27
 */
public class GridLayoutTest extends JFrame {
    //定义一个面板数组
    private JPanel[] panels;
    private JLabel timeLabel;
    private JComboBox cmb;
    private GridLayoutTest(){
        init();
        setTitle("GridLayout网格布局管理器");
        //界面启动最大化
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public  void init() {
        //将整个容器背景设置为白色
        getContentPane().setBackground(new Color(255, 255, 255));
        //定义三行九宫格，放置九个面板
        GridLayout gridLayout = new GridLayout(3, 3, 50, 30);
        setLayout(gridLayout);
        //创建面板数组
        panels = new JPanel[9];
        //循环创建每个面板的对象
        for (int i = 0; i < 9; i++) {
            panels[i] = new JPanel();
            //给面板加上边框
            panels[i].setBorder(BorderFactory.createTitledBorder("面板" + (i + 1)));
            //给面板依次加上网格布局管理器，变成九宫格
            add(panels[i]);
        }
        panels[0].setBackground(new Color(178, 223, 219));
        //在第一个面板内部加入5个按钮
        for (int i = 0; i < 5; i++) {
            panels[0].add(new JButton("JAVA"));
        }
        //设置第二个面板为BorderLayout边界布局，设置背景色
        panels[1].setLayout(new BorderLayout(20, 20));
        panels[1].setBackground(new Color(0, 172, 193));
        //5个方向加入按钮
        panels[1].add(new JButton("北"), BorderLayout.NORTH);
        panels[1].add(new JButton("南"), BorderLayout.SOUTH);
        panels[1].add(new JButton("东"), BorderLayout.EAST);
        panels[1].add(new JButton("西"), BorderLayout.WEST);
        panels[1].add(new JButton("中"), BorderLayout.CENTER);
        //设置第三个面板为GridLayout网格布局，设置背景色
        panels[2].setLayout(new GridLayout(3, 3, 10, 10));
        panels[2].setBackground(new Color(77, 182, 172));
        //依次加入9个按钮
        for (int i = 0; i < 9; i++) {
            panels[2].add(new JButton(String.valueOf(i + 1)));
        }
        //设置第4个面板
        panels[3].setLayout(new GridLayout(3, 3, 10, 10));
        panels[3].setBackground(new Color(178, 223, 219));
        //依次加入9个标签
        for (int i = 0; i < 9; i++) {
            panels[3].add(new JLabel(String.valueOf(i + 1)));
        }
        //设置第五个面板
        panels[4].setLayout(new GridLayout(3, 3, 10, 10));
        panels[4].setBackground(new Color(178, 223, 219));
        JFrame frame=new JFrame("Java下拉列表组件示例");
        JPanel jp=new JPanel();    //创建面板
        JLabel label1=new JLabel("证件类型：");    //创建标签
        JComboBox cmb=new JComboBox();    //创建JComboBox
        cmb.addItem("--请选择--");    //向下拉列表中添加一项
        cmb.addItem("身份证");
        cmb.addItem("驾驶证");
        cmb.addItem("军官证");
        jp.add(label1);
        jp.add(cmb);
        frame.add(jp);
        frame.setBounds(300,200,400,100);
        frame.setVisible(true);
        cmb.setSize(60,50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panels[4].add(cmb,BorderLayout.CENTER);
        //设置第六个面板
        panels[5].setLayout(new GridLayout(3, 3, 10, 10));
        panels[5].setBackground(new Color(178, 223, 219));
        JFrame frame1=new JFrame("学生成绩表");
        frame1.setSize(300,100);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane=frame1.getContentPane();
        Object[][] tableDate=new Object[5][8];
        for(int i=0;i<5;i++)
        {
            tableDate[i][0]="1000"+i;
            for(int j=1;j<8;j++)
            {
                tableDate[i][j]=0;
            }
        }
        String[] name={"学号","软件工程","Java","网络","总成绩"};
        JTable table=new JTable(tableDate,name);
        contentPane.add(new JScrollPane(table));
        frame1.setVisible(true);
        table.setSize(50,40);
        panels[5].add(table,BorderLayout.CENTER);
        //设置第七个面板
        panels[6].setBackground(new Color(178, 223, 219));
        panels[6].add(new JTextField("JAVA"));
        //设置第八个面板
        panels[7].setBackground(new Color(178, 223, 219));
        LocalDateTime time = LocalDateTime.now();
        timeLabel = new JLabel(String.valueOf(time));
        panels[7].add(timeLabel);
        //设置第九个面板
        panels[8].setBackground(new Color(178, 223, 219));
        //在第一个面板内部加入5个按钮
        for (int i = 0; i < 5; i++) {
            panels[8].add(new JButton("JAVA"));
        }
    }

        public static void main(String[] args) {
            //用系统样式替代Swing默认样式，会稍微好看点
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            } catch (Exception e) {
                e.printStackTrace();
            }
             new GridLayoutTest();
        }
}
