import java.io.*;
import java.net.*;
public class EchoServer_02 {
	public static void main(String[] args) throws Exception {
		//在8888端口上开启服务
		ServerSocket server = new ServerSocket(8888);
		boolean flag = true;
		while (flag) {
			System.out.println("等待客户连接...");
			new Thread(new EchoThread(server.accept())).start();
		}
		server.close();
	}
	
}
