class ThreadTest implements Runnable{
	public void run(){
		while (true) {
			System.out.println(Thread.currentThread().getName()+"is running...");
		}
	}
}
public class ThreadDaemon {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		Thread t = new Thread(tt);
		t.setDaemon(true);
		t.start();
	}
	
}
