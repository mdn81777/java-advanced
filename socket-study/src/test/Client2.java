package test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端向服务器发送文本数据
 */
public class Client2 {
    public static void main(String[] args)throws IOException {
        Socket socket = new Socket("192.168.43.11",8080);
        OutputStream out =  socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要发送给服务器的内容：");
        String info = scanner.nextLine();
        out.write(info.getBytes());
        out.close();
        socket.close();
    }
}
