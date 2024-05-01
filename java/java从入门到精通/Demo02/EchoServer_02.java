package org.lxh.demo.echothreadserver;

import java.io.IOException;
import java.net.ServerSocket;

import org.lxh.demo.echothreadserver.*;

public class EchoServer_02 {
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(8888);
		boolean flag = true;
		while (flag) {
			System.out.println("等待客户端连接...");
			new Thread(new EchoThread_01(server.accept())).start();
		}
		server.close();
	}
	
}
