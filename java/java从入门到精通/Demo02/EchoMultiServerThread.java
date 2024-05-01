import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoMultiServerThread extends Thread{
	private Socket socket = null;
	public EchoMultiServerThread(Socket socket){
		super("EchoMultiServerThread");
		//声明一个socket对象
		this.socket = socket;
	}
	public void run(){
		try {
			PrintWriter pw = null;
			BufferedReader br = null;
			pw = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			pw.println("Hello!...");
			pw.println("Entry BYE to exit");
			pw.flush();
			while (true) {
				String str = br.readLine();
				if(str == null){
					break;
				}
				else{
					pw.println("Echo: "+str);
					pw.flush();
					if(str.trim().equalsIgnoreCase("BYE")){
						break;
					}
				}
			}

			pw.close();
			br.close();
			socket.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
