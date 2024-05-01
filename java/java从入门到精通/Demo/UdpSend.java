import java.net.*;
import java.io.*;
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
			dp = new DatagramPacket(str.getBytes(), str.length(),InetAddress.getByName("localhost"),9000);
			//调用getByName()方法可以返回一个InetAddress类的实例对象
		} catch(UnknownHostException e){
			e.printStackTrace();
		}

		try {
			ds.send(dp);
		} catch(IOException e2){
			e2.printStackTrace();
		}

		ds.close();
	}
	
}
