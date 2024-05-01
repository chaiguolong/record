public class ThreadDaemon {
	public static void main(String[] args) throws Exception{
		ThreadTest tt = new ThreadTest();
		Thread t = new Thread(tt);
		t.setDaemon(true);
		t.start();
		Thread.sleep(30);
	}
	
}

class ThreadTest implements Runnable{
	public void run(){
		while (true) {
			System.out.println(Thread.currentThread().getName()+"is running...");
		}
	}
}
