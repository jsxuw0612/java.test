package cn.xrx.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端
 * @author Administrator
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",10001);
        try {
            OutputStream os = s.getOutputStream();
            os.write("这是TCP发送的数据".getBytes());
            System.out.println("发送成功");
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 服务端
 * @author Administrator
 */
class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);
        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip);

        InputStream is= s.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String str = new String(buf,0,len);
//        System.out.println(new String(buf,0,len));
        System.out.println("来自" + ip + "-->" + str);
        is.close();
        s.close();
        ss.close();
    }
}
