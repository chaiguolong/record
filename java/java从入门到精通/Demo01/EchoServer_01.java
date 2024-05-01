package org.lxh.demo.echoserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import java.io.OutputStream;
import java.io.PrintStream;

public class EchoServer_01 {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(8888);
		Socket client = null;
		boolean flag = true;
		while (flag) {
			System.out.println("等待客户端连接...");
			client = server.accept();
			BufferedReader buf = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			OutputStream out = client.getOutputStream();
			// PrintStream ps = new PrintStream(out);
			PrintWriter ps = new PrintWriter(out);
			boolean temp = true;
			while (temp) {
				String str = buf.readLine();
				if(str == null || "".equals(str)){
					temp = false;
					break;
				}
				if("bye".equals(str)){
					temp = false;
					break;
				}
				ps.println("Echo: "+str);
				ps.flush();
			}
			ps.close();
			out.close();
			client.close();
		}
		server.close();
	}
	
}
