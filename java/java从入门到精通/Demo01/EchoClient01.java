package org.lxh.demo.echoserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import java.io.PrintStream;

public class EchoClient01 {
	public static void main(String[] args) throws Exception {
		//表示连接的主机和端口
		Socket client = new Socket("localhost", 8888);
		BufferedReader buf = new BufferedReader(new InputStreamReader(
					System.in));
		// PrintStream ps = new PrintStream(client.getOutputStream());
		PrintWriter ps = new PrintWriter(client.getOutputStream());
		BufferedReader buf_in = new BufferedReader(
				new InputStreamReader(client.getInputStream()));
		boolean flag = true;
		while (flag) {
			System.out.println("请输入要发送的内容: ");
			String str = buf.readLine();
			if (str == null || "".equals(str)) {
				flag = false;
				break;
			}
			if("bye".equals(str)){
				flag = false;
				break;
			}
			ps.println(str);
			ps.flush();
			//接收回应的内容
			String str_in = buf_in.readLine();
			System.out.println(str_in);
		}
		client.close();
	}
	
}
