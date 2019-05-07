package test;
import java.io.*;
import java.net.Socket;
/**
 * 客户端向服务端发送非文本
 */
public class Client6 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("192.168.43.11",10086);
        System.out.println("成功连上服务器");
        //客户端需要发送的文件，先通过字节输入流读入字节数组b
        File file = new File("D:/1.jpg");
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        is.read(b);
        //将数组b通过缓冲字节输出流传送出去
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        bos.write(b);
        is.close();
        bos.close();
    }
}
