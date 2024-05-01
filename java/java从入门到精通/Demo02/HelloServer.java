import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
	public static void main(String[] args) {
		ServerSocket server = null;
		PrintWriter out = null;
		Socket client = null;
		try {
			server = new ServerSocket(9999);
			client = server.accept();
			out = new PrintWriter(client.getOutputStream());
			out.write("Hello world!!!");
		} catch(Exception e){
			e.printStackTrace();
		}

		out.close();
		try {
			client.close();
			server.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
