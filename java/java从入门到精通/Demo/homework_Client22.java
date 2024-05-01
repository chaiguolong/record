import java.io.*;
import java.net.*;
public class homework_Client22 {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("localhost", 9999);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		PrintStream out = new PrintStream(client.getOutputStream());
		boolean flag = true;
		while (flag) {
			System.out.println("请输入要发送的内容: ");
			//发送要请求的内容
			String str = input.readLine();
			if(str == null || "".equals(str)){
				flag = false;
				break;
			}
			if("bye".equalsIgnoreCase(str)){
				flag = false;
				break;
			}

			out.println(str);
			//接收回应的内容
			System.out.println(buf.readLine());
		}
		client.close();
	}
	
}
