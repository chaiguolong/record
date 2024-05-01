import java.io.IOException;
import java.net.ServerSocket;

public class EchoServerThread {
	public static void main(String[] args) throws IOException{
		//声明一个serversocket
		ServerSocket server = null;
		//声明一个监听标识
		boolean listening = true;
		try {
			server = new ServerSocket(1111);
		} catch(IOException e){
			System.err.println("Could not listen on port : 1111");
			System.exit(1);
		}
		//如果处于监听状态则开启一个线程
		while (listening) {
			//实例化一个服务端的socket与请求socket建立连接
			new EchoMultiServerThread(server.accept()).start();
		}
		//将serverSocket的关闭操作放在循环外
		//只有当监听状态为false时,服务才关闭
		server.close();
	}
	
}
