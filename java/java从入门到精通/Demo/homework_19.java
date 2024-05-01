class TestThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"在运行......");
	}
}
public class homework_19 {
	public static void main(String[] args) {
		TestThread t = new TestThread();
		Thread tt = new Thread(t);
		tt.start();
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e){
			e.getMessage();
		}
			Thread.interrupted();
			System.out.println(Thread.currentThread().getName()+"在运行...");
	}
	
}
