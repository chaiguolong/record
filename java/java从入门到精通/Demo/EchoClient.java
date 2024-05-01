import java.io.*;
import java.net.*;
public class EchoClient {
	public static void main(String[] args) throws IOException {
		Socket echoSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;

		try {
			echoSocket = new Socket("localhost", 1111);
			out = new PrintWriter(echoSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		} catch(UnknownHostException e){
			System.err.println("Don't know about host: localhost");
			System.exit(1);
		}

		System.out.println(in.readLine());
		System.out.println(in.readLine());
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		//将客户端Socket输入流输出到标准输出
		while ((userInput = stdIn.readLine()) != null) {
			out.println(userInput);
			System.out.println(in.readLine());
		}

		out.close();
		in.close();
		echoSocket.close();
	}
}
