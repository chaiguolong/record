package org.lxh.demo.echothreadserver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoThread implements Runnable{
	private Socket client;
	public EchoThread(Socket client){
		this.client = client;
	}
	public void run(){
		try {
			System.out.println("++++++++++++");
			BufferedReader buf = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			System.out.println("============");
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			boolean flag = true;
			while (flag) {
				String str = buf.readLine();
				if(str == null || "".equals(str)){
					flag = false;
					break;
				}
				if(str.equalsIgnoreCase("BYE")){
					flag = false;
					break;
				}
				pw.println("Echo: "+str);
				pw.flush();
			}

			buf.close();
			pw.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
