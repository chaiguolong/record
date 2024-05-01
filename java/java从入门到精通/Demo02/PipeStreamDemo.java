import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Sender extends Thread{
	private PipedOutputStream out = new PipedOutputStream();
	public PipedOutputStream getOutputStream(){
		return out;
	}
	public void run(){
		String s = new String("Receiver, 你好!");
		try {
			out.write(s.getBytes());
			out.close();
		} catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
class Receiver extends Thread{
	private PipedInputStream in = new PipedInputStream();
	public PipedInputStream getInputStream(){
		return in;
	}
	public void run(){
		byte[] buf = new byte[1024];
		int len = 0;
		String str = null;
		try {
			len = in.read(buf);
			str = new String(buf, 0, len);
			System.out.println("收到了以下消息:"+str);
			in.close();
		} catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
public class PipeStreamDemo {
	public static void main(String[] args) {
		Sender se = new Sender();
		Receiver re = new Receiver(); 
		PipedOutputStream pos = se.getOutputStream();
		PipedInputStream pis = re.getInputStream();
		try {
			pos.connect(pis);
		} catch(IOException e){
			e.printStackTrace();
		}
		se.start();
		re.start();
	}
}
