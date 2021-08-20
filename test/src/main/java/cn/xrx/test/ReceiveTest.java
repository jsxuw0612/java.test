package cn.xrx.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Administrator
 */
public class ReceiveTest {
    public static void main(String[] args) throws IOException {
//        DatagramSocket ds = new DatagramSocket(12345);
//
//        byte[] bs = new byte[1024];
//        int len = bs.length;
//
//        DatagramPacket dp = new DatagramPacket(bs, len );
//
//        ds.receive(dp);
//
//        byte[] b = dp.getData();
//        int le = dp.getLength();
//
//        String str = new String(b, 0, le);
//
//        System.out.println("接收成功");
//        System.out.println(str);
//
//        ds.close();

        DatagramPacket dp = new DatagramPacket(new byte[1024], new byte[1024].length);

        DatagramSocket ds = new DatagramSocket(12345);

        ds.receive(dp);

        InetAddress address = InetAddress.getLocalHost();

        String str = new String(dp.getData(),0,dp.getLength());

        System.out.println("接收成功。。来自" + address.getHostAddress());
        System.out.println(str);

        ds.close();
    }
}
