import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException{
		ServerSocket server = null;
		Socket client = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			server = new ServerSocket(8888);
			//与客户端连接,获得衣蛾客户端socket.
			client = server.accept();
		} catch(IOException e){
			System.out.println("无法监听该端口,端口可能被占用...");
		}
		br = new BufferedReader(
				new InputStreamReader(
					client.getInputStream()));
		pw = new PrintWriter(client.getOutputStream(), true);
		String str = null;
		boolean flag = true;

		while (flag) {
			str = br.readLine();
			System.out.println("服务端接收到的数据: "+str);
			if(str == null || "".equals(str)){
				flag = false;
				break;
			}
			if(str.equalsIgnoreCase("BYE")){
				flag = false;
				break;
			}
			//向客户端写入字符串
			pw.print("Echo:" + str);
			pw.flush();
		}
		//收尾工作.
		client.close();
		pw.close();
		br.close();
		server.close();
	}
	
}
