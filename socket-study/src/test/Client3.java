package test;
/**
 * 客户端向服务器多次发送
 */
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.43.88",10086);
        OutputStream out = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入要发送给服务器的内容：");
            String info = scanner.nextLine();
            out.write(info.getBytes());
        }
    }
}
