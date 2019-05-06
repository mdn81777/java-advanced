package test;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 客户端向服务器多次发送
 */
public class Server3 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器端口启动");
        while (true) {
            Socket socket = ss.accept();
            byte[] bytes = new byte[1024];
            System.out.println("客服端" + socket.getInetAddress() + "上线了");
            while (true){
                InputStream in = socket.getInputStream();
                in.read(bytes);
                System.out.println("客服端是：  " + socket.getInetAddress() + "   客服端发送的是：" + new String(bytes));
            }

        }
    }
}
