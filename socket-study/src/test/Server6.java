package test;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
/**
 * 客户端向服务端发送非文本
 */
public class Server6 {
    public static void main(String[] args)throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器启动成功");
        while (true){
            Socket socket = ss.accept();
            ServerThread2 server = new ServerThread2(socket);
            new Thread(server).start();
        }
    }
}
class ServerThread2 implements Runnable{
    private Socket socket;

    public  ServerThread2(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端"+socket.getInetAddress()+"连接成功！");
        try {
            //从客户端的输入流中读
            InputStream inputStream = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(inputStream);
            //写到服务器指定路径
            File file = new File("E:/upload/"+ UUID.randomUUID().toString()+".jpg");
            OutputStream os= new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            //缓冲区
            byte[] data = new byte[1024];
            int tmp;
            while ((tmp = bis.read(data))!=-1){
                bos.write(data,0,tmp);
            }
            bos.close();
            bis.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
