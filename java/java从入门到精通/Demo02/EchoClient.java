import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	public static void main(String[] args) throws IOException{
		Socket client = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		BufferedReader br_server = null;

		try {
			client = new Socket("localhost", 1111);
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(client.getOutputStream(), true);
			br_server = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
		} catch(UnknownHostException e){
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

		String str = null;
		int len = 0;
		char[] buf = new char[1024];
		boolean flag = true;
		while (flag) {
			str = br.readLine();
			if(str == null || "".equals(str)){
				flag = false;
				break;
			}
			if(str.equalsIgnoreCase("BYE")){
				flag = false;
				break;
			}
			pw.println(str);
			pw.flush();
			len = br_server.read(buf);
			System.out.println(new String(buf, 0, len));
		}

		br_server.close();
		pw.close();
		br.close();
		client.close();
	}
	
}
