package org.lxh.demo.echothreadserver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoThread_01 implements Runnable{
	private Socket client;
	public EchoThread_01(Socket client){
		this.client = client;
	}
	public void run(){
		try {
			BufferedReader buf = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
			boolean temp = true;
			while (temp) {
				String str = buf.readLine();
				if(str == null || "".equals(str)){
					temp = false;
					break;
				}

				if("bye".equalsIgnoreCase(str)){
					temp = false;
					break;
				}
				//向客户端输出
				pw.println("Echo: "+str);
				pw.flush();
			}
			pw.close();
			buf.close();
			client.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
