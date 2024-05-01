import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloClient {
	public static void main(String[] args) throws IOException {
		Socket client = null;
		BufferedReader br = null;
		try {
			client = new Socket("localhost", 9999);
		} catch(UnknownHostException e){
			System.out.println("无法找到主机...");
		}

		br = new BufferedReader(
				new InputStreamReader(
					client.getInputStream()));
		char[] buf = new char[1024];
		int len = br.read(buf);
		System.out.println(new String(buf, 0, len));

		br.close();
		client.close();
	}
	
}
