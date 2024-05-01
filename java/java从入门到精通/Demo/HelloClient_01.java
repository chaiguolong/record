import java.io.*;
import java.net.*;
public class HelloClient_01 {
	public static void main(String[] args) throws Exception {
		//表示连接的主机及接口
		Socket client = new Socket("localhost", 8888);
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String str = buf.readLine();
		System.out.println("内容是: "+ str);
		client.close();
		
	}
	
}
