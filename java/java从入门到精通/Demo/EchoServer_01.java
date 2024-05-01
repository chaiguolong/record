import java.io.*;
import java.net.*;
public class EchoServer_01 {
	public static void main(String[] args) throws Exception {
		//在8888端口上开启服务
		ServerSocket server = new ServerSocket(8888);
		//表示连接的客户端
		Socket client = null;
		boolean flag = true;
		while (flag) {
			System.out.println("等待客户端连接...");
			//接收客户端的连接
			client = server.accept();
			BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//得到客户端的输出流
			OutputStream out = client.getOutputStream();
			PrintStream pout = new PrintStream(out);
			boolean temp = true;
			//循环接收用户输入的内容并回应
			while (temp) {
				String str = buf.readLine();
				if(str == null || "".equals(str)){
					temp = false;
					break;
				}
				if("bye".equals(str)){
					temp = false;
					break;
				}

				pout.println("ECHO:" + str);
			}
			pout.close();
			client.close();
		}
		server.close();
	}
	
}
