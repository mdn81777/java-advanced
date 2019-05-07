package test;
import java.io.IOException;
import java.net.Socket;

/**
 * 利用多线程
 */
public class Client5 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10086);
        System.out.println(socket.getRemoteSocketAddress()+"连接成功");
    }
}
