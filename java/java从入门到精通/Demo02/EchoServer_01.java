package org.lxh.demo.echoserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer_01 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		Socket client = null;
		boolean flag = true;
		while (flag) {
			System.out.println("等待客户端连接...");
			client = server.accept();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
			boolean temp = true;
			while (temp) {
				String str = br.readLine();
				if(str == null || "".equals(str)){
					temp = false;
					break;
				}
				if("bye".equals(str)){
					temp = false;
					break;
				}
				pw.println("Echo: "+str);
				pw.flush();
			}
			pw.close();
			client.close();
		}
		server.close();
	}
	
}
