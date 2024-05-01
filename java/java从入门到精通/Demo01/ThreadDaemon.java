public class ThreadDaemon {
	public static void main(String[] args){
		ThreadTest t = new ThreadTest();
		Thread t1 = new Thread(t);
		t1.setDaemon(true);
		t1.start();
	}
	
}

class ThreadTest implements Runnable{
	public void run(){
		while (true) {
			System.out.println(Thread.currentThread().getName()+"is running.");
		}
	}
}
