import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import java.io.PrintWriter;

public class EchoMultiServerThread extends Thread{
	private Socket socket = null;
	public EchoMultiServerThread(Socket socket){
		super("EchoMultiServerThread");
			//声明一个socket对象
			this.socket = socket;
	}

	public void run(){
		try {
			PrintWriter out = null;
			BufferedReader in = null;
			out = new PrintWriter(socket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out.println("Hello!...");
			out.println("Enter BYE to exit");
			out.flush();
			while (true) {
				String str = in.readLine();
				if(str == null){
					break;
				}else{
					out.println("Echo:"+str);
					out.flush();
					if(str.trim().equalsIgnoreCase("BYE")){
						break;
					}
				}
			}
			out.close();
			in.close();
			socket.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}


	
}
