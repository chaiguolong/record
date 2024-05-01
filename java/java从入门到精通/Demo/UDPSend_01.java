import java.net.*;
public class UDPSend_01 {
	public static void main(String[] args) throws Exception {
		//服务器端在9000端口等待接收客户端发来的信息
		DatagramSocket socket = new DatagramSocket(9000);
		String str = "hello world!!!";
		//向3000端口发送消息
		DatagramPacket pack = new DatagramPacket(str.getBytes(), 0, str.length(), InetAddress.getLocalHost(), 3000); 
		socket.send(pack);
	}
	
}
