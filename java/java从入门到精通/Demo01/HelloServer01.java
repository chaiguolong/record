package org.lxh.demo.helloserver;
import java.io.OutputStream;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer01 {
	public static void main(String[] args) throws Exception {
		//在8888端口上开启服务
		ServerSocket serversocket = new ServerSocket(8888);
		//表示连接的客户端
		Socket clientsocket = null;
		System.out.println("等待客户端连接:... ");
		//接收客户端的连接
		clientsocket = serversocket.accept();
		//得到客户端的输出流
		OutputStream out = clientsocket.getOutputStream();
		PrintWriter pout = new PrintWriter(out);
		// out.write("hello world!!!".getBytes());
		pout.println("hello world!!!");
		pout.close();
		out.close();
		clientsocket.close();
		serversocket.close();
	}
	
}
