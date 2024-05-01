import java.io.*;
import java.net.*;
public class HelloServer_01 {
	public static void main(String[] args) throws Exception {
		//在8888端口上开启服务
		ServerSocket server = new ServerSocket(8888);
		//表示连接的客户端
		Socket client = null;
		System.out.println("等待客户端连接...");
		//接收客户端的连接
		client = server.accept();
		//得到客户端的输出流
		OutputStream out = client.getOutputStream();
		PrintStream pout = new PrintStream(out);
		pout.println("hello world!!!");
		pout.close();
		out.close();
		client.close();
		server.close();
	}
	
}
