package org.lxh.demo.udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceive_01 {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		byte[] buf = new byte[1024];
		try {
			ds = new DatagramSocket(3000);
		} catch(SocketException e){
			e.printStackTrace();
		}
		dp = new DatagramPacket(buf, 1024);
		try {
			ds.receive(dp);
		} catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("接收到的内容是: "+new String(dp.getData()));

		ds.close();
	}
	
}
