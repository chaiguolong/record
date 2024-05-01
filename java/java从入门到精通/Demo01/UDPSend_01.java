package org.lxh.demo.udpdemo;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend_01 {
	public static void main(String[] args) throws Exception {
		//服务器端绑定9000端口,发送信息
		DatagramSocket socket = new DatagramSocket(9000);
		String str = "Hello world!!!";
		//向3000端口发送消息
		DatagramPacket pack = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getLocalHost(), 3000);
		socket.send(pack);
		socket.close();
	}
}
