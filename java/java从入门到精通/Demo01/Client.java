import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception{
		Socket client = new Socket("localhost", 9000);
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(client.getOutputStream());
		BufferedReader buf_in = new BufferedReader(
				new InputStreamReader(client.getInputStream()));
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
			pw.println(str);
			pw.flush();
			System.out.println(buf_in.readLine());
		}
		buf.close();
		pw.close();
		buf_in.close();
	}
	
}
