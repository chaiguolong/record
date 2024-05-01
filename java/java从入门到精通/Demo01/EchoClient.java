import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	public static void main(String[] args) throws IOException {
		Socket clientsocket = null;
		PrintWriter out = null;
		BufferedReader in = null;

		try {
			clientsocket = new Socket("127.0.0.1", 1111);
			in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
			out = new PrintWriter(clientsocket.getOutputStream(), true);
		} catch(UnknownHostException e){
			System.err.println("Don't know about host:localhost");
			System.exit(1);
		}

		System.out.println(in.readLine());
		System.out.println(in.readLine());
		BufferedReader stdIn =
			new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		//将客户端Socket输入流输出到标准输出上
		while ((userInput = stdIn.readLine()) != null) {
			out.println(userInput);
			System.out.println(in.readLine());
		}

		out.close();
		in.close();
		clientsocket.close();

	}
	
}
