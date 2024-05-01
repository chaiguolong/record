import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9000);
		Socket client = server.accept();
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(client.getInputStream()));
		PrintWriter pw = new PrintWriter(client.getOutputStream());
		boolean flag = true;
		while (flag) {
			String str = buf.readLine();
			if (str == null || "".equals(str)) {
				flag = false;
				break;
			}
			if(str.equalsIgnoreCase("BYE")){
				flag = false;
				break;
			}
			pw.println("客户端: "+str);
			pw.flush();
		}
		buf.close();
		pw.close();
	}
}
