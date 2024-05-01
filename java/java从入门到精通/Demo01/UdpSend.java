import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

import java.net.InetAddress;

public class UdpSend {
	public static void main(String[] args) {
		//要编写UDP网络程序,首先要用到java.net.DatagramSocket类
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		try {
			ds = new DatagramSocket(3000);
		} catch(SocketException e){
			e.printStackTrace();
		}
		String str = "hello world";
		try {
			dp = new DatagramPacket(str.getBytes(), str.length(), 
					InetAddress.getByName("localhost"),9000);
			//调用getByName()方法可以返回一个InetAddress类的实例对象
		} catch(UnknownHostException e){
			e.printStackTrace();
		}

		try {
			ds.send(dp);
		} catch(IOException e){
			e.printStackTrace();
		}
		ds.close();
	}
}
