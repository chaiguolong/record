import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class homework02_22_8_client {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader bu = null;
		BufferedReader buf = null;
		PrintWriter pw = null;

		try {
			client = new Socket("localhost", 9001);
			bu = new BufferedReader(new InputStreamReader(System.in));
			buf = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream(), true);
		} catch(UnknownHostException e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

		String str = null;
		int len = 0;
		boolean flag = true;

		try {
			while (flag) {
				str = bu.readLine();
				if(str == null || "".equals(str)){
					flag = false;
					break;
				}

				if("bye".equalsIgnoreCase(str)){
					flag = false;
					break;
				}
				pw.println(str);
				pw.flush();
				System.out.println(buf.readLine());
			}
			bu.close();
			buf.close();
			pw.close();
			client.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
