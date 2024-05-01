import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Sender extends Thread{
	private PipedOutputStream out = new PipedOutputStream();
	public PipedOutputStream getOutputStream(){
		return out;
	}
	public void run(){
		String str = new String("Receiver, 你好!");
		try {
			out.write(str.getBytes());
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
		try {
			len = in.read(buf);
		} catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(new String(buf, 0, len));
		try {
			in.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
public class PipeStreamDemo {
	public static void main(String[] args) {
		Sender se = new Sender();
		Receiver re = new Receiver();
		PipedOutputStream out = se.getOutputStream();
		PipedInputStream in = re.getInputStream();
		try {
			out.connect(in);
		} catch(IOException e){
			e.printStackTrace();
		}
		se.start();
		re.start();
	}
	
}
