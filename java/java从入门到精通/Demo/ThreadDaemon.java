public class ThreadDaemon {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		Thread tt = new Thread(t);
		tt.setDaemon(true);
		tt.start();
		try {
			Thread.sleep(40);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

class ThreadTest implements Runnable{
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName()+"is running...");
		}
	}
}
