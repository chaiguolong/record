package org.lxh.demo.helloserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import java.io.InputStream;

public class HelloClient01 {
	public static void main(String[] args) throws Exception {
		//表示连接的主机和端口
		Socket client = new Socket("localhost", 8888);
		BufferedReader buf = null;
		// byte[] buf = new byte[1024];

		buf = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
		InputStream in = client.getInputStream();
		//接收回应的内容
		String str = buf.readLine();
		// int len = in.read(buf);
		// String str = new String(buf, 0, len);
		System.out.println("内容是: "+str);
		client.close();
	}
	
}
