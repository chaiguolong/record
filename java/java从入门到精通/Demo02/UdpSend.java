import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

import java.net.InetAddress;

public class UdpSend {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		byte[] buf = new byte[1024];

		try {
			ds = new DatagramSocket(3000);
		} catch(SocketException e){
			e.printStackTrace();
		}

		String str = "Hello world!!!";

		try {
			dp = new DatagramPacket(str.getBytes(), str.length(), 
					InetAddress.getByName("localhost"), 9000);
		} catch(UnknownHostException e){
			e.printStackTrace();
		}

		try {
			ds.send(dp);
		} catch(IOException e){
			e.printStackTrace();
		}

		ds.close();
	}
	
}
