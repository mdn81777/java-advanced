package test;
/**
 * 利用多线程
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server5 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true){
            Socket socket = ss.accept();
            ServerThread20 serverThread20 = new ServerThread20(socket);
            new Thread(serverThread20).start();
        }
    }
}
class ServerThread20 implements Runnable{
    private Socket socket;
    public  ServerThread20(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        System.out.println("客户端"+socket.getInetAddress()+"连接成功！");
    }
}
