import java.io.*;
import java.net.*;
public class homework_Server22 {
	public static void main(String[] args) throws Exception {
		//创建一个监听端口(9000)的服务端的socket
		ServerSocket server = new ServerSocket(9999);
		//声明一个客户端的socket
		Socket client;
		//返回客户端的socket
		System.out.println("服务端正在等待连接......");
		client = server.accept();
		BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		PrintStream pout = new PrintStream(client.getOutputStream());
		boolean flag = true;
		while (flag) {
			String str = buf.readLine();
			if(str == null || "".equals(str)){
				flag = false;
				break;
			}
			if("bye".equalsIgnoreCase(str)){
				flag = false;
				break;
			}

			pout.println("客户端: " + str);
		}

		pout.close();
		buf.close();
		client.close();
		server.close();
	}
	
}
