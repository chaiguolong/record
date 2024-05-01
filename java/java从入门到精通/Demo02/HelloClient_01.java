package org.lxh.demo.helloserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class HelloClient_01 {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 8888);
		BufferedReader buf = null;
		buf = new BufferedReader(
				new InputStreamReader(client.getInputStream()));
		String str = buf.readLine();
		System.out.println("内容是: "+str);
		client.close();
	}
	
}
