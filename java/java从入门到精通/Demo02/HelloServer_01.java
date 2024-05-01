package org.lxh.demo.helloserver;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import java.io.OutputStream;
import java.io.PrintStream;

public class HelloServer_01 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		Socket client = null;
		System.out.println("等待客户端连接...");
		client = server.accept();
		OutputStream out = client.getOutputStream();
		PrintStream pout = new PrintStream(out);
		pout.println("hello world!!!");
		pout.close();
		out.close();
		client.close();
		server.close();
	}
	
}
