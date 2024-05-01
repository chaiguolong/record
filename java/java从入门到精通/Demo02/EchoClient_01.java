package org.lxh.demo.echoserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient_01 {
	public static void main(String[] args) throws IOException{
		Socket client = new Socket("localhost", 8888);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
		boolean flag = true;
		while (flag) {
			System.out.println("请输入要发送的内容: ");
			String str = br.readLine();
			if(str == null || "".equals(str)){
				flag = false;
				break;
			}
			if("bye".equals(str)){
				flag = false;
				break;
			}
			pw.println(str);
			pw.flush();
			System.out.println(buf.readLine());
		}
		client.close();

	}
	
}
