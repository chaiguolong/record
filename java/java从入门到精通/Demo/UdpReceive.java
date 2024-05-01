import java.net.*;
import java.io.*;
public class UdpReceive {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		byte[] buf = new byte[1024];
		DatagramPacket dp = null;
		try {
			ds = new DatagramSocket(9000);
		} catch(SocketException e){
			e.printStackTrace();
		}

		//创建DatagramPacket时,要求的数据格式是byte型数组
		dp = new DatagramPacket(buf, 1024);
		try{
			ds.receive(dp);
		}catch(IOException ex1){

		}

		/*
		 * 调用public String(byte[] bytes,int offset, int length)构造方法,
		 * 将byte型的数组转换成字符串
		 */
		String str = new String(dp.getData(), 0, dp.getLength())+"from"+dp.getAddress().getHostAddress()+":"+dp.getPort();

		System.out.println(str);
		ds.close();
	}
	
}
