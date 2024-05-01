import java.io.*;
import java.net.*;
//多线程服务器端程序
public class EchoServerThread{
	public static void main(String[] args)throws IOException  {
		//声明一个serverSocket
		ServerSocket serverSocket = null;
		//声明衣蛾监听标识.
		boolean listening = true;

		try {
			serverSocket = new ServerSocket(1111);
		} catch(IOException e){
			System.err.println("Couldn't listen on port: 1111");
			System.exit(1);
		}
		//如果处于监听状态,则开启一个线程
		while (listening) {
			//实例化一个服务器端的socket与请求socket建立连接
			new EchoMultiServerThread(serverSocket.accept()).start();
		}

		//将serverSocket的关闭操作放在循环外
		//只有当监听状态为false时,服务才关闭
		serverSocket.close();
	}
	
}
