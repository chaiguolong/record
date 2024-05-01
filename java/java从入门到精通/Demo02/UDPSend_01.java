package org.lxh.demo.udpdemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend_01 {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(9000);
		String str = "hello world!!!";
		DatagramPacket dp = new DatagramPacket(
				str.getBytes(), str.length(), InetAddress.getByName("localhost"), 3000);
		ds.send(dp);
	}
	
}
