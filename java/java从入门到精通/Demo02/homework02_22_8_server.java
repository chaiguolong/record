import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class homework02_22_8_server {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		BufferedReader buf = null;
		PrintWriter pw = null;

		try {
			server = new ServerSocket(9001);
			client = server.accept();
			buf = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream(), true);
			boolean flag = true;
			String str = null;
			System.out.println("++++++++++");
			while (flag) {
				str = buf.readLine();
				System.out.println(str);
				if (str == null || "".equals(str)) {
					flag = false;
					break;
				}
				if("bye".equals(str)){
					flag = false;
					break;
				}
				pw.println("客户端: "+ str);
				pw.flush();
			}
			buf.close();
			pw.close();
			client.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
