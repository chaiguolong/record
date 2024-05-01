package org.lxh.demo.udpdemo;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive_01 {
	public static void main(String[] args) throws Exception {
		//客户端在3000端口等待接收服务器发来的信息
		DatagramSocket socket = new DatagramSocket(3000);
		//开辟1024的空间
		DatagramPacket pack = new DatagramPacket(new byte[1024], 1024);
		socket.receive(pack);
		System.out.println("接收到的内容是: " + new String(pack.getData()));

	}
	
}
