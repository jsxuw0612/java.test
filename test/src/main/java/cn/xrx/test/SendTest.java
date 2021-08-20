package cn.xrx.test;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @author Administrator
 */
public class SendTest {

    public static void main(String[] args) throws IOException {

            DatagramSocket ds = new DatagramSocket();

            String msg = "hello..UDP我来了。。。";
            byte[] bs = msg.getBytes(StandardCharsets.UTF_8);

            InetAddress address = InetAddress.getByName("127.0.0.1");

            int port = 12345;

            DatagramPacket dp = new DatagramPacket(bs, bs.length, address, port);

            ds.send(dp);
            System.out.println("已发送");

            ds.close();




    }

}
