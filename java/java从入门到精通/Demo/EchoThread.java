import java.io.*;
import java.net.*;
public class EchoThread implements Runnable{
	private Socket client;
	public EchoThread(Socket client){
		this.client = client;
	}

	public void run(){
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//得到客户端的输出流
			PrintStream pout = new PrintStream(client.getOutputStream());
			boolean temp = true;
			while (temp) {
				String str = buf.readLine();
				if(str == null || "".equals(str)){
					temp = false;
					break;
				}

				if("bye".equals(str)){
					temp = false;
					break;
				}
				pout.println("ECHO:" + str);
			}
			pout.close();
			client.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
